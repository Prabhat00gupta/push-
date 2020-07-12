
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
@Table(name="yourwatchlist")
public class YourWatchlist {
	
	@Id
	@Column(name="YWLID")
	private Integer ywlId;
	
	@Column(name="YWLNAME")
	private String ywlName;
	
	@OneToOne(targetEntity = User.class,cascade = CascadeType.ALL)
	@JoinColumn(name="USERID_FK",referencedColumnName = "USERID")
	private User u;
	
	@OneToMany(targetEntity = YourWatchlistInfo.class,cascade = CascadeType.ALL)
	@JoinColumn(name="YWLID_FK",referencedColumnName = "YWLID")
	private Set children;

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}

	public Integer getYwlId() {
		return ywlId;
	}

	public void setYwlId(Integer ywlId) {
		this.ywlId = ywlId;
	}

	public String getYwlName() {
		return ywlName;
	}

	public void setYwlName(String ywlName) {
		this.ywlName = ywlName;
	}
	
	

}
