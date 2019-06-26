package entity;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String commentInfo;
	Date commentTime;
	int userId;
	int bookId;
	public Comment() {
		super();
	}
	public Comment(int id, String commentInfo, Date commentTime, int userId, int bookId) {
		super();
		this.id = id;
		this.commentInfo = commentInfo;
		this.commentTime = commentTime;
		this.userId = userId;
		this.bookId = bookId;
	}
	public Comment(String commentInfo, Date commentTime, int userId, int bookId) {
		super();
		this.commentInfo = commentInfo;
		this.commentTime = commentTime;
		this.userId = userId;
		this.bookId = bookId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		result = prime * result + ((commentInfo == null) ? 0 : commentInfo.hashCode());
		result = prime * result + ((commentTime == null) ? 0 : commentTime.hashCode());
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
		Comment other = (Comment) obj;
		if (bookId != other.bookId)
			return false;
		if (commentInfo == null) {
			if (other.commentInfo != null)
				return false;
		} else if (!commentInfo.equals(other.commentInfo))
			return false;
		if (commentTime == null) {
			if (other.commentTime != null)
				return false;
		} else if (!commentTime.equals(other.commentTime))
			return false;
		if (id != other.id)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", commentInfo=" + commentInfo + ", commentTime=" + commentTime + ", userId="
				+ userId + ", bookId=" + bookId + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommentInfo() {
		return commentInfo;
	}
	public void setCommentInfo(String commentInfo) {
		this.commentInfo = commentInfo;
	}
	public Date getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
}
