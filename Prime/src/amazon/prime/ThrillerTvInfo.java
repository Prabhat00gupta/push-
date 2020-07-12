package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="thrillertvinfo")
public class ThrillerTvInfo {
	
	@Id
	@Column(name="THRILLERTVINFOID")
	private Integer ThrillerTvInfoId;
	
	@Column(name="TVDETAILS")
	private String tvDetails;

	public Integer getThrillerTvInfoId() {
		return ThrillerTvInfoId;
	}

	public void setThrillerTvInfoId(Integer thrillerTvInfoId) {
		ThrillerTvInfoId = thrillerTvInfoId;
	}

	public String getTvDetails() {
		return tvDetails;
	}

	public void setTvDetails(String tvDetails) {
		this.tvDetails = tvDetails;
	}
	
	

}
