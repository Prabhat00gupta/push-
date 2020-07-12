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
@Table(name="yourdevices")
public class YourDevices {
	
	@Id
	@Column(name="YOURDEVICEID")
	private Integer yourDeviceId;
	
	@Column(name="YOURDEVICENAME")
	private String yourDeviceName;
	
	@OneToOne(targetEntity = AccountAndSettings.class,cascade = CascadeType.ALL)
	@JoinColumn(name="ACCOUNTID_FK",referencedColumnName = "ACCOUNTID")
	private AccountAndSettings aas;

	@OneToMany(targetEntity = YourDevicesInfo.class,cascade = CascadeType.ALL)
	@JoinColumn(name="YOURDEVICEID_FK",referencedColumnName = "YOURDEVICEID")
	private Set children;
	public Integer getYourDeviceId() {
		return yourDeviceId;
	}

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public void setYourDeviceId(Integer yourDeviceId) {
		this.yourDeviceId = yourDeviceId;
	}

	public String getYourDeviceName() {
		return yourDeviceName;
	}

	public void setYourDeviceName(String yourDeviceName) {
		this.yourDeviceName = yourDeviceName;
	}

	public AccountAndSettings getAas() {
		return aas;
	}

	public void setAas(AccountAndSettings aas) {
		this.aas = aas;
	}
	

}
