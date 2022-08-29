package com.rindraibi.website.dataaccess.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rindraibi.website.business.model.domainobject.Resume;

public interface ResumeDAO extends JpaRepository<Resume, String>{
	/**
	 * Saves and persists in DB a Resume
	 * @param resume The Resume to save and persist in DB
	 * @return
	 */
	public Resume save(Resume resume);

}
