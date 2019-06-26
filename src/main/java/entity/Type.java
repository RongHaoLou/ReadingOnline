package entity;

import java.io.Serializable;

public class Type implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String typeName;
	int typesId;
	public Type(int id, String typeName, int typesId) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.typesId = typesId;
	}
	public Type() {
		super();
	}
	
	public Type(String typeName, int typesId) {
		super();
		this.typeName = typeName;
		this.typesId = typesId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getTypesId() {
		return typesId;
	}
	public void setTypesId(int typesId) {
		this.typesId = typesId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((typeName == null) ? 0 : typeName.hashCode());
		result = prime * result + typesId;
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
		Type other = (Type) obj;
		if (id != other.id)
			return false;
		if (typeName == null) {
			if (other.typeName != null)
				return false;
		} else if (!typeName.equals(other.typeName))
			return false;
		if (typesId != other.typesId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Type [id=" + id + ", typeName=" + typeName + ", typesId=" + typesId + "]";
	}
}
