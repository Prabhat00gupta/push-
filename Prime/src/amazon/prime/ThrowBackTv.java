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
@Table(name="throwbacktv")
public class ThrowBackTv 
{
	
	@Id
	@Column(name="THROWBACKTVID")
	private Integer throwbacktvId;
	
	@Column(name="INFO")
	private String 	info;
	
	@OneToOne(targetEntity = TVShows.class,cascade = CascadeType.ALL)
	@JoinColumn(name="TVSHOWSID_FK",referencedColumnName = "TVSHOWSID")
	private TVShows t;
	
	
    @OneToMany(targetEntity = ThrowBackTvInfo.class,cascade = CascadeType.ALL)
    @JoinColumn(name="THROWBACKTVID_FK",referencedColumnName = "THROWBACKTVID")
	private Set children;

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getThrowbacktvId() {
		return throwbacktvId;
	}

	public void setThrowbacktvId(Integer throwbacktvId) {
		this.throwbacktvId = throwbacktvId;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public TVShows getT() {
		return t;
	}

	public void setT(TVShows t) {
		this.t = t;
	}

}
