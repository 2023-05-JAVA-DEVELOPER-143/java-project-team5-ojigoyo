package hotel.comment;

public class InquiriesCommentSQL {

	public static final String INQUIRIESCOMMENT_INSERT = "insert into comments(comm_no, comm_content, comm_date,inquiries_no) values(?, ?, sysdate, ?)";
	public static final String INQUIRIESCOMMENT_UPDATE = "update comments set comm_content = ? where comm_no = ?";
	public static final String INQUIRIESCOMMENT_DELETE = "delete from comments where comm_no = ?";
	public static final String INQUIRIESCOMMENT_SELECT_BY_NO = "select i.inquiries_no, i.inquiries_title, i.inquiries_content, i.inquiries_date, u.user_id, u.user_name, u.user_tel, u.user_email, c.comm_no, c.comm_content, c.comm_date from comments c join inquiries i on c.inquiries_no = i.inquiries_no join userinfo u on i.user_id = u.user_id where comm_no = ?";
}
