package entity;

import java.io.Serializable;

public class ShoppingCart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	int userId;
	int book_id;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + book_id;
		result = prime * result + id;
		result = prime * result + userId;
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
		ShoppingCart other = (ShoppingCart) obj;
		if (book_id != other.book_id)
			return false;
		if (id != other.id)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ShoppinCart [id=" + id + ", userId=" + userId + ", book_id=" + book_id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public ShoppingCart(int userId, int book_id) {
		super();
		this.userId = userId;
		this.book_id = book_id;
	}
	public ShoppingCart(int id, int userId, int book_id) {
		super();
		this.id = id;
		this.userId = userId;
		this.book_id = book_id;
	}
	public ShoppingCart() {
		super();
	}
}
