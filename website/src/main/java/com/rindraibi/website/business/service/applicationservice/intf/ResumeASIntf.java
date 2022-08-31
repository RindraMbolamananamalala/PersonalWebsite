package com.rindraibi.website.business.service.applicationservice.intf;

import com.rindraibi.website.business.model.dto.ResumeDTO;

/**
 * The interface class dedicated to to any need of Application Service related to the Resume.
 * @author Rindra Mbolamananamalala
 * 
 */
public interface ResumeASIntf {
	
	/**
	 * 
	 * @return The Resume DTO corresponding to the first line of Resume stored in DB.
	 */
	public ResumeDTO getResume() throws NullPointerException;

}
