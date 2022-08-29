package com.rindraibi.website.business.model.domainobject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 
 * @author Rindra Mbolamananamalala
 *
 */

@MappedSuperclass
public abstract class RindraIbiDO implements Serializable {
	
	public static final long serialVersionUID = 1L;
	
	@Id
	@Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	
}
