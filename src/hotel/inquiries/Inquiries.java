package hotel.inquiries;

import java.sql.Date;

import hotel.user.User;

public class Inquiries {
	
	private int inqiries_no;
	private String inquiries_title;
	private String inquiries_content;
	private Date inquiries_date;
	private User user;
	
	public Inquiries() {
		
	}

	public Inquiries(int inquiries_no, String inquiries_title, String inquiries_content, Date inquiries_date, User user) {
		super();
		this.inqiries_no = inquiries_no;
		this.inquiries_title = inquiries_title;
		this.inquiries_content = inquiries_content;
		this.inquiries_date = inquiries_date;
		this.user = user;
	}

	public int getInqiries_no() {
		return inqiries_no;
	}

	public void setInqiries_no(int inqiries_no) {
		this.inqiries_no = inqiries_no;
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

	public Date getInquiries_date() {
		return inquiries_date;
	}

	public void setInquiries_date(Date inquiries_date) {
		this.inquiries_date = inquiries_date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Inquiries [inqiries_no=" + inqiries_no + ", inquiries_title=" + inquiries_title + ", inquiries_content="
				+ inquiries_content + ", inquiries_date=" + inquiries_date + ", user=" + user + "]";
	}

}
