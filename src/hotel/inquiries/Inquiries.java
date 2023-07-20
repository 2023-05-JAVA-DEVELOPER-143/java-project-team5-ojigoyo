package hotel.inquiries;

import java.sql.Date;

import hotel.user.User;

public class Inquiries {

	private int inquiries_no;
	private String inquiries_title;
	private String inquiries_content;
	private Date inquirieate;
	private User user;
	
	public Inquiries() {
		
	}

	public Inquiries(int inquiries_no, String inquiries_title, String inquiries_content, Date inquirieate, User user) {
		super();
		this.inquiries_no = inquiries_no;
		this.inquiries_title = inquiries_title;
		this.inquiries_content = inquiries_content;
		this.inquirieate = inquirieate;
		this.user = user;
	}

	public int getInquiries_no() {
		return inquiries_no;
	}

	public void setInquiries_no(int inquiries_no) {
		this.inquiries_no = inquiries_no;
	}

	public String getInquiries_title() {
		return inquiries_title;
	}

	public void setInquiries_title(String inquiries_title) {
		this.inquiries_title = inquiries_title;
	}

	public String getInquiries_content() {
		return inquiries_content;
	}

	public void setInquiries_content(String inquiries_content) {
		this.inquiries_content = inquiries_content;
	}

	public Date getInquirieate() {
		return inquirieate;
	}

	public void setInquirieate(Date inquirieate) {
		this.inquirieate = inquirieate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Inquiries [inquiries_no=" + inquiries_no + ", inquiries_title=" + inquiries_title
				+ ", inquiries_content=" + inquiries_content + ", inquirieate=" + inquirieate + ", user=" + user + "]";
	}

}
