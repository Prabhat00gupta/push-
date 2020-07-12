package com.prime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tvshows")
public class TVShows {
	
	@Id
	@Column(name="TVSHOWSID")
	private Integer TVShowsId;
	
	@Column(name="TVSHOWSINFO")
	private String TVShowsInfo;
	
	@OneToOne(targetEntity = User.class,cascade = CascadeType.ALL)
	@JoinColumn(name="USERID_FK",referencedColumnName = "USERID")
	private User u;

	public Integer getTVShowsId() {
		return TVShowsId;
	}

	public void setTVShowsId(Integer tVShowsId) {
		TVShowsId = tVShowsId;
	}

	public String getTVShowsInfo() {
		return TVShowsInfo;
	}

	public void setTVShowsInfo(String tVShowsInfo) {
		TVShowsInfo = tVShowsInfo;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}


}
