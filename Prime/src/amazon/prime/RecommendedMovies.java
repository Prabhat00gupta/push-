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
@Table(name="recommendedmovies")
public class RecommendedMovies {
	
	@Id
	@Column(name="RECOMMENDEDID")
	private Integer recommendedId;
	
	@Column(name="RECOMMENDEDNAME")
	private String recommendedName;
	
	@OneToOne(targetEntity = Home.class,cascade = CascadeType.ALL)
	@JoinColumn(name="HOMEID_FK",referencedColumnName = "HOMEID")
	private Home h;
	
	@OneToMany(targetEntity = RecommendedMoviesInfo.class,cascade = CascadeType.ALL)
	@JoinColumn(name="RECOMMENDEDID_FK",referencedColumnName = "RECOMMENDEDID")
	private Set children;

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getRecommendedId() {
		return recommendedId;
	}

	public void setRecommendedId(Integer recommendedId) {
		this.recommendedId = recommendedId;
	}

	public String getRecommendedName() {
		return recommendedName;
	}

	public void setRecommendedName(String recommendedName) {
		this.recommendedName = recommendedName;
	}

	public Home getH() {
		return h;
	}

	public void setH(Home h) {
		this.h = h;
	}


}
