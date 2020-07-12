package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="amazonoriginalseriesinfo")
public class AmazonOriginalSeriesInfo {
	
	@Id
	@Column(name="INFOID")
	private Integer infoId;
	
	@Column(name="DETAILS")
	private String details;

	public Integer getInfoId() {
		return infoId;
	}

	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
