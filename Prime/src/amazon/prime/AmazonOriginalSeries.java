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
@Table(name="amazonoriginalseries")
public class AmazonOriginalSeries {

	@Id
	@Column(name="AMAZONORIGINALSERIESID")
	private Integer amazonOriginalSeriesId;
	
	@Column(name="NAME")
	private String name;

	@OneToOne(targetEntity = Home.class,cascade = CascadeType.ALL)
	@JoinColumn(name="HOMEID_FK",referencedColumnName = "HOMEID")
	private Home h;
	
	@OneToMany(targetEntity = AmazonOriginalSeriesInfo.class,cascade = CascadeType.ALL)
	@JoinColumn(name="AMAZONORIGINALSERIESID_FK",referencedColumnName = "AMAZONORIGINALSERIESID")
	private Set children;
	
	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Home getH() {
		return h;
	}

	public void setH(Home h) {
		this.h = h;
	}

	public Integer getAmazonOriginalSeriesId() {
		return amazonOriginalSeriesId;
	}

	public void setAmazonOriginalSeriesId(Integer amazonOriginalSeriesId) {
		this.amazonOriginalSeriesId = amazonOriginalSeriesId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
