package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the field_location database table.
 * 
 */
@Entity
@Table(name="field_location")
@NamedQuery(name="FieldLocation.findAll", query="SELECT f FROM FieldLocation f")
public class FieldLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FieldLocationPK id;

	@Column(length=45)
	private String northeast_LaLong;

	@Column(length=45)
	private String northwest_LaLong;

	@Column(length=45)
	private String southeast_LaLong;

	@Column(length=45)
	private String southwest_LaLong;

	//bi-directional many-to-one association to Farmer
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="farmerID", referencedColumnName="farmerID", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="tech_assistant_ID", referencedColumnName="tech_assistant_ID", nullable=false, insertable=false, updatable=false)
		})
	private Farmer farmer;

	//bi-directional many-to-one association to Pest
	@OneToMany(mappedBy="fieldLocation")
	private List<Pest> pests;

	//bi-directional many-to-one association to TreatmentProtocol
	@OneToMany(mappedBy="fieldLocation")
	private List<TreatmentProtocol> treatmentProtocols;

	public FieldLocation() {
	}

	public FieldLocationPK getId() {
		return this.id;
	}

	public void setId(FieldLocationPK id) {
		this.id = id;
	}

	public String getNortheast_LaLong() {
		return this.northeast_LaLong;
	}

	public void setNortheast_LaLong(String northeast_LaLong) {
		this.northeast_LaLong = northeast_LaLong;
	}

	public String getNorthwest_LaLong() {
		return this.northwest_LaLong;
	}

	public void setNorthwest_LaLong(String northwest_LaLong) {
		this.northwest_LaLong = northwest_LaLong;
	}

	public String getSoutheast_LaLong() {
		return this.southeast_LaLong;
	}

	public void setSoutheast_LaLong(String southeast_LaLong) {
		this.southeast_LaLong = southeast_LaLong;
	}

	public String getSouthwest_LaLong() {
		return this.southwest_LaLong;
	}

	public void setSouthwest_LaLong(String southwest_LaLong) {
		this.southwest_LaLong = southwest_LaLong;
	}

	public Farmer getFarmer() {
		return this.farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public List<Pest> getPests() {
		return this.pests;
	}

	public void setPests(List<Pest> pests) {
		this.pests = pests;
	}

	public Pest addPest(Pest pest) {
		getPests().add(pest);
		pest.setFieldLocation(this);

		return pest;
	}

	public Pest removePest(Pest pest) {
		getPests().remove(pest);
		pest.setFieldLocation(null);

		return pest;
	}

	public List<TreatmentProtocol> getTreatmentProtocols() {
		return this.treatmentProtocols;
	}

	public void setTreatmentProtocols(List<TreatmentProtocol> treatmentProtocols) {
		this.treatmentProtocols = treatmentProtocols;
	}

	public TreatmentProtocol addTreatmentProtocol(TreatmentProtocol treatmentProtocol) {
		getTreatmentProtocols().add(treatmentProtocol);
		treatmentProtocol.setFieldLocation(this);

		return treatmentProtocol;
	}

	public TreatmentProtocol removeTreatmentProtocol(TreatmentProtocol treatmentProtocol) {
		getTreatmentProtocols().remove(treatmentProtocol);
		treatmentProtocol.setFieldLocation(null);

		return treatmentProtocol;
	}

}