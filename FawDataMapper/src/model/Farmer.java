package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the farmer database table.
 * 
 */
@Entity
@Table(name="farmer")
@NamedQuery(name="Farmer.findAll", query="SELECT f FROM Farmer f")
public class Farmer implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FarmerPK id;

	@Column(length=255)
	private String addr;

	@Column(length=255)
	private String farmerlastname;

	@Column(length=255)
	private String farmername;

	//bi-directional many-to-one association to TechAssistant
	@ManyToOne
	@JoinColumn(name="tech_assistant_ID", nullable=false, insertable=false, updatable=false)
	private TechAssistant techAssistant;

	//bi-directional many-to-one association to FieldLocation
	@OneToMany(mappedBy="farmer")
	private List<FieldLocation> fieldLocations;

	public Farmer() {
	}

	public FarmerPK getId() {
		return this.id;
	}

	public void setId(FarmerPK id) {
		this.id = id;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getFarmerlastname() {
		return this.farmerlastname;
	}

	public void setFarmerlastname(String farmerlastname) {
		this.farmerlastname = farmerlastname;
	}

	public String getFarmername() {
		return this.farmername;
	}

	public void setFarmername(String farmername) {
		this.farmername = farmername;
	}

	public TechAssistant getTechAssistant() {
		return this.techAssistant;
	}

	public void setTechAssistant(TechAssistant techAssistant) {
		this.techAssistant = techAssistant;
	}

	public List<FieldLocation> getFieldLocations() {
		return this.fieldLocations;
	}

	public void setFieldLocations(List<FieldLocation> fieldLocations) {
		this.fieldLocations = fieldLocations;
	}

	public FieldLocation addFieldLocation(FieldLocation fieldLocation) {
		getFieldLocations().add(fieldLocation);
		fieldLocation.setFarmer(this);

		return fieldLocation;
	}

	public FieldLocation removeFieldLocation(FieldLocation fieldLocation) {
		getFieldLocations().remove(fieldLocation);
		fieldLocation.setFarmer(null);

		return fieldLocation;
	}

}