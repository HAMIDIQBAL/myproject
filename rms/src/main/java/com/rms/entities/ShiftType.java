package com.rms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shift_type")
public class ShiftType extends BaseEntity {

	private String shiftType;
	private int start;
	private int end;

	public ShiftType() {
		super();
	}

	public String getShiftType() {
		return shiftType;
	}

	public void setShiftType(String shiftType) {
		this.shiftType = shiftType;
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
		return "ShiftType [shiftType=" + shiftType + ", start=" + start + ", end=" + end + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + end;
		result = prime * result + ((shiftType == null) ? 0 : shiftType.hashCode());
		result = prime * result + start;
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
		ShiftType other = (ShiftType) obj;
		if (end != other.end)
			return false;
		if (shiftType == null) {
			if (other.shiftType != null)
				return false;
		} else if (!shiftType.equals(other.shiftType))
			return false;
		if (start != other.start)
			return false;
		return true;
	}
}
