package hotel.review;

public class ReviewSQL {
	
	public static final String REVIEW_INSERT = "insert into review(review_no, review_date, review_title, review_content) values(review_review_no_SEQ.nextval, sysdate, ?, ?)";
	public static final String REVIEW_UPDATE = "update review set review_title = ?, review_content = ? where review_no = ?";
	public static final String REVIEW_DELETE = "delete from review where review_no = ?";
	public static final String REVIEW_SELECT_BY_NO = "select review_no, review_date, review_title, review_content from review where review_no = ?";
	public static final String REVIEW_SELECT_BY_ALL = "select review_no, review_date, review_title, review_content from review";

}
