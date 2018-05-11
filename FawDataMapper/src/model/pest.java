package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * he persistent class for the pests database table
 */
@Entity
@Table(name="pests")
@NamedQuery(name="pest.findAll", query="SELECT p FROM pest p")
@TableGenerator(name = "pests")
public class pest implements Serializable {

	private static final long serialVersionUID = 1L;

	public pest() {
	}

	@Id
	private long id;
	
	@Column(name = "dominateColor")
	private String dominateColor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDominateColor() {
		return dominateColor;
	}

	public void setDominateColor(String param) {
		this.dominateColor = param;
	}

}