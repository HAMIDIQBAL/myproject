package com.admin.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Designation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "desigid")
	private String desigId;
	@Column(name = "designame")
	private String desigName;
	
	/*
	 * @OneToOne(mappedBy = "designation") Employee employee;
	 */
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesigId() {
		return desigId;
	}
	public void setDesigId(String desigId) {
		this.desigId = desigId;
	}
	public String getDesigName() {
		return desigName;
	}
	public void setDesigName(String desigName) {
		this.desigName = desigName;
	}
	@Override
	public String toString() {
		return "Designation [id=" + id + ", desigId=" + desigId + ", desigName=" + desigName + "]";
	}

}
