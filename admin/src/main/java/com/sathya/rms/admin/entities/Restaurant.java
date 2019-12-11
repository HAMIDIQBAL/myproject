package com.sathya.rms.admin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "rid")
	private String rId;
	@Column(name = "phno")
	private long phno;
	@Column(name = "email")
	private String email;
	@Transient
	private String locid;

	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "LOC_ID") Location location;
	 * 
	 * @OneToOne(mappedBy = "restaurant2") RestDining restDining2;
	 * 
	 * @OneToOne(mappedBy = "restaurant") Employee employee;
	 * 
	 * @OneToOne(mappedBy = "restaurant") Menu menu;
	 */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRId() {
		return rId;
	}

	public void setRId(String rId) {
		this.rId = rId;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
