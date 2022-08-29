package com.rindraibi.website.dataaccess.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rindraibi.website.business.model.domainobject.Portfolio;

public interface PortfolioDAO extends JpaRepository<Portfolio, String>{
	
	/**
	 * Saves and persists in DB a Portfolio
	 * @param portfolio The Portfolio to save and persist in DB
	 * @return
	 */
	public Portfolio save(Portfolio portfolio);

}
