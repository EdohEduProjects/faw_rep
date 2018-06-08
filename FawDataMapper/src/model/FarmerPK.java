package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the farmer database table.
 * 
 */
@Embeddable
public class FarmerPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false, length=255)
	private String farmerID;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int tech_assistant_ID;

	public FarmerPK() {
	}
	public String getFarmerID() {
		return this.farmerID;
	}
	public void setFarmerID(String farmerID) {
		this.farmerID = farmerID;
	}
	public int getTech_assistant_ID() {
		return this.tech_assistant_ID;
	}
	public void setTech_assistant_ID(int tech_assistant_ID) {
		this.tech_assistant_ID = tech_assistant_ID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FarmerPK)) {
			return false;
		}
		FarmerPK castOther = (FarmerPK)other;
		return 
			this.farmerID.equals(castOther.farmerID)
			&& (this.tech_assistant_ID == castOther.tech_assistant_ID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.farmerID.hashCode();
		hash = hash * prime + this.tech_assistant_ID;
		
		return hash;
	}
}