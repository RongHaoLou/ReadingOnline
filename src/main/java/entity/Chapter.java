package entity;

import java.io.Serializable;

public class Chapter implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int id;
	String chapterName;
	int bookId;
	public Chapter() {
		super();
	}
	public Chapter(int id, String chapterName, int bookId) {
		super();
		this.id = id;
		this.chapterName = chapterName;
		this.bookId = bookId;
	}
	
	public Chapter(String chapterName, int bookId) {
		super();
		this.chapterName = chapterName;
		this.bookId = bookId;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChapterName() {
		return chapterName;
	}
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
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
		return "Chapter [id=" + id + ", chapterName=" + chapterName + ", bookId=" + bookId +"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		result = prime * result + ((chapterName == null) ? 0 : chapterName.hashCode());
		result = prime * result + id;
		
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
		Chapter other = (Chapter) obj;
		if (bookId != other.bookId)
			return false;
		if (chapterName == null) {
			if (other.chapterName != null)
				return false;
		} else if (!chapterName.equals(other.chapterName))
			return false;
		if (id != other.id)
			return false;
		
		return true;
	}
	
}
