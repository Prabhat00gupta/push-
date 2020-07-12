package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recommendedmoviesinfo")
public class RecommendedMoviesInfo {

	@Id
	@Column(name="RECOMMENDEDMOVIESINFOID")
	private Integer recommendedMoviesInfoId;
	
	@Column(name="DETAILS")
	private String details;

	public Integer getRecommendedMoviesInfoId() {
		return recommendedMoviesInfoId;
	}

	public void setRecommendedMoviesInfoId(Integer recommendedMoviesInfoId) {
		this.recommendedMoviesInfoId = recommendedMoviesInfoId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
}
