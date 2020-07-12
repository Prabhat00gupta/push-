package com.prime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="playback")
public class PlayBack {
	
	@Id
	@Column(name="PLAYBACKID")
	private Integer playBackId;
	
	@Column(name="PLAYBACKOPTION")
	private String playBackOption;
	
	@OneToOne(targetEntity = AccountAndSettings.class,cascade = CascadeType.ALL)
	@JoinColumn(name="ACCOUNTID_FK",referencedColumnName = "ACCOUNTID")
	private AccountAndSettings aas;

	public Integer getPlayBackId() {
		return playBackId;
	}

	public void setPlayBackId(Integer playBackId) {
		this.playBackId = playBackId;
	}

	public String getPlayBackOption() {
		return playBackOption;
	}

	public void setPlayBackOption(String playBackOption) {
		this.playBackOption = playBackOption;
	}

	public AccountAndSettings getAas() {
		return aas;
	}

	public void setAas(AccountAndSettings aas) {
		this.aas = aas;
	}
	

}
