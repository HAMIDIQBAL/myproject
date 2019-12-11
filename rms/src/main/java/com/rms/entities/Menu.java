package com.rms.entities;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Menu {
	@Id
	private int id;
	@Transient
	private String rId;
	@Transient
	private String iId;
	@Column(name = "date")
	private Date date;
	
	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "R_ID") Restaurant restaurant;
	 */
	
	/*
	 * @OneToMany
	 * 
	 * @JoinColumn(name = "I_ID") Item item;
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
	public String getRId() {
		return rId;
	}
	public void setRId(String rId) {
		this.rId = rId;
	}
	public String getIId() {
		return iId;
	}
	public void setIId(String iId) {
		this.iId = iId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
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
		Menu other = (Menu) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", rid=" + rId + ", iid=" + iId + ", date=" + date + "]";
	}
	

}
