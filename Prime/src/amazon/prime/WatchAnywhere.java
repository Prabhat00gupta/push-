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
@Table(name="watchanywhere")
public class WatchAnywhere {
	
	@Id
	@Column(name="WATCHID")
	private Integer watchAnywhereId;
	
	@Column(name="WATCHNAME")
	private String watchAnywhereName;
	
	@OneToOne(targetEntity = User.class,cascade = CascadeType.ALL)
	@JoinColumn(name="USERID_FK",referencedColumnName = "USERID")
	private User u;
	
	@OneToMany(targetEntity = WatchAnywhereInfo.class,cascade = CascadeType.ALL)
	@JoinColumn(name="WATCHID_FK",referencedColumnName = "WATCHID")
	private Set children;

	public Set getChildren() {
		return children;
	}

	public void setChildren(Set children) {
		this.children = children;
	}

	public Integer getWatchAnywhereId() {
		return watchAnywhereId;
	}

	public void setWatchAnywhereId(Integer watchAnywhereId) {
		this.watchAnywhereId = watchAnywhereId;
	}

	public String getWatchAnywhereName() {
		return watchAnywhereName;
	}

	public void setWatchAnywhereName(String watchAnywhereName) {
		this.watchAnywhereName = watchAnywhereName;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}

}
