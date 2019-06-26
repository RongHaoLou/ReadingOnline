package entity;

import java.io.Serializable;

public class Publish implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String publishName;
	long publishNumber;
	String copyright;
	public Publish() {
		super();
	}
	public Publish(int id, String publishName, long publishNumber, String copyright) {
		super();
		this.id = id;
		this.publishName = publishName;
		this.publishNumber = publishNumber;
		this.copyright = copyright;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPublishName() {
		return publishName;
	}
	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}
	public long getpublishNumber() {
		return publishNumber;
	}
	public void setpublishNumber(long publishNumber) {
		this.publishNumber = publishNumber;
	}
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Publish(String publishName, long publishNumber, String copyright) {
		super();
		this.publishName = publishName;
		this.publishNumber = publishNumber;
		this.copyright = copyright;
	}
	@Override
	public String toString() {
		return "Publish [id=" + id + ", publishName=" + publishName + ", publishNumber=" + publishNumber + ", copyright="
				+ copyright + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((copyright == null) ? 0 : copyright.hashCode());
		result = prime * result + id;
		result = prime * result + (int) (publishNumber ^ (publishNumber >>> 32));
		result = prime * result + ((publishName == null) ? 0 : publishName.hashCode());
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
		Publish other = (Publish) obj;
		if (copyright == null) {
			if (other.copyright != null)
				return false;
		} else if (!copyright.equals(other.copyright))
			return false;
		if (id != other.id)
			return false;
		if (publishNumber != other.publishNumber)
			return false;
		if (publishName == null) {
			if (other.publishName != null)
				return false;
		} else if (!publishName.equals(other.publishName))
			return false;
		return true;
	}
	

}
