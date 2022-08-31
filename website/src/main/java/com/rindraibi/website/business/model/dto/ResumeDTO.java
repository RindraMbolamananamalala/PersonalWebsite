package com.rindraibi.website.business.model.dto;

import java.util.List;

import com.rindraibi.website.business.model.domainobject.Identity;
import com.rindraibi.website.business.model.domainobject.Portfolio;

/**
 * The class dedicated to the definition of the Resume Data Transfer Object  
 * @author Rindra Mbolamananamalala
 *
 */
public class ResumeDTO extends RindraIbiDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Identity identity;
	
	private List<Portfolio> portfolios;
	
	public Identity getIdentity() {
		return identity;
	}

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

	public List<Portfolio> getPortfolios() {
		return portfolios;
	}

	public void setPortfolios(List<Portfolio> portfolios) {
		this.portfolios = portfolios;
	}

}
