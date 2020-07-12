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
@Table(name="comedytv")
public class ComedyTv {
	
	@Id
	@Column(name="COMEDYTVID")
	private Integer comedytvId;
	
	@Column(name="NAME")
	private String name;
	
	@OneToOne(targetEntity = Kids.class,cascade = CascadeType.ALL)
	@JoinColumn(name="KIDSID_FK",referencedColumnName = "KIDSID")
	private Kids k;
	
	@OneToMany(targetEntity = ComedyTvInfo.class,cascade = CascadeType.ALL)
	@JoinColumn(name="COMEDYTVID_FK",referencedColumnName = "COMEDYTVID")
	private Set children;

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getComedytvId() {
		return comedytvId;
	}

	public void setComedytvId(Integer comedytvId) {
		this.comedytvId = comedytvId;
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
