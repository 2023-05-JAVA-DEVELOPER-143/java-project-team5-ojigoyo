package hotel.comment;

import hotel.inquiries.Inquiries;

public class InquiriesComment {

	private int comm_no;
	private String comm_title;
	private String comm_content;
	private Inquiries inquiries_no;
	
	public InquiriesComment() {
		
	}

	public InquiriesComment(int comm_no, String comm_title, String comm_content, Inquiries inquiries_no) {
		super();
		this.comm_no = comm_no;
		this.comm_title = comm_title;
		this.comm_content = comm_content;
		this.inquiries_no = inquiries_no;
	}

	public int getComm_no() {
		return comm_no;
	}

	public void setComm_no(int comm_no) {
		this.comm_no = comm_no;
	}

	public String getComm_title() {
		return comm_title;
	}

	public void setComm_title(String comm_title) {
		this.comm_title = comm_title;
	}

	public String getComm_content() {
		return comm_content;
	}

	public void setComm_content(String comm_content) {
		this.comm_content = comm_content;
	}

	public Inquiries getInquiries_no() {
		return inquiries_no;
	}

	public void setInquiries_no(Inquiries inquiries_no) {
		this.inquiries_no = inquiries_no;
	}

	@Override
	public String toString() {
		return "InquiriesComment [comm_no=" + comm_no + ", comm_title=" + comm_title + ", comm_content=" + comm_content
				+ ", inquiries_no=" + inquiries_no + "]";
	}
	
	
}
