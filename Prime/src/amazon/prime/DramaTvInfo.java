package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dramatvinfo")
public class DramaTvInfo {
	
	@Id
	@Column(name="DRAMATVINFOID")
	private Integer dramatvInfoId;
	
	@Column(name="TVDETAILS")
	private String tvdetails;

	public Integer getDramatvInfoId() {
		return dramatvInfoId;
	}

	public void setDramatvInfoId(Integer dramatvInfoId) {
		this.dramatvInfoId = dramatvInfoId;
	}

	public String getTvdetails() {
		return tvdetails;
	}

	public void setTvdetails(String tvdetails) {
		this.tvdetails = tvdetails;
	}
	
	

}
