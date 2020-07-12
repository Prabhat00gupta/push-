package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="throwbacktvinfo")
public class ThrowBackTvInfo {

	@Id
	@Column(name="THROWBACKTVINFOID")
	private Integer throwbacktvInfoId;
	
	@Column(name="TVDETAILS")
	private String tvDetails;

	public Integer getThrowbacktvInfoId() {
		return throwbacktvInfoId;
	}

	public void setThrowbacktvInfoId(Integer throwbacktvInfoId) {
		this.throwbacktvInfoId = throwbacktvInfoId;
	}

	public String getTvDetails() {
		return tvDetails;
	}

	public void setTvDetails(String tvDetails) {
		this.tvDetails = tvDetails;
	}
	
}
