package com.prime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="watchhistory")
public class WatchHistory {
	
	@Id
	@Column(name="WATCHHISTORYID")
	private Integer watchHistoryId;
	
	@Column(name="WATCHHISTORYNAME")
	private String watchHistoryName;
	
	
	public Integer getWatchHistoryId() {
		return watchHistoryId;
	}

	public void setWatchHistoryId(Integer watchHistoryId) {
		this.watchHistoryId = watchHistoryId;
	}

	public String getWatchHistoryName() {
		return watchHistoryName;
	}

	public void setWatchHistoryName(String watchHistoryName) {
		this.watchHistoryName = watchHistoryName;
	}

	

}
