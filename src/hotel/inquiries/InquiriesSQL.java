package hotel.inquiries;

public class InquiriesSQL {

	public static final String INQUIRIES_INSERT = 
					"insert into inquiries(inquiries_no, inquiries_title, inquiries_content, inquiries_date, user_id) values(inquiries_inquiries_no_SEQ.nextval, ?, ?, sysdate, ?)";
	public static final String INQUIRIES_UPDATE = 
					"update inquiries set inquiries_title = ?, inquiries_content = ? where inquiries_no = ?";
	public static final String INQUIRIES_DELETE = 
					"delete from inquiries where inquiries_no = ?";
	public static final String INQUIRIES_SELECT_BY_NO = 
					"select i.inquiries_no, i.inquiries_title, i.inquiries_content, i.inquiries_date, u.user_id, u.user_name,u.user_email, u.user_tel, ic.comm_content, ic.comm_date from inquiries i join userinfo u  on i.user_id = u.user_id join comments ic on i.inquiries_no = ic.inquiries_no where i.inquiries_no = ?";
	public static final String INQUIRIES_SELECT_BY_ALL = 
					"select i.inquiries_no, i.inquiries_title, i.inquiries_content, i.inquiries_date, u.user_id, u.user_email, u.user_tel from inquiries i join userinfo u on i.user_id = u.user_id";
}
