package com.rms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Employee {
	@Id
	private int id;
	@Column(name = "eid")
	private String eid;
	@Column(name = "ename")
	private String eName;
	@Column(name = "salary")
	private double salary;
	@Column(name = "phno")
	private long phno;
	@Transient
	private String desigid;
	@Transient
	private String rid;
	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "DESIG_ID") Designation designation;
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "R_ID") Restaurant restaurant;
	 */
	
	/*
	 * @OneToMany(mappedBy = "employee") EmpShift empShift;
	 */
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", eid=" + eid + ", eName=" + eName + ", salary=" + salary + ", phno=" + phno
				+ "]";
	}
}
