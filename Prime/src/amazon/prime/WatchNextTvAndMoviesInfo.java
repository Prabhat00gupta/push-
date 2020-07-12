package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="watchnexttvandmoviesinfo")
public class WatchNextTvAndMoviesInfo {
	
	@Id
	@Column(name="WATCHNEXTTVID")
	private Integer watchnexttvId;
	
	@Column(name="DETAILS")
	private String details;

	public Integer getWatchnexttvId() {
		return watchnexttvId;
	}

	public void setWatchnexttvId(Integer watchnexttvId) {
		this.watchnexttvId = watchnexttvId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	

}
