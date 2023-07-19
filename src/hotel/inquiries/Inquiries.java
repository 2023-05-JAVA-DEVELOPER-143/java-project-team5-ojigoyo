package hotel.inquiries;

import java.sql.Date;

import hotel.user.User;

public class Inquiries {
	private int inqNo;
	private User user;
	private String inqTitle;
	private String inqContent;
	private Date inqDate;
	
	public Inquiries() {
		// TODO Auto-generated constructor stub
	}

	public Inquiries(int inqNo, User user, String inqTitle, String inqContent, Date inqDate) {
		super();
		this.inqNo = inqNo;
		this.user = user;
		this.inqTitle = inqTitle;
		this.inqContent = inqContent;
		this.inqDate = inqDate;
	}

	@Override
	public String toString() {
		return "Inquiries [inqNo=" + inqNo + ", user=" + user + ", inqTitle=" + inqTitle + ", inqContent=" + inqContent
				+ ", inqDate=" + inqDate + "]";
	}

	public int getInqNo() {
		return inqNo;
	}

	public void setInqNo(int inqNo) {
		this.inqNo = inqNo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getInqTitle() {
		return inqTitle;
	}

	public void setInqTitle(String inqTitle) {
		this.inqTitle = inqTitle;
	}

	public String getInqContent() {
		return inqContent;
	}

	public void setInqContent(String inqContent) {
		this.inqContent = inqContent;
	}

	public Date getInqDate() {
		return inqDate;
	}

	public void setInqDate(Date inqDate) {
		this.inqDate = inqDate;
	}
	
	
	
	
}
