package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the treatment_protocols database table.
 * 
 */
@Entity
@Table(name="treatment_protocols")
@NamedQuery(name="TreatmentProtocol.findAll", query="SELECT t FROM TreatmentProtocol t")
public class TreatmentProtocol implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TreatmentProtocolPK id;

	@Column(nullable=false)
	private Object description;

	@Column(name="treatment_duration", nullable=false)
	private Timestamp treatmentDuration;

	@Temporal(TemporalType.DATE)
	@Column(name="treatment_end_period", nullable=false)
	private Date treatmentEndPeriod;

	@Column(name="treatment_recommendation", nullable=false, length=45)
	private String treatmentRecommendation;

	@Column(name="treatment_results", nullable=false, length=45)
	private String treatmentResults;

	@Temporal(TemporalType.DATE)
	@Column(name="treatment_start_period", nullable=false)
	private Date treatmentStartPeriod;

	//bi-directional many-to-one association to FieldLocation
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="farmerID", referencedColumnName="farmerID", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="field_location_field_ID", referencedColumnName="field_ID", nullable=false, insertable=false, updatable=false),
		@JoinColumn(name="tech_assistant_ID", referencedColumnName="tech_assistant_ID", nullable=false, insertable=false, updatable=false)
		})
	private FieldLocation fieldLocation;

	//bi-directional many-to-many association to Pesticide
	@ManyToMany
	@JoinTable(
		name="pesticide_has_treatment_protocols"
		, joinColumns={
			@JoinColumn(name="farmerID", referencedColumnName="farmerID", nullable=false),
			@JoinColumn(name="field_ID", referencedColumnName="field_location_field_ID", nullable=false),
			@JoinColumn(name="tech_assistant_ID", referencedColumnName="tech_assistant_ID", nullable=false),
			@JoinColumn(name="treatment_ID", referencedColumnName="treatment_ID", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="pesticide_ID", nullable=false)
			}
		)
	private List<Pesticide> pesticides;

	public TreatmentProtocol() {
	}

	public TreatmentProtocolPK getId() {
		return this.id;
	}

	public void setId(TreatmentProtocolPK id) {
		this.id = id;
	}

	public Object getDescription() {
		return this.description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

	public Timestamp getTreatmentDuration() {
		return this.treatmentDuration;
	}

	public void setTreatmentDuration(Timestamp treatmentDuration) {
		this.treatmentDuration = treatmentDuration;
	}

	public Date getTreatmentEndPeriod() {
		return this.treatmentEndPeriod;
	}

	public void setTreatmentEndPeriod(Date treatmentEndPeriod) {
		this.treatmentEndPeriod = treatmentEndPeriod;
	}

	public String getTreatmentRecommendation() {
		return this.treatmentRecommendation;
	}

	public void setTreatmentRecommendation(String treatmentRecommendation) {
		this.treatmentRecommendation = treatmentRecommendation;
	}

	public String getTreatmentResults() {
		return this.treatmentResults;
	}

	public void setTreatmentResults(String treatmentResults) {
		this.treatmentResults = treatmentResults;
	}

	public Date getTreatmentStartPeriod() {
		return this.treatmentStartPeriod;
	}

	public void setTreatmentStartPeriod(Date treatmentStartPeriod) {
		this.treatmentStartPeriod = treatmentStartPeriod;
	}

	public FieldLocation getFieldLocation() {
		return this.fieldLocation;
	}

	public void setFieldLocation(FieldLocation fieldLocation) {
		this.fieldLocation = fieldLocation;
	}

	public List<Pesticide> getPesticides() {
		return this.pesticides;
	}

	public void setPesticides(List<Pesticide> pesticides) {
		this.pesticides = pesticides;
	}

}