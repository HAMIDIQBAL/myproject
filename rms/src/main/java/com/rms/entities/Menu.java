package com.rms.entities;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Menu extends BaseEntity{
	@Transient
	private String rId;
	@Transient
	private String iId;
	@Column(name = "date")
	private Date date;
	public Menu() {
		super();
	}
	public String getrId() {
		return rId;
	}
	public void setrId(String rId) {
		this.rId = rId;
	}
	public String getiId() {
		return iId;
	}
	public void setiId(String iId) {
		this.iId = iId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Menu [rId=" + rId + ", iId=" + iId + ", date=" + date + "]";
	}

}
