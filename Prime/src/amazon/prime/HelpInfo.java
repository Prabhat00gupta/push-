package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="helpinfo")
public class HelpInfo {

	@Id
	@Column(name="HELPINFOID")
	private Integer HelpInfoId;
	
	@Column(name="HELPOPTIONS")
	private String HelpOptions;

	public Integer getHelpInfoId() {
		return HelpInfoId;
	}

	public void setHelpId(Integer helpInfoId) {
		HelpInfoId = helpInfoId;
	}

	public String getHelpOptions() {
		return HelpOptions;
	}

	public void setHelpOptions(String helpOptions) {
		HelpOptions = helpOptions;
	}
	
	
}
