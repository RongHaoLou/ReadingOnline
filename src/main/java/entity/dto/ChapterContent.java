package entity.dto;

import java.io.Serializable;

public class ChapterContent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bookName;
	private String chapterName;
	private String sectionContent;
	public ChapterContent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChapterContent(String bookName, String chapterName, String sectionContent) {
		super();
		this.bookName = bookName;
		this.chapterName = chapterName;
		this.sectionContent = sectionContent;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getChapterName() {
		return chapterName;
	}
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}
	public String getSectionContent() {
		return sectionContent;
	}
	public void setSectionContent(String sectionContent) {
		this.sectionContent = sectionContent;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + ((chapterName == null) ? 0 : chapterName.hashCode());
		result = prime * result + ((sectionContent == null) ? 0 : sectionContent.hashCode());
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
		ChapterContent other = (ChapterContent) obj;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (chapterName == null) {
			if (other.chapterName != null)
				return false;
		} else if (!chapterName.equals(other.chapterName))
			return false;
		if (sectionContent == null) {
			if (other.sectionContent != null)
				return false;
		} else if (!sectionContent.equals(other.sectionContent))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ChapterContent [bookName=" + bookName + ", chapterName=" + chapterName + ", sectionContent="
				+ sectionContent + "]";
	}
	
	
	

}
