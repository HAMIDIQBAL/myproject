package com.admin.entities;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@Column(name = "stid")
	String stId;
	@Column(name = "stname")
	String stName;

	@OneToMany(mappedBy = "state")
	Set<City> cities;

	public Set<City> getCities() {
		return cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStId() {
		return stId;
	}

	public void setStId(String stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", stId=" + stId + ", stName=" + stName + ", cities=" + cities + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((stId == null) ? 0 : stId.hashCode());
		result = prime * result + ((stName == null) ? 0 : stName.hashCode());
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
		State other = (State) obj;

		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;

		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (stId == null) {
			if (other.stId != null)
				return false;
		} else if (!stId.equals(other.stId))
			return false;
		if (stName == null) {
			if (other.stName != null)
				return false;
		} else if (!stName.equals(other.stName))
			return false;
		return true;
	}

}
