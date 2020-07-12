package com.prime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movies {
	
	@Id
	@Column(name="MOVIESID")
	private Integer moviesId;
	
	@Column(name="MOVIESCATEGORY")
	private String moviescategory;
	
	@OneToOne(targetEntity = User.class,cascade = CascadeType.ALL)
	@JoinColumn(name="USERID_FK",referencedColumnName = "USERID")
	private User u;

	public Integer getMoviesId() {
		return moviesId;
	}

	public void setMoviesId(Integer moviesId) {
		this.moviesId = moviesId;
	}

	public String getMoviescategory() {
		return moviescategory;
	}

	public void setMoviescategory(String moviescategory) {
		this.moviescategory = moviescategory;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}


}
