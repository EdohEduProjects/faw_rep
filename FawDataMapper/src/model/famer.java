package model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * The persistent class for the famers database table.
 * 
 */
@Entity
@Table(name = "famers")
@NamedQuery(name = "famer.findAll", query = "SELECT f FROM famer f")
@TableGenerator(name = "farmers")
public class famer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "addr")
	private String addr;

	@Column(name = "farmername")
	private String farmerName;

	@Column(name = "farmerlastname")
	private String farmerlastname;

	@Column(name = "farmerID", table = "famers")
	@Id
	private String farmerID;

	public famer() {
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getFarmerName() {
		return this.farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public String getFarmer_last() {
		return this.farmerlastname;
	}

	public void setFarmer_last(String farmer_last) {
		this.farmerlastname = farmer_last;
	}

	public String getFarmerID() {
		return farmerID;
	}

	public void setFarmerID(String param) {
		this.farmerID = param;
	}

}