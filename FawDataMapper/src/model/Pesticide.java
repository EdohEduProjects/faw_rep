package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the pesticide database table.
 * 
 */
@Entity
@Table(name="pesticide")
@NamedQuery(name="Pesticide.findAll", query="SELECT p FROM Pesticide p")
public class Pesticide implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int pesticide_ID;

	@Lob
	@Column(name="mode_of_use", nullable=false)
	private String modeOfUse;

	@Column(name="pesticide_adverse", nullable=false, length=45)
	private String pesticideAdverse;

	@Column(name="pesticide_category", nullable=false, length=45)
	private String pesticideCategory;

	@Column(nullable=false, length=45)
	private String productname;

	//bi-directional many-to-many association to TreatmentProtocol
	@ManyToMany(mappedBy="pesticides")
	private List<TreatmentProtocol> treatmentProtocols;

	//bi-directional many-to-one association to TypeOfPest
	@OneToMany(mappedBy="pesticide")
	private List<TypeOfPest> typeOfPests;

	public Pesticide() {
	}

	public int getPesticide_ID() {
		return this.pesticide_ID;
	}

	public void setPesticide_ID(int pesticide_ID) {
		this.pesticide_ID = pesticide_ID;
	}

	public String getModeOfUse() {
		return this.modeOfUse;
	}

	public void setModeOfUse(String modeOfUse) {
		this.modeOfUse = modeOfUse;
	}

	public String getPesticideAdverse() {
		return this.pesticideAdverse;
	}

	public void setPesticideAdverse(String pesticideAdverse) {
		this.pesticideAdverse = pesticideAdverse;
	}

	public String getPesticideCategory() {
		return this.pesticideCategory;
	}

	public void setPesticideCategory(String pesticideCategory) {
		this.pesticideCategory = pesticideCategory;
	}

	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public List<TreatmentProtocol> getTreatmentProtocols() {
		return this.treatmentProtocols;
	}

	public void setTreatmentProtocols(List<TreatmentProtocol> treatmentProtocols) {
		this.treatmentProtocols = treatmentProtocols;
	}

	public List<TypeOfPest> getTypeOfPests() {
		return this.typeOfPests;
	}

	public void setTypeOfPests(List<TypeOfPest> typeOfPests) {
		this.typeOfPests = typeOfPests;
	}

	public TypeOfPest addTypeOfPest(TypeOfPest typeOfPest) {
		getTypeOfPests().add(typeOfPest);
		typeOfPest.setPesticide(this);

		return typeOfPest;
	}

	public TypeOfPest removeTypeOfPest(TypeOfPest typeOfPest) {
		getTypeOfPests().remove(typeOfPest);
		typeOfPest.setPesticide(null);

		return typeOfPest;
	}

}