package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="moviesinhindiinfo")
public class MoviesInHindiInfo {
	
	@Id
	@Column(name="MOVIESINHINDIID")
	private Integer moviesinhindiId;
	
	@Column(name="DETAILS")
	private String details;

	public Integer getMoviesinhindiId() {
		return moviesinhindiId;
	}

	public void setMoviesinhindiId(Integer moviesinhindiId) {
		this.moviesinhindiId = moviesinhindiId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	

}
