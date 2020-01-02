package com.admin.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dining")
public class Dining extends BaseEntity{
	private String diningId;
	private int capacity;
	public Dining() {
		super();
	}
	public String getDiningId() {
		return diningId;
	}
	public void setDiningId(String diningId) {
		this.diningId = diningId;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Dining [diningId=" + diningId + ", capacity=" + capacity + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + capacity;
		result = prime * result + ((diningId == null) ? 0 : diningId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dining other = (Dining) obj;
		if (capacity != other.capacity)
			return false;
		if (diningId == null) {
			if (other.diningId != null)
				return false;
		} else if (!diningId.equals(other.diningId))
			return false;
		return true;
	}	
}
