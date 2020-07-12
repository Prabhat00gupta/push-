package com.prime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="autoplay")
public class Autoplay {
	
	@Id
	@Column(name="AUTOPLAYID")
	private Integer autoplayId;
	
	public PlayBack getPb() {
		return pb;
	}

	public void setPb(PlayBack pb) {
		this.pb = pb;
	}

	@Column(name="AUTOPLAYOPTIONS")
	private String autoplayOptions;

	@OneToOne(targetEntity = PlayBack.class,cascade = CascadeType.ALL)
	@JoinColumn(name="PLAYBACKID_FK",referencedColumnName = "PLAYBACKID")
	private PlayBack pb;
	public Integer getAutoplayId() {
		return autoplayId;
	}

	public void setAutoplayId(Integer autoplayId) {
		this.autoplayId = autoplayId;
	}

	public String getAutoplayOptions() {
		return autoplayOptions;
	}

	public void setAutoplayOptions(String autoplayOptions) {
		this.autoplayOptions = autoplayOptions;
	}
	
	

}
