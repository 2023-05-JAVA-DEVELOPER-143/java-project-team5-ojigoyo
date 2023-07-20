package hotel.inquiries;

import java.util.ArrayList;
import java.util.List;

import hotel.user.User;

public class Inquiries {
	private int inq_No;
	private String inq_Title;
	private String inq_Content;
	private List<inquiries_comment> inqCommentList;
	
	private User user;
	
	public Inquiries() {
		inqCommentList=new ArrayList<inquiries_comment>();
	}

	public Inquiries(int inq_No, String inq_Title, String inq_Content, List<inquiries_comment> inqCommentList,
			User user) {
		super();
		this.inq_No = inq_No;
		this.inq_Title = inq_Title;
		this.inq_Content = inq_Content;
		if(inqCommentList==null) {
			this.inqCommentList= new ArrayList<inquiries_comment>();
		}else {			
			this.inqCommentList = inqCommentList;
		}
		this.user = user;
	}

	public int getInq_No() {
		return inq_No;
	}

	public void setInq_No(int inq_No) {
		this.inq_No = inq_No;
	}

	public String getInq_Title() {
		return inq_Title;
	}

	public void setInq_Title(String inq_Title) {
		this.inq_Title = inq_Title;
	}

	public String getInq_Content() {
		return inq_Content;
	}

	public void setInq_Content(String inq_Content) {
		this.inq_Content = inq_Content;
	}

	public List<inquiries_comment> getInqCommentList() {
		return inqCommentList;
	}

	public void setInqCommentList(List<inquiries_comment> inqCommentList) {
		this.inqCommentList = inqCommentList;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Inquiries [inq_No=" + inq_No + ", inq_Title=" + inq_Title + ", inq_Content=" + inq_Content
				+ ", inqCommentList=" + inqCommentList + ", user=" + user + "]";
	}

	

	
}
