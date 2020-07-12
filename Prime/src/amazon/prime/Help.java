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
@Table(name="help")
public class Help {
	
	@Id
	@Column(name="HELPID")
	private Integer helpId;
	
	@Column(name="HELPNAME")
	private String helpName;
	
	@OneToOne(targetEntity = User.class,cascade = CascadeType.ALL)
	@JoinColumn(name="USERID_FK",referencedColumnName = "USERID")
	private User u;
	
	@OneToMany(targetEntity = HelpInfo.class,cascade = CascadeType.ALL)
	@JoinColumn(name="HELPID_FK",referencedColumnName = "HELPID")
	private Set children;

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getHelpId() {
		return helpId;
	}

	public void setHelpId(Integer helpId) {
		this.helpId = helpId;
	}

	public String getHelpName() {
		return helpName;
	}

	public void setHelpName(String helpName) {
		this.helpName = helpName;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}

}
