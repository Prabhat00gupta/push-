package com.prime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="primevideopin")
public class PrimeVideoPin {
	
	@Id
	@Column(name="PRIMEVIDEOPINID")
	private Integer primeVideoPinId;
	
	@Column(name="PIN")
	private Integer pin;
	
	@OneToOne(targetEntity = ParentalControls.class,cascade = CascadeType.ALL)
	@JoinColumn(name="PARENTALCONTROLSID_FK",referencedColumnName = "PARENTALCONTROLSID")
	private ParentalControls pc;

	public Integer getPrimeVideoPinId() {
		return primeVideoPinId;
	}

	public void setPrimeVideoPinId(Integer primeVideoPinId) {
		this.primeVideoPinId = primeVideoPinId;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public ParentalControls getPc() {
		return pc;
	}

	public void setPc(ParentalControls pc) {
		this.pc = pc;
	}

}
