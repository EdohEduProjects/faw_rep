package model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: geolocation
 *
 */
@Entity
@NamedQuery(name="geolocation.findAll", query="SELECT g FROM geolocation g")
@TableGenerator(name = "geolocation")
public class geolocation implements Serializable {

	@Id
	private int ID; 
	
	private long farmerID; 
	
	@Column(name ="norhwestpoint")
	private String norhwestpoint; 
	
	@Column(name ="northeastpoint")
	private String northeastpoint; 
	
	@Column(name ="southeastpoint")
	private String southeastpoint;
	
	@Column(name ="southwestpoint")
	private String southwestpoint;
	
 
	private static final long serialVersionUID = 1L;

	public geolocation() {
		super();
	} 
	   
	public long getFarmerID() {
 		return this.farmerID;
	}

	public void setFarmerID(long farmerID) {
		this.farmerID = farmerID;
	}
	   
	public String getNorhwestpoint() {
 		return this.norhwestpoint;
	}

	public void setNorhwestpoint(String norhwestpoint) {
		this.norhwestpoint = norhwestpoint;
	}
	   
	public int getID() {
 		return this.ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}
	   
	public String getNortheastpoint() {
 		return this.northeastpoint;
	}

	public void setNortheastpoint(String northeastpoint) {
		this.northeastpoint = northeastpoint;
	}
	   
	public String getSoutheastpoint() {
 		return this.southeastpoint;
	}

	public void setSoutheastpoint(String southeastpoint) {
		this.southeastpoint = southeastpoint;
	}
	   
	public String getSouthwestpoint() {
 		return this.southwestpoint;
	}

	public void setSouthwestpoint(String southwestpoint) {
		this.southwestpoint = southwestpoint;
	}
	
   
}
