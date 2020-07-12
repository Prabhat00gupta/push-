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
@Table(name="subtitles")
public class Subtitles {
	
	@Id
	@Column(name="SUBTITLEID")
	private Integer subtitleId;
	
	@Column(name="SUBTITLEOPTIONS")
	private String subtitleOptions;
	
	@OneToOne(targetEntity = AccountAndSettings.class,cascade = CascadeType.ALL)
	@JoinColumn(name="ACCOUNTID_FK",referencedColumnName = "ACCOUNTID")
	private AccountAndSettings aas;

	@OneToMany(targetEntity = SubtitlesOptions.class,cascade = CascadeType.ALL)
	@JoinColumn(name="SUBTITLEID_FK",referencedColumnName = "SUBTITLEID")
	private Set children;
	
	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getSubtitleId() {
		return subtitleId;
	}

	public void setSubtitleId(Integer subtitleId) {
		this.subtitleId = subtitleId;
	}

	public String getSubtitleOptions() {
		return subtitleOptions;
	}

	public void setSubtitleOptions(String subtitleOptions) {
		this.subtitleOptions = subtitleOptions;
	}

	public AccountAndSettings getAas() {
		return aas;
	}

	public void setAas(AccountAndSettings aas) {
		this.aas = aas;
	}
	

}
