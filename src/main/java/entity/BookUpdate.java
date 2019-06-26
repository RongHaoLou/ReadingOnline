package entity;

public class BookUpdate {
	private int bookId;
	private String bookName;
	private String authorName;
	private double bookPrice;
	private String bookImage;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
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
	@Override
	public String toString() {
		return "BookUpdate [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", bookPrice="
				+ bookPrice + ", bookImage=" + bookImage + "]";
	}
	public BookUpdate(int bookId, String bookName, String authorName, double bookPrice, String bookImage) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = bookPrice;
		this.bookImage = bookImage;
	}
	public BookUpdate() {
		super();
	}
	
}
