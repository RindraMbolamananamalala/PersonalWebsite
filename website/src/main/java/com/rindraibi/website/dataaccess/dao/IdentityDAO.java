package com.rindraibi.website.dataaccess.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rindraibi.website.business.model.domainobject.Identity;

/**
 * 
 * @author Rindra Mbolamananamalala
 *
 */
public interface IdentityDAO extends JpaRepository<Identity, String> {
	
	/**
	 * Saves and persists in DB an Identity
	 * @param identity The Identity to save and persist in DB
	 * @return
	 */
	public Identity save(Identity identity);

}
