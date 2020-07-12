package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comedytvinfo")
public class ComedyTvInfo {
	
	@Id
	@Column(name="COMEDYTVINFOID")
	private Integer comedyTvInfoId;
	
	@Column(name="DETAILS")
	private String details;

	public Integer getComedyTvInfoId() {
		return comedyTvInfoId;
	}

	public void setComedyTvInfoId(Integer comedyTvInfoId) {
		this.comedyTvInfoId = comedyTvInfoId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
