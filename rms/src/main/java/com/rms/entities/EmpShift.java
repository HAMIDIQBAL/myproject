package com.rms.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "empshift")
public class EmpShift {
	@Id
	private int id;
	@Transient
	private String eid;
	@Column(name = "date")
	private Date date;
	
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "E_ID") Employee employee;
	 */
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "EmpShift [id=" + id + ", eid=" + eid + ", date=" + date + "]";
	}
	
}
