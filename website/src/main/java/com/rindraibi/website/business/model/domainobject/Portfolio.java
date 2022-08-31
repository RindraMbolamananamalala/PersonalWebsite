package com.rindraibi.website.business.model.domainobject;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @author Rindra Mbolamananamalala
 *
 */
@Entity
@Table(name = "Portfolio")
public class Portfolio extends RindraIbiDO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Basic
	@Column
	private String image;
	
	@ManyToOne
	@JoinColumn(name="RESUME_ID")
	@JsonIgnore
	private Resume resume;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	

}
