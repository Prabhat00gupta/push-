package com.prime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="websitelanguage")
public class WebsiteLanguage {
	
	@Id
	@Column(name="WEBSITELANGUAGEID")
	private Integer websiteLanguageId;
	
	@Column(name="LANGUAGES")
	private String languages;

	public Integer getWebsiteLanguageId() {
		return websiteLanguageId;
	}

	public void setWebsiteLanguageId(Integer websiteLanguageId) {
		this.websiteLanguageId = websiteLanguageId;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}
	

}
