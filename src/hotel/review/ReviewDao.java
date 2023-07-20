package hotel.review;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;

public class ReviewDao {

	private DataSource dataSource;
	
	public ReviewDao() throws Exception {
		dataSource = new DataSource();
	}
	
	public int insert(Review review) throws Exception {
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSQL.REVIEW_INSERT);
		
		pstmt.setString(1, review.getReviewTitle());
		pstmt.setString(2, review.getReviewContent());
		pstmt.setString(3, review.getReviewImgUrl());
		
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}
	
	public int updateByReviewNo(Review review) throws Exception {
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSQL.REVIEW_UPDATE);
		
		pstmt.setString(1, review.getReviewTitle());
		pstmt.setString(2, review.getReviewContent());
		pstmt.setString(3, review.getReviewImgUrl());
		pstmt.setInt(4, review.getReviewNo());
		
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
		
	}
	
	public int deleteByReviewNo(int no) throws Exception {
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSQL.REVIEW_DELETE);
		
		pstmt.setInt(1, no);
		
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}
	
	public Review findByReviewNo(int no) throws Exception {
		
		Review review = null;
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSQL.REVIEW_SELECT_BY_NO);
		
		pstmt.setInt(1, no);
		
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {
			review = new Review(0, 
								null, 
								rs.getString("review_title"), 
								rs.getString("review_content"), 
								rs.getString("review_img"), 
								null);
		}
		
		rs.close();
		pstmt.close();
		dataSource.close(con);
		
		return review;
	}
	
	public List<Review> findByAll() throws Exception {
		
		List<Review> reviewList = new ArrayList<Review>();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReviewSQL.REVIEW_SELECT_BY_ALL);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			reviewList.add(new Review(0, 
										null, 
										rs.getString("review_title"), 
										rs.getString("review_content"), 
										rs.getString("review_img"), 
										null));
		}
		
		rs.close();
		pstmt.close();
		dataSource.close(con);
		
		return reviewList;
	}
}
