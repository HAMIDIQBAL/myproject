package com.rms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class RestDining {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Transient
	private String did;
	@Transient
	private String rId;
	
		
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "D_ID") Dining dining;
	 * 
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "R_ID") Restaurant restaurant2;
	 * 
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getrId() {
		return rId;
	}
	public void setrId(String rId) {
		this.rId = rId;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "RestDining [id=" + id + ", did=" + did + ", rId=" + rId + "]";
	}
	
}
