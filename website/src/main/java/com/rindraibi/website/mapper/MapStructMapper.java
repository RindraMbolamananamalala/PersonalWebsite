package com.rindraibi.website.mapper;

import org.mapstruct.Mapper;

import com.rindraibi.website.business.model.domainobject.Resume;
import com.rindraibi.website.business.model.dto.ResumeDTO;

/**
 * 
 * @author Rindra Mbolamananamalala
 * The interface dedicated to any need of Mapping from a source Object1 to a target Object2.  
 */
@Mapper(componentModel = "spring")
public interface MapStructMapper {
	/**
	 * Resume DO to ResumeDTO 
	 * @param resume
	 * @return
	 */
	ResumeDTO resumeDTO(Resume resume);

}
