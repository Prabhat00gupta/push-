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
@Table(name="youraccount")
public class YourAccount {
	
	@Id
	@Column(name="YOURACCOUNTID")
	private Integer yourAccountId;
	
	@Column(name="YOURACCOUNTOPTION")
	private String yourAccountOption;
	
	@OneToOne(targetEntity = AccountAndSettings.class,cascade = CascadeType.ALL)
	@JoinColumn(name="ACCOUNTID_FK",referencedColumnName = "ACCOUNTID")
	private AccountAndSettings aas;

	@OneToMany(targetEntity = YourAccountDetails.class,cascade = CascadeType.ALL)
	@JoinColumn(name="YOURACCOUNTID_FK",referencedColumnName = "YOURACCOUNTID")
	private Set children;
	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getYourAccountId() {
		return yourAccountId;
	}

	public void setYourAccountId(Integer yourAccountId) {
		this.yourAccountId = yourAccountId;
	}

	public String getYourAccountOption() {
		return yourAccountOption;
	}

	public void setYourAccountOption(String yourAccountOption) {
		this.yourAccountOption = yourAccountOption;
	}

	public AccountAndSettings getAas() {
		return aas;
	}

	public void setAas(AccountAndSettings aas) {
		this.aas = aas;
	}
	
	

}
