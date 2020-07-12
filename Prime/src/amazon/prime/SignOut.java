package com.prime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="signout")
public class SignOut {
	
	@Id
	@Column(name="SIGNOUTID")
	private Integer signOutId;
	
	@Column(name="SIGNOUTNAME")
	private String signOutName;
	
	@OneToOne(targetEntity = User.class,cascade = CascadeType.ALL)
	@JoinColumn(name="USERID_FK",referencedColumnName = "USERID")
	private User u;

	public Integer getSignOutId() {
		return signOutId;
	}

	public void setSignOutId(Integer signOutId) {
		this.signOutId = signOutId;
	}

	public String getSignOutName() {
		return signOutName;
	}

	public void setSignOutName(String signOutName) {
		this.signOutName = signOutName;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}
	

}
