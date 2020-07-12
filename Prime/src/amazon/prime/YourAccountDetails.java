package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="youraccountdetails")
public class YourAccountDetails {

	@Id
	@Column(name="YOURACCOUNTDETAILSID")
	private Integer yourAccountDetailsId;
	
	@Column(name="YOURACCOUNTDETAILSOPTIONS")
	private String yourAccountDetailsOptions;

	public Integer getYourAccountDetailsId() {
		return yourAccountDetailsId;
	}

	public void setYourAccountDetailsId(Integer yourAccountDetailsId) {
		this.yourAccountDetailsId = yourAccountDetailsId;
	}

	public String getYourAccountDetailsOptions() {
		return yourAccountDetailsOptions;
	}

	public void setYourAccountDetailsOptions(String yourAccountDetailsOptions) {
		this.yourAccountDetailsOptions = yourAccountDetailsOptions;
	}
	
	
}
