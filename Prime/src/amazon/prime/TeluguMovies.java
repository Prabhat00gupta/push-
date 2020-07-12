package com.prime;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="telugumovies")
public class TeluguMovies {
	
	@Id
	@Column(name="TELUGUMOVIESID")
	private Integer telugumoviesId;
	
	@Column(name="NAME")
	private String name;
	
	@OneToOne(targetEntity = Movies.class,cascade = CascadeType.ALL)
	@JoinColumn(name="MOVIESID_FK",referencedColumnName = "MOVIESID")
	private Movies m;
	
	@OneToMany(targetEntity = TeluguMoviesInfo.class,cascade = CascadeType.ALL)
	@JoinColumn(name="TELUGUMOVIESID_FK",referencedColumnName = "TELUGUMOVIESID")
	private Set children;

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getTelugumoviesId() {
		return telugumoviesId;
	}

	public void setTelugumoviesId(Integer telugumoviesId) {
		this.telugumoviesId = telugumoviesId;
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
