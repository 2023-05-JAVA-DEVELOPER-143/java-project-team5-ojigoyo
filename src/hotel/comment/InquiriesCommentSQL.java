package hotel.comment;

public class InquiriesCommentSQL {

	public static final String INQUIRIESCOMMENT_INSERT = "insert into comments(comm_no, comm_content, comm_date,inquiries_no) values(?, ?, sysdate, ?)";
	public static final String INQUIRIESCOMMENT_UPDATE = "update inquiries_comment set comm_content = ? where comm_no = ?";
	public static final String INQUIRIESCOMMENT_DELETE = "delete from inquiries_comment where comm_no = ?";
	public static final String INQUIRIESCOMMENT_SELECT_BY_NO = "select i.inquiries_no, i.inquiries_title, i.inquiries_content, i.inquiries_date, c.comm_no, c.comm_content, c.comm_date from comments c join inquiries i on c.inquiries_no = i.inquiries_no where comm_no = ?";
}
