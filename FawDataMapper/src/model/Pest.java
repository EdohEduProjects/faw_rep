package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the pest database table.
 * 
 */
@Entity
@Table(name="pest")
@NamedQuery(name="Pest.findAll", query="SELECT p FROM Pest p")
public class Pest implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PestPK id;

	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Date date;

	@Column(length=45)
	private String dominateColor;

	@Lob
	@Column(nullable=false)
	private byte[] picture;

	//bi-directional many-to-one association to FieldLocation
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="farmerID", referencedColumnName="farmerID", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="field_ID", referencedColumnName="field_ID", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="tech_assistant_ID", referencedColumnName="tech_assistant_ID", nullable=false, insertable=false, updatable=false)
		})
	private FieldLocation fieldLocation;

	//bi-directional many-to-one association to TypeOfPest
	@OneToMany(mappedBy="pest")
	private List<TypeOfPest> typeOfPests;

	public Pest() {
	}

	public PestPK getId() {
		return this.id;
	}

	public void setId(PestPK id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDominateColor() {
		return this.dominateColor;
	}

	public void setDominateColor(String dominateColor) {
		this.dominateColor = dominateColor;
	}

	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public FieldLocation getFieldLocation() {
		return this.fieldLocation;
	}

	public void setFieldLocation(FieldLocation fieldLocation) {
		this.fieldLocation = fieldLocation;
	}

	public List<TypeOfPest> getTypeOfPests() {
		return this.typeOfPests;
	}

	public void setTypeOfPests(List<TypeOfPest> typeOfPests) {
		this.typeOfPests = typeOfPests;
	}

	public TypeOfPest addTypeOfPest(TypeOfPest typeOfPest) {
		getTypeOfPests().add(typeOfPest);
		typeOfPest.setPest(this);

		return typeOfPest;
	}

	public TypeOfPest removeTypeOfPest(TypeOfPest typeOfPest) {
		getTypeOfPests().remove(typeOfPest);
		typeOfPest.setPest(null);

		return typeOfPest;
	}

}