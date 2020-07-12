package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="yourdevicesinfo")
public class YourDevicesInfo {
	
	@Id
	@Column(name="YOURDEVICESINFOID")
	private Integer yourDevicesInfoId;
	
	@Column(name="YOURDEVICESOPTIONS")
	private String yourDevicesOptions;

	public Integer getYourDevicesInfoId() {
		return yourDevicesInfoId;
	}

	public void setYourDevicesInfoId(Integer yourDevicesInfoId) {
		this.yourDevicesInfoId = yourDevicesInfoId;
	}

	public String getYourDevicesOptions() {
		return yourDevicesOptions;
	}

	public void setYourDevicesOptions(String yourDevicesOptions) {
		this.yourDevicesOptions = yourDevicesOptions;
	}
	
	

}
