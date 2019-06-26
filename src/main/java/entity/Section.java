package entity;

import java.io.Serializable;

public class Section implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String sectionContent;
	int chapterId;
	public Section() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSectionContent() {
		return sectionContent;
	}
	public void setSectionContent(String sectionContent) {
		this.sectionContent = sectionContent;
	}
	public int getChapterId() {
		return chapterId;
	}
	public void setChapterId(int chapterId) {
		this.chapterId = chapterId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Section(int id, String sectionContent, int chapterId) {
		super();
		this.id = id;
		this.sectionContent = sectionContent;
		this.chapterId = chapterId;
	}
	public Section(String sectionContent, int chapterId) {
		super();
		this.sectionContent = sectionContent;
		this.chapterId = chapterId;
	}
	
	@Override
	public String toString() {
		return "Section [id=" + id + ", sectionContent=" + sectionContent + ", chapterId=" + chapterId + "]";
	}
	
}
