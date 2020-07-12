package com.prime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="home")
public class Home {
	
	@Id
	@Column(name="HOMEID")
	private Integer homeId;
	
	@Column(name="HOMEOPTIONS")
	private String homeOptions;
	
	@OneToOne(targetEntity = User.class,cascade = CascadeType.ALL)
	@JoinColumn(name="USERID_FK",referencedColumnName = "USERID")
	private User u;

	public Integer getHomeId() {
		return homeId;
	}

	public void setHomeId(Integer homeId) {
		this.homeId = homeId;
	}

	public String getHomeOptions() {
		return homeOptions;
	}

	public void setHomeOptions(String homeOptions) {
		this.homeOptions = homeOptions;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}

}
