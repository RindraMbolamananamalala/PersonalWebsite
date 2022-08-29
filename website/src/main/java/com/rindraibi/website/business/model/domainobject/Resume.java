package com.rindraibi.website.business.model.domainobject;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * 
 * @author Rindra Mbolamananamalala
 *
 */
@Entity
@Table(name = "Resume")
public class Resume extends RindraIbiDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@OneToOne()
	private Identity identity;
	
    
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="RESUME_ID")
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

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj, new String[]{"identity"});
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, new String[]{"identity"});
	}
	
}
