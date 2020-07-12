package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="indiantoonsinfo")
public class IndianToonsInfo {

	@Id
	@Column(name="INDIANTOONSINFOID")
	private Integer indianToonsInfoId;
	
	@Column(name="DETAILS")
	private String details;

	public Integer getIndianToonsInfoId() {
		return indianToonsInfoId;
	}

	public void setIndianToonsInfoId(Integer indianToonsInfoId) {
		this.indianToonsInfoId = indianToonsInfoId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	
}
