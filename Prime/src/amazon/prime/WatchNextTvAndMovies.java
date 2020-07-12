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
@Table(name="watchnexttvandmovies")
public class WatchNextTvAndMovies {
	
	@Id
	@Column(name="WATCHNEXTID")
	private Integer watchNextId;
	
	@Column(name="NAME")
	private String name;
	
	@OneToOne(targetEntity = Home.class,cascade = CascadeType.ALL)
	@JoinColumn(name="HOMEID_FK",referencedColumnName = "HOMEID")
	private Home h;
	
	@OneToMany(targetEntity = WatchNextTvAndMoviesInfo.class,cascade = CascadeType.ALL)
	@JoinColumn(name="WATCHNEXTID_FK",referencedColumnName = "WATCHNEXTID")
	private Set children;

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getWatchNextId() {
		return watchNextId;
	}

	public void setWatchNextId(Integer watchNextId) {
		this.watchNextId = watchNextId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Home getH() {
		return h;
	}

	public void setH(Home h) {
		this.h = h;
	}


}
