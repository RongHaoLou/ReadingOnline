package entity;

import java.io.Serializable;

public class Unpaid implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int id;
	long unpaid;
	int bookId;
	
	public Unpaid() {
		super();
	}
	public Unpaid(int id, long unpaid, int bookId) {
		super();
		this.id = id;
		this.unpaid = unpaid;
		this.bookId = bookId;
	}
	public Unpaid(long unpaid, int bookId) {
		super();
		this.unpaid = unpaid;
		this.bookId = bookId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getUnpaid() {
		return unpaid;
	}
	public void setUnpaid(long unpaid) {
		this.unpaid = unpaid;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Unpaid [id=" + id + ", unpaid=" + unpaid + ", bookId=" + bookId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		result = prime * result + id;
		result = prime * result + (int) (unpaid ^ (unpaid >>> 32));
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
		Unpaid other = (Unpaid) obj;
		if (bookId != other.bookId)
			return false;
		if (id != other.id)
			return false;
		if (unpaid != other.unpaid)
			return false;
		return true;
	}
	
}
