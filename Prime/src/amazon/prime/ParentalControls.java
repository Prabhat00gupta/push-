package com.prime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="parentalcontrols")
public class ParentalControls {
	
	@Id
	@Column(name="PARENTALCONTROLSID")
	private Integer parentalControlsId;
	
	@Column(name="PARENTALCONTROLNAME")
	private String parentalControlName;
	
	@OneToOne(targetEntity = AccountAndSettings.class,cascade = CascadeType.ALL)
	@JoinColumn(name="ACCOUNTID_FK",referencedColumnName = "ACCOUNTID")
	private AccountAndSettings aas;

	public Integer getParentalControlsId() {
		return parentalControlsId;
	}

	public void setParentalControlsId(Integer parentalControlsId) {
		this.parentalControlsId = parentalControlsId;
	}

	public String getParentalControlName() {
		return parentalControlName;
	}

	public void setParentalControlName(String parentalControlName) {
		this.parentalControlName = parentalControlName;
	}

	public AccountAndSettings getAas() {
		return aas;
	}

	public void setAas(AccountAndSettings aas) {
		this.aas = aas;
	}
	
	

}
