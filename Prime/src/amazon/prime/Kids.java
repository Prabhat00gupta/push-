package com.prime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="kids")
public class Kids {
	
	@Id
	@Column(name="KIDSID")
	private Integer kidsId;
	
	@Column(name="KIDSCATEGORY")
	private String kidsCategory;
	
	@OneToOne(targetEntity = User.class,cascade = CascadeType.ALL)
	@JoinColumn(name="USERID_FK",referencedColumnName = "USERID")
	private User u;

	public Integer getKidsId() {
		return kidsId;
	}

	public void setKidsId(Integer kidsId) {
		this.kidsId = kidsId;
	}

	public String getKidsCategory() {
		return kidsCategory;
	}

	public void setKidsCategory(String kidsCategory) {
		this.kidsCategory = kidsCategory;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}


}
