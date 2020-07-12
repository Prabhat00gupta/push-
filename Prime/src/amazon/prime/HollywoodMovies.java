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
@Table(name="hollywoodmovies")
public class HollywoodMovies {
	
	@Id
	@Column(name="HOLLYWOODMOVIESID")
	private Integer hollywoodmoviesId;
	
	@Column(name="NAME")
	private String name;
	
	@OneToOne(targetEntity = Movies.class,cascade = CascadeType.ALL)
	@JoinColumn(name="MOVIESID_FK",referencedColumnName = "MOVIESID")
	private Movies m;

	@OneToMany(targetEntity = HollywoodMoviesInfo.class,cascade = CascadeType.ALL)
	@JoinColumn(name="HOLLYWOODMOVIESID_FK",referencedColumnName = "HOLLYWOODMOVIESID")
	private Set children;
	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getHollywoodmoviesId() {
		return hollywoodmoviesId;
	}

	public void setHollywoodmoviesId(Integer hollywoodmoviesId) {
		this.hollywoodmoviesId = hollywoodmoviesId;
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
