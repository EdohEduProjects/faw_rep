package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the treatment_protocols database table.
 * 
 */
@Embeddable
public class TreatmentProtocolPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(unique=true, nullable=false)
	private int treatment_ID;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int field_location_field_ID;

	@Column(insertable=false, updatable=false, unique=true, nullable=false, length=255)
	private String farmerID;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int tech_assistant_ID;

	public TreatmentProtocolPK() {
	}
	public int getTreatment_ID() {
		return this.treatment_ID;
	}
	public void setTreatment_ID(int treatment_ID) {
		this.treatment_ID = treatment_ID;
	}
	public int getField_location_field_ID() {
		return this.field_location_field_ID;
	}
	public void setField_location_field_ID(int field_location_field_ID) {
		this.field_location_field_ID = field_location_field_ID;
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
		if (!(other instanceof TreatmentProtocolPK)) {
			return false;
		}
		TreatmentProtocolPK castOther = (TreatmentProtocolPK)other;
		return 
			(this.treatment_ID == castOther.treatment_ID)
			&& (this.field_location_field_ID == castOther.field_location_field_ID)
			&& this.farmerID.equals(castOther.farmerID)
			&& (this.tech_assistant_ID == castOther.tech_assistant_ID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.treatment_ID;
		hash = hash * prime + this.field_location_field_ID;
		hash = hash * prime + this.farmerID.hashCode();
		hash = hash * prime + this.tech_assistant_ID;
		
		return hash;
	}
}