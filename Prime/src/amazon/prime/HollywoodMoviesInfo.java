package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hollywoodmoviesinfo")
public class HollywoodMoviesInfo {

	@Id
	@Column(name="HOLLYWOODMOVIESINFOID")
	private Integer hollywoodmoviesInfoId;
	
	@Column(name="DETAILS")
	private String details;

	public Integer getHollywoodmoviesInfoId() {
		return hollywoodmoviesInfoId;
	}

	public void setHollywoodmoviesInfoId(Integer hollywoodmoviesInfoId) {
		this.hollywoodmoviesInfoId = hollywoodmoviesInfoId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	
}
