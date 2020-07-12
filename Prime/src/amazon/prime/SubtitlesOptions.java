package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subtitlesoptions")
public class SubtitlesOptions {
	
	@Id
	@Column(name="SUBTITLESOPTIONSID")
	private Integer subtitlesOptionsId;
	
	@Column(name="SUBTITLESOPTIONSNAME")
	private String subtitlesOptionsName;

	public Integer getSubtitlesOptionsId() {
		return subtitlesOptionsId;
	}

	public void setSubtitlesOptionsId(Integer subtitlesOptionsId) {
		this.subtitlesOptionsId = subtitlesOptionsId;
	}

	public String getSubtitlesOptionsName() {
		return subtitlesOptionsName;
	}

	public void setSubtitlesOptionsName(String subtitlesOptionsName) {
		this.subtitlesOptionsName = subtitlesOptionsName;
	}
	
	

}
