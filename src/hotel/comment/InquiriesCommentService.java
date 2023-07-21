package hotel.comment;

public class InquiriesCommentService {

	private InquiriesCommentDao inquiriesCommentDao;
	
	public InquiriesCommentService() throws Exception {
		inquiriesCommentDao = new InquiriesCommentDao();
	}
	
	/******************** 문의 작성  ***********************/
	public int insertInquiriesComment(InquiriesComment comment) throws Exception {
		
		return inquiriesCommentDao.insert(comment);
		
	}
	
	public int updateInquiriesComment(InquiriesComment comment) throws Exception {
		
		return inquiriesCommentDao.updateByInquiriesCommentNo(comment);
		
	}
	
	public int deleteInquiriesComment(int no) throws Exception {
		
		return inquiriesCommentDao.deleteByInquiriesCommentNo(no);
		
	}
	
	public InquiriesComment findByInquiriesComment(int no) throws Exception {
		
		return inquiriesCommentDao.findByInquiriesCommentNo(no);
		
	}
}
