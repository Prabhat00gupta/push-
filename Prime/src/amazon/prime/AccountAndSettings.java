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
@Table(name="accountandsettings")
public class AccountAndSettings {
	
	@Id
	@Column(name="ACCOUNTID")
	private Integer accountId;
	
	@Column(name="ACCOUNTNAME")
	private String accountName;
	
	
	@OneToOne(targetEntity = User.class,cascade = CascadeType.ALL)
	@JoinColumn(name="USERID_FK",referencedColumnName = "USERID")
	private User u;

	@OneToMany(targetEntity = WatchHistory.class,cascade = CascadeType.ALL)
	@JoinColumn(name="ACCOUNTID_FK",referencedColumnName = "ACCOUNTID")
	private Set children;
	
	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}

}
