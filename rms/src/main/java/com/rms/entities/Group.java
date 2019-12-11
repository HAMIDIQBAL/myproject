package com.rms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "grouptab")
public class Group {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "gid")
	private String gId;
	@Column(name = "gname")
	private String gName;
	
	/*
	 * @OneToMany(mappedBy = "group") Item item;
	 */
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getgId() {
		return gId;
	}
	public void setgId(String gId) {
		this.gId = gId;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gId == null) ? 0 : gId.hashCode());
		result = prime * result + ((gName == null) ? 0 : gName.hashCode());
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
		Group other = (Group) obj;
		if (gId == null) {
			if (other.gId != null)
				return false;
		} else if (!gId.equals(other.gId))
			return false;
		if (gName == null) {
			if (other.gName != null)
				return false;
		} else if (!gName.equals(other.gName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Group [id=" + id + ", gId=" + gId + ", gName=" + gName + "]";
	}
	
}
