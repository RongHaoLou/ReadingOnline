package entity;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String orderNumber;
	Date buyTime;
	int bookId;
	int userId;
	public Order() {
		super();
	}
	public Order(String orderNumber, Date buyTime, int bookId, int userId) {
		super();
		this.orderNumber = orderNumber;
		this.buyTime = buyTime;
		this.bookId = bookId;
		this.userId = userId;
	}
	public Order(int id, String orderNumber, Date buyTime, int bookId, int userId) {
		super();
		this.id = id;
		this.orderNumber = orderNumber;
		this.buyTime = buyTime;
		this.bookId = bookId;
		this.userId = userId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Date getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNumber=" + orderNumber + ", buyTime=" + buyTime + ", bookId=" + bookId
				+ ", userId=" + userId + "]";
	}
}
