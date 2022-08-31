package com.rindraibi.website.presentation.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;


import com.rindraibi.website.business.model.dto.ResumeDTO;
import com.rindraibi.website.business.service.applicationservice.intf.ResumeASIntf;

/**
 * The class dedicated to the definition of the Controller in charge of the Resume.
 * @author Rindra Mbolamananamalala
 *
 */
@RestController
public class ResumeController extends RindraIbiController{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ResumeASIntf resumeAS;
	
	/**
	 * Returns the unique Resume used by the whole Web Application.
	 */
	@RequestMapping(value = "/resume", method = RequestMethod.GET)
	public ResumeDTO getResume() {
		String operationMessage;
		try {
			ResumeDTO resumeToReturn = this.resumeAS.getResume();
			// A Resume was successfully retrieved
			operationMessage = "Resume rerieved : " 
									+ resumeToReturn.toString();
			LOGGER.info(operationMessage);
			return this.resumeAS.getResume();			
		}catch (NullPointerException e) {
			// A NullPointer Exception was raised,
			operationMessage = "No Resume was retrieved";
			LOGGER.error(operationMessage);
			return null;
		}catch (Exception e) {
			// Another type of exception, different from a Null Pointer one, has occured
			operationMessage= "An internal error has occured";
			LOGGER.error(operationMessage);
			return null;
		}
				
	}

}
