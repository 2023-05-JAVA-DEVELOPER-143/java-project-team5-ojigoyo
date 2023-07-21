package hotel.review;

public class ReviewSQL {
	
	public static final String REVIEW_INSERT = "insert into review(review_no, review_date, review_title, review_content) values(review_review_no_SEQ.nextval, sysdate, ?, ?)";
	public static final String REVIEW_UPDATE = "update review set review_title = ?, review_content = ?, review_img = ? where review_no = ?";
	public static final String REVIEW_DELETE = "delete from review where review_no = ?";
	public static final String REVIEW_SELECT_BY_NO = "select review_no, review_date, review_title, review_content from review where review_no = ?";
	public static final String REVIEW_SELECT_BY_ALL = "select r.review_no, r.review_date, r.review_title, r.review_content, u.user_id, u.user_name from review r join userinfo u on r.user_id = u.user_id";

}
