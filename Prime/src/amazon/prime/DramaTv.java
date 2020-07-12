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
@Table(name="dramatv")
public class DramaTv {
	
	@Id
	@Column(name="DRAMATVID")
	private Integer DramaTvId;
	
	@Column(name="INFO")
	private String info;
	

	@OneToOne(targetEntity = TVShows.class,cascade = CascadeType.ALL)
	@JoinColumn(name="TVSHOWSID_FK",referencedColumnName = "TVSHOWSID")
	private TVShows t;
	
	@OneToMany(targetEntity = DramaTvInfo.class,cascade = CascadeType.ALL)
	@JoinColumn(name="DRAMATVID_FK",referencedColumnName = "DRAMATVID")
	private Set children;
	

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getDramaTvId() {
		return DramaTvId;
	}

	public void setDramaTvId(Integer dramaTvId) {
		DramaTvId = dramaTvId;
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
