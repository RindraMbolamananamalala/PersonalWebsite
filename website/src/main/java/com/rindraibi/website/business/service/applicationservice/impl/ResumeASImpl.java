package com.rindraibi.website.business.service.applicationservice.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rindraibi.website.business.model.domainobject.Resume;
import com.rindraibi.website.business.model.dto.ResumeDTO;
import com.rindraibi.website.business.service.applicationservice.intf.ResumeASIntf;
import com.rindraibi.website.dataaccess.dao.ResumeDAO;
import com.rindraibi.website.mapper.MapStructMapper;

/**
 * An implementation class of the Interface dedicated to any need of Application Service related 
 * to the Resume.
 * @author Rindra Mbolamananamalala
 *
 */
@Service
public class ResumeASImpl implements ResumeASIntf{

	protected final Logger LOGGER = LoggerFactory.getLogger(getClass());
	
	@Autowired
	ResumeDAO resumeDAO;
	
	@Autowired 
	MapStructMapper mapStructMapper;
	
	/**
	 * 
	 * @return The Resume DTO corresponding to the first line of Resume stored in DB.
	 */
	@Override
	public ResumeDTO getResume() throws NullPointerException{
		List<Resume> allResumesFoundInDB = this.resumeDAO.findAll();
		if(!allResumesFoundInDB.isEmpty()) {
			// At least a Resume is stored inside the DB, only the first 
			// one is used and is allowed to be used by the Application
			// (Manual Maintenance by the Owner of the WebSite's content)
			Resume resumeFoundFromDB = allResumesFoundInDB.get(0); 
			this.LOGGER.info("Resume retrieved from DB : " + resumeFoundFromDB + ".");
			return this.mapStructMapper.resumeDTO(resumeFoundFromDB);
		}
		// No Resume was found in the database
		String errorMessage = "No Resume was found in the database";
		this.LOGGER.error(errorMessage);
		throw new NullPointerException(errorMessage);
	}

}
