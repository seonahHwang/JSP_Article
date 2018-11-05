package mvjsp.chap17.board.model;

import java.util.Date;

public class Article {
	//글 하나하나 당 갖고 있는 요소.
	private int id;
	private int groupId;
	private String sequenceNumber;
	private Date positingDate;
	private int readCount;
	private String writeName;
	private String password;
	private String title;
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public Date getPositingDate() {
		return positingDate;
	}
	public void setPositingDate(Date positingDate) {
		this.positingDate = positingDate;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public String getWriteName() {
		return writeName;
	}
	public void setWriteName(String writeName) {
		this.writeName = writeName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getLevel() {
		if(sequenceNumber == null) {
			return -1;
		}
		if(sequenceNumber.length() != 16) {
			return -1;
		}
		if(sequenceNumber.endsWith("999999")) {
			return 0;
		}
		if(sequenceNumber.endsWith("9999")) {
			return 1;
		}
		if(sequenceNumber.endsWith("999")) {
			return 2;
		}
		return 3;
	}
}