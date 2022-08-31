package com.rindraibi.website.dataaccess.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rindraibi.website.business.model.domainobject.Identity;

/**
 * The interface class dedicated to any need of DAO service related to the Identity.
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
