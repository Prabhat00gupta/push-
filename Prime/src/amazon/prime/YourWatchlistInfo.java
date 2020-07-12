package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="yourwatchlistinfo")
public class YourWatchlistInfo {
	
	@Id
	@Column(name="YWLINFOID")
	private Integer ywlInfoId;
	
	@Column(name="YWLINFO")
	private String ywlInfo;

	public Integer getYwlInfoId() {
		return ywlInfoId;
	}

	public void setYwlInfoId(Integer ywlInfoId) {
		this.ywlInfoId = ywlInfoId;
	}

	public String getYwlInfo() {
		return ywlInfo;
	}

	public void setYwlInfo(String ywlInfo) {
		this.ywlInfo = ywlInfo;
	}
	
	

}
