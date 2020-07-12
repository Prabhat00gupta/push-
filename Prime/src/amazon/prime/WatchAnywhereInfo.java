package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="watchanywhereinfo")
public class WatchAnywhereInfo {
	
	@Id
	@Column(name="WATCHANYWHEREINFOID")
	private Integer watchAnywhereInfoId;
	
	@Column(name="WATCHANYWHEREOPTIONS")
	private String watchAnywhereOptions;

	public Integer getWatchAnywhereInfoId() {
		return watchAnywhereInfoId;
	}

	public void setWatchAnywhereInfoId(Integer watchAnywhereInfoId) {
		this.watchAnywhereInfoId = watchAnywhereInfoId;
	}

	public String getWatchAnywhereOptions() {
		return watchAnywhereOptions;
	}

	public void setWatchAnywhereOptions(String watchAnywhereOptions) {
		this.watchAnywhereOptions = watchAnywhereOptions;
	}
	
	
}