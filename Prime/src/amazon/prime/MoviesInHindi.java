package com.prime;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="moviesinhindi")
public class MoviesInHindi {

	@Id
	@Column(name="MOVIESINHINDIID")
	private Integer moviesinhindiId;
	
	@Column(name="NAME")
	private String name;
	
	@OneToOne(targetEntity = Movies.class,cascade = CascadeType.ALL)
	@JoinColumn(name="MOVIESID_FK",referencedColumnName = "MOVIESID")
	private Movies m;
	
	@OneToMany(targetEntity = MoviesInHindiInfo.class,cascade = CascadeType.ALL)
	@JoinColumn(name="MOVIESINHINDIID_FK",referencedColumnName = "MOVIESINHINDIID")
	private Set children;

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getMoviesinhindiId() {
		return moviesinhindiId;
	}

	public void setMoviesinhindiId(Integer moviesinhindiId) {
		this.moviesinhindiId = moviesinhindiId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Movies getM() {
		return m;
	}

	public void setM(Movies m) {
		this.m = m;
	}

}
