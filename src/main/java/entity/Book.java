package entity;

import java.io.Serializable;

public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String bookName;
	double bookPrice;
	String bookImage;
	String bookDescription;
	boolean state;
	int authorId;
	int typesId;
	int typeId;
	int publishId;
	public Book() {
		super();
	}
	public Book(int id, String bookName, double bookPrice, String bookImage, String bookDescription, boolean state,
			int authorId, int typesId, int typeId, int publishId) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookImage = bookImage;
		this.bookDescription = bookDescription;
		this.state = state;
		this.authorId = authorId;
		this.typesId = typesId;
		this.typeId = typeId;
		this.publishId = publishId;
	}
	public Book(String bookName, double bookPrice, String bookImage, String bookDescription, boolean state,
			int authorId, int typesId, int typeId, int publishId) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookImage = bookImage;
		this.bookDescription = bookDescription;
		this.state = state;
		this.authorId = authorId;
		this.typesId = typesId;
		this.typeId = typeId;
		this.publishId = publishId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public int getTypesId() {
		return typesId;
	}
	public void setTypesId(int typesId) {
		this.typesId = typesId;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public int getPublishId() {
		return publishId;
	}
	public void setPublishId(int publishId) {
		this.publishId = publishId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + authorId;
		result = prime * result + ((bookDescription == null) ? 0 : bookDescription.hashCode());
		result = prime * result + ((bookImage == null) ? 0 : bookImage.hashCode());
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(bookPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + publishId;
		result = prime * result + (state ? 1231 : 1237);
		result = prime * result + typeId;
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
		Book other = (Book) obj;
		if (authorId != other.authorId)
			return false;
		if (bookDescription == null) {
			if (other.bookDescription != null)
				return false;
		} else if (!bookDescription.equals(other.bookDescription))
			return false;
		if (bookImage == null) {
			if (other.bookImage != null)
				return false;
		} else if (!bookImage.equals(other.bookImage))
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (Double.doubleToLongBits(bookPrice) != Double.doubleToLongBits(other.bookPrice))
			return false;
		if (id != other.id)
			return false;
		if (publishId != other.publishId)
			return false;
		if (state != other.state)
			return false;
		if (typeId != other.typeId)
			return false;
		if (typesId != other.typesId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookImage=" + bookImage
				+ ", bookDescription=" + bookDescription + ", state=" + state + ", authorId=" + authorId + ", typesId="
				+ typesId + ", typeId=" + typeId + ", publishId=" + publishId + "]";
	}
	
}
