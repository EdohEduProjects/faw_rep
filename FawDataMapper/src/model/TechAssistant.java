package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tech_assistant database table.
 * 
 */
@Entity
@Table(name="tech_assistant")
@NamedQuery(name="TechAssistant.findAll", query="SELECT t FROM TechAssistant t")
public class TechAssistant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int tech_assistant_ID;

	@Column(name="tech_assistant_firstame", nullable=false, length=45)
	private String techAssistantFirstame;

	@Column(name="tech_assistant_lastname", nullable=false, length=45)
	private String techAssistantLastname;

	@Column(nullable=false, length=45)
	private String tech_assistantcol_user_ID;

	//bi-directional many-to-one association to Farmer
	@OneToMany(mappedBy="techAssistant")
	private List<Farmer> farmers;

	public TechAssistant() {
	}

	public int getTech_assistant_ID() {
		return this.tech_assistant_ID;
	}

	public void setTech_assistant_ID(int tech_assistant_ID) {
		this.tech_assistant_ID = tech_assistant_ID;
	}

	public String getTechAssistantFirstame() {
		return this.techAssistantFirstame;
	}

	public void setTechAssistantFirstame(String techAssistantFirstame) {
		this.techAssistantFirstame = techAssistantFirstame;
	}

	public String getTechAssistantLastname() {
		return this.techAssistantLastname;
	}

	public void setTechAssistantLastname(String techAssistantLastname) {
		this.techAssistantLastname = techAssistantLastname;
	}

	public String getTech_assistantcol_user_ID() {
		return this.tech_assistantcol_user_ID;
	}

	public void setTech_assistantcol_user_ID(String tech_assistantcol_user_ID) {
		this.tech_assistantcol_user_ID = tech_assistantcol_user_ID;
	}

	public List<Farmer> getFarmers() {
		return this.farmers;
	}

	public void setFarmers(List<Farmer> farmers) {
		this.farmers = farmers;
	}

	public Farmer addFarmer(Farmer farmer) {
		getFarmers().add(farmer);
		farmer.setTechAssistant(this);

		return farmer;
	}

	public Farmer removeFarmer(Farmer farmer) {
		getFarmers().remove(farmer);
		farmer.setTechAssistant(null);

		return farmer;
	}

}