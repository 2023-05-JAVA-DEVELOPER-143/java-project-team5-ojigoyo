package test;

import hotel.review.Review;
import hotel.review.ReviewDao;

public class ReviewDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		ReviewDao reviewDao = new ReviewDao();
		
		System.out.println(">> insert: " + reviewDao.insert(new Review(0, null, "제목", "내용", "img.jpg", null)));
		
		System.out.println(">> findAll: " + reviewDao.findByAll());

	}

}
