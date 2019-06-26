package entity;

import java.io.Serializable;

public class Author implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String authorName;
	String authorInfo;
	long authorBooks;
	public Author() {
		super();
	}
	public Author(int id, String authorName, String authorInfo, long authorBooks) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.authorInfo = authorInfo;
		this.authorBooks = authorBooks;
	}
	
	public Author(String authorName, String authorInfo, long authorBooks) {
		super();
		this.authorName = authorName;
		this.authorInfo = authorInfo;
		this.authorBooks = authorBooks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorInfo() {
		return authorInfo;
	}
	public void setAuthorInfo(String authorInfo) {
		this.authorInfo = authorInfo;
	}
	public long getAuthorBooks() {
		return authorBooks;
	}
	public void setAuthorBooks(long authorBooks) {
		this.authorBooks = authorBooks;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", authorName=" + authorName + ", authorInfo=" + authorInfo + ", authorBooks="
				+ authorBooks + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (authorBooks ^ (authorBooks >>> 32));
		result = prime * result + ((authorInfo == null) ? 0 : authorInfo.hashCode());
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
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
		Author other = (Author) obj;
		if (authorBooks != other.authorBooks)
			return false;
		if (authorInfo == null) {
			if (other.authorInfo != null)
				return false;
		} else if (!authorInfo.equals(other.authorInfo))
			return false;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
}
