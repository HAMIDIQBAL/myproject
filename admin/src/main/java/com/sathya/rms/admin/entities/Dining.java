package com.sathya.rms.admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dining {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String did;
	private int capacity;
	
	/*
	 * @OneToOne(mappedBy = "dining") RestDining restDining
	 */;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Dining [id=" + id + ", did=" + did + ", capacity=" + capacity + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + ((did == null) ? 0 : did.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dining other = (Dining) obj;
		if (capacity != other.capacity)
			return false;
		if (did == null) {
			if (other.did != null)
				return false;
		} else if (!did.equals(other.did))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
