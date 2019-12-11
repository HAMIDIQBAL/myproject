package com.rms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShiftType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String stype;
	private int start;
	private int end;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStype() {
		return stype;
	}
	public void setStype(String stype) {
		this.stype = stype;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	@Override
	public String toString() {
		return "ShiftType [id=" + id + ", stype=" + stype + ", start=" + start + ", end=" + end + "]";
	}
	
	
}
