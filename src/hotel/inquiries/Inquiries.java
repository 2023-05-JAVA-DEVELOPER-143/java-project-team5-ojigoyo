package hotel.inquiries;

import java.util.ArrayList;
import java.util.List;

import hotel.user.User;

public class Inquiries {
<<<<<<< HEAD
	private int inq_No;
	private String inq_Title;
	private String inq_Content;
	private List<inquiries_comment> inqCommentList;
	
=======
	
	private int inquiriesNo;
	private String inquiriesTitle;
	private String inquiriesContent;
	private Date inquiriesDate;
>>>>>>> branch 'master' of https://github.com/2023-05-JAVA-DEVELOPER-143/java-project-team5-ojigoyo.git
	private User user;
	
	public Inquiries() {
<<<<<<< HEAD
		inqCommentList=new ArrayList<inquiries_comment>();
=======
		
>>>>>>> branch 'master' of https://github.com/2023-05-JAVA-DEVELOPER-143/java-project-team5-ojigoyo.git
	}

<<<<<<< HEAD
	public Inquiries(int inq_No, String inq_Title, String inq_Content, List<inquiries_comment> inqCommentList,
			User user) {
=======
	public Inquiries(int inquiriesNo, String inquiriesTitle, String inquiriesContent, Date inquiriesDate, User user) {
>>>>>>> branch 'master' of https://github.com/2023-05-JAVA-DEVELOPER-143/java-project-team5-ojigoyo.git
		super();
<<<<<<< HEAD
		this.inq_No = inq_No;
		this.inq_Title = inq_Title;
		this.inq_Content = inq_Content;
		if(inqCommentList==null) {
			this.inqCommentList= new ArrayList<inquiries_comment>();
		}else {			
			this.inqCommentList = inqCommentList;
		}
=======
		this.inquiriesNo = inquiriesNo;
		this.inquiriesTitle = inquiriesTitle;
		this.inquiriesContent = inquiriesContent;
		this.inquiriesDate = inquiriesDate;
>>>>>>> branch 'master' of https://github.com/2023-05-JAVA-DEVELOPER-143/java-project-team5-ojigoyo.git
		this.user = user;
	}

<<<<<<< HEAD
	public int getInq_No() {
		return inq_No;
=======
	public int getInquiriesNo() {
		return inquiriesNo;
>>>>>>> branch 'master' of https://github.com/2023-05-JAVA-DEVELOPER-143/java-project-team5-ojigoyo.git
	}

<<<<<<< HEAD
	public void setInq_No(int inq_No) {
		this.inq_No = inq_No;
=======
	public void setInquiriesNo(int inquiriesNo) {
		this.inquiriesNo = inquiriesNo;
>>>>>>> branch 'master' of https://github.com/2023-05-JAVA-DEVELOPER-143/java-project-team5-ojigoyo.git
	}

<<<<<<< HEAD
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
=======
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
>>>>>>> branch 'master' of https://github.com/2023-05-JAVA-DEVELOPER-143/java-project-team5-ojigoyo.git
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		return "Inquiries [inq_No=" + inq_No + ", inq_Title=" + inq_Title + ", inq_Content=" + inq_Content
				+ ", inqCommentList=" + inqCommentList + ", user=" + user + "]";
=======
		return "Inquiries [inquiriesNo=" + inquiriesNo + ", inquiriesTitle=" + inquiriesTitle + ", inquiriesContent="
				+ inquiriesContent + ", inquiriesDate=" + inquiriesDate + ", user=" + user + "]\n";
>>>>>>> branch 'master' of https://github.com/2023-05-JAVA-DEVELOPER-143/java-project-team5-ojigoyo.git
	}

<<<<<<< HEAD
	

	
=======
>>>>>>> branch 'master' of https://github.com/2023-05-JAVA-DEVELOPER-143/java-project-team5-ojigoyo.git
}
