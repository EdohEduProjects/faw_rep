package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the type_of_pest database table.
 * 
 */
@Entity
@Table(name="type_of_pest")
@NamedQuery(name="TypeOfPest.findAll", query="SELECT t FROM TypeOfPest t")
public class TypeOfPest implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TypeOfPestPK id;

	@Column(nullable=false, length=45)
	private String category;

	@Column(nullable=false)
	private Object characteristics;

	@Column(name="scientific_name", nullable=false, length=45)
	private String scientificName;

	//bi-directional many-to-one association to Pest
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="farmerID", referencedColumnName="farmerID", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="field_ID", referencedColumnName="field_ID", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="pest_ID", referencedColumnName="pest_ID", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="tech_assistant_ID", referencedColumnName="tech_assistant_ID", nullable=false, insertable=false, updatable=false)
		})
	private Pest pest;

	//bi-directional many-to-one association to Pesticide
	@ManyToOne
	@JoinColumn(name="pesticide_ID", nullable=false, insertable=false, updatable=false)
	private Pesticide pesticide;

	public TypeOfPest() {
	}

	public TypeOfPestPK getId() {
		return this.id;
	}

	public void setId(TypeOfPestPK id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Object getCharacteristics() {
		return this.characteristics;
	}

	public void setCharacteristics(Object characteristics) {
		this.characteristics = characteristics;
	}

	public String getScientificName() {
		return this.scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	public Pest getPest() {
		return this.pest;
	}

	public void setPest(Pest pest) {
		this.pest = pest;
	}

	public Pesticide getPesticide() {
		return this.pesticide;
	}

	public void setPesticide(Pesticide pesticide) {
		this.pesticide = pesticide;
	}

}