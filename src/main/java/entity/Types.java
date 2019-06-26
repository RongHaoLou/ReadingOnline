package entity;

import java.io.Serializable;

public class Types implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String typesName;
	public Types() {
		super();
	}
	public Types(int id, String typesName) {
		super();
		this.id = id;
		this.typesName = typesName;
	}
	public Types(String typesName) {
		super();
		this.typesName = typesName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypesName() {
		return typesName;
	}
	public void setTypesName(String typesName) {
		this.typesName = typesName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Types [id=" + id + ", typesName=" + typesName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((typesName == null) ? 0 : typesName.hashCode());
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
		Types other = (Types) obj;
		if (id != other.id)
			return false;
		if (typesName == null) {
			if (other.typesName != null)
				return false;
		} else if (!typesName.equals(other.typesName))
			return false;
		return true;
	}
	
}
