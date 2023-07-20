package hotel.inquiries;

import java.sql.Date;

import hotel.user.User;

public class Inquiries {
	
	private int inquiriesNo;
	private String inquiriesTitle;
	private String inquiriesContent;
	private Date inquiriesDate;
	private User user;
	
	public Inquiries() {
		
	}

	public Inquiries(int inquiriesNo, String inquiriesTitle, String inquiriesContent, Date inquiriesDate, User user) {
		super();
		this.inquiriesNo = inquiriesNo;
		this.inquiriesTitle = inquiriesTitle;
		this.inquiriesContent = inquiriesContent;
		this.inquiriesDate = inquiriesDate;
		this.user = user;
	}

	public int getInquiriesNo() {
		return inquiriesNo;
	}

	public void setInquiriesNo(int inquiriesNo) {
		this.inquiriesNo = inquiriesNo;
	}

	public String getInquiriesTitle() {
		return inquiriesTitle;
	}

	public void setInquiriesTitle(String inquiriesTitle) {
		this.inquiriesTitle = inquiriesTitle;
	}

	public String getInquiriesContent() {
		return inquiriesContent;
	}

	public void setInquiriesContent(String inquiriesContent) {
		this.inquiriesContent = inquiriesContent;
	}

	public Date getInquiriesDate() {
		return inquiriesDate;
	}

	public void setInquiriesDate(Date inquiriesDate) {
		this.inquiriesDate = inquiriesDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Inquiries [inquiriesNo=" + inquiriesNo + ", inquiriesTitle=" + inquiriesTitle + ", inquiriesContent="
				+ inquiriesContent + ", inquiriesDate=" + inquiriesDate + ", user=" + user + "]\n";
	}

}
