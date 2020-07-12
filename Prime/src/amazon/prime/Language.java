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
@Table(name="language")
public class Language {
	
	@Id
	@Column(name="LANGUAGEID")
	private Integer languageId;
	
	@Column(name="LANGUAGEOPTIONS")
	private String languageOptions;
	
	@OneToOne(targetEntity = AccountAndSettings.class,cascade = CascadeType.ALL)
	@JoinColumn(name="ACCOUNTID_FK",referencedColumnName = "ACCOUNTID")
	private AccountAndSettings aas;
	
	@OneToMany(targetEntity = WebsiteLanguage.class,cascade = CascadeType.ALL)
	@JoinColumn(name="LANGUAGEID_FK",referencedColumnName = "LANGUAGEID")
	private Set children;

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public String getLanguageOptions() {
		return languageOptions;
	}

	public void setLanguageOptions(String languageOptions) {
		this.languageOptions = languageOptions;
	}

	public AccountAndSettings getAas() {
		return aas;
	}

	public void setAas(AccountAndSettings aas) {
		this.aas = aas;
	}
	
	

}
