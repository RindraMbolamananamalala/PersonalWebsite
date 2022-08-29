package com.rindraibi.website.business.model.domainobject;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * 
 * @author Rindra Mbolamanananamalala
 *
 */
@Entity
@Table(name = "Identity")
public class Identity extends RindraIbiDO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Basic
	@Column
	@Email
	private String email;
	
	@Basic
	@Column
	private String firstName;
	
	@Basic
	@Column
	private String lastName;
	
	@Basic
	@Column
	private String address;
	
	@Basic
	@Column
	private String activity;
	
	@Basic
	@Column
	private String telephone;
	
	@Basic
	@Column
	private String picture;
	
	@OneToOne
	@JoinColumn()
	private Resume resume;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public Resume getResume() {
		return resume;
	}

	public void setResume(Resume resume) {
		this.resume = resume;
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj, new String[]{"email"});
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, new String[]{"email"});
	}

}
