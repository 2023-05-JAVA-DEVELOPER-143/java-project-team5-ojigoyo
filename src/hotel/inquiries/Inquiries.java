package hotel.inquiries;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import hotel.user.User;

public class Inquiries {

	private int inq_No;
	private String inq_Title;
	private String inq_Content;
	private List<inquiries_comment> inqCommentList;
	
	
	public Inquiries() {

		inqCommentList=new ArrayList<inquiries_comment>();	
	}



	public Inquiries(int inquiriesNo, String inquiriesTitle, String inquiriesContent, 
			Date inquiriesDate, User user) {
		super();
		this.inq_No = inq_No;
		this.inq_Title = inq_Title;
		this.inq_Content = inq_Content;
		if(inqCommentList==null) {
			this.inqCommentList= new ArrayList<inquiries_comment>();
		}else {			
			this.inqCommentList = inqCommentList;
		}
	}

}
