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
@Table(name="comedymovies")
public class ComedyMovies {
	
	@Id
	@Column(name="COMEDYMOVIESID")
	private Integer comedymoviesId;
	
	@Column(name="NAME")
	private String name;
	
	@OneToOne(targetEntity = Kids.class,cascade = CascadeType.ALL)
	@JoinColumn(name="KIDSID_FK",referencedColumnName = "KIDSID")
	private Kids k;
	
	@OneToMany(targetEntity = ComedyMoviesInfo.class,cascade = CascadeType.ALL)
	@JoinColumn(name="COMEDYMOVIESID_FK",referencedColumnName = "COMEDYMOVIESID")
	private Set children;

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getComedymoviesId() {
		return comedymoviesId;
	}

	public void setComedymoviesId(Integer comedymoviesId) {
		this.comedymoviesId = comedymoviesId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Kids getK() {
		return k;
	}

	public void setK(Kids k) {
		this.k = k;
	}


}
