package hotel.history;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.DataSource;
import hotel.reserv.Reserv;
import hotel.review.Review;
import hotel.room.Room;
import hotel.room_type.RoomType;
import hotel.user.User;

public class HistoryDao {
DataSource dataSource;
public HistoryDao() throws Exception {
	// TODO Auto-generated constructor stub
	dataSource = new DataSource();
}
public int insert_history(History history)throws Exception {
	Connection con = dataSource.getConnection();
	PreparedStatement pstmt = con.prepareStatement(HistorySQL.INSERT_HISTORY);
	pstmt.setInt(1, history.getHistoryNo());
	pstmt.setInt(2, history.getReview().getReviewNo());
	pstmt.setInt(3, history.getReserv().getReservNo());
	int rowCount = pstmt.executeUpdate();
	pstmt.close();
	dataSource.close(con);
	return rowCount;
}
public History findHistoryById(String userId) throws Exception {
	History findHistory=null;
	Connection con = dataSource.getConnection();
	PreparedStatement pstmt = con.prepareStatement(HistorySQL.SELECT_HISTORY_BY_USERID);
	pstmt.setString(1, userId);
	ResultSet rs = pstmt.executeQuery();
	if(rs.next()) {
		findHistory = new History(
		rs.getInt("history_no"),
		new Reserv(rs.getInt("reserv_no"),rs.getDate("reserv_check_in"),rs.getDate("reserv_check_out"),rs.getInt("reserv_adult"),rs.getInt("reserv_child"),rs.getBoolean("isbreakfast"),rs.getInt("reserv_extra_bed"),
				new Room(rs.getInt("room_no"),
						new RoomType(rs.getInt("room_type_no"), rs.getString("room_type_name"), rs.getString("room_type_img"), rs.getString("room_type_detail"), rs.getInt("room_type_qty"), rs.getBoolean("room_type_pool")),rs.getInt("room_price"),new ArrayList<Reserv>()), 
				new User(rs.getString("user_id"),null,rs.getString("user_name"),rs.getString("user_tel"),rs.getString("user_email"),null,null,null), 
				rs.getString("reserv_payment"),rs.getDate("reserv_date"),null,rs.getInt("reserv_fprice")),
		new Review(rs.getInt("review_no"), rs.getDate("review_date"), rs.getString("review_title"), rs.getString("review_content"), rs.getString("review_img_url"),
				null)
		);
	}
	rs.close();
	pstmt.close();
	dataSource.close(con);
	return findHistory;
}
public History findHistoryByReview(int reviewNo) throws Exception {
	History findHistory = null;
	Connection con = dataSource.getConnection();
	PreparedStatement pstmt = con.prepareStatement(HistorySQL.SELECT_HISTORY_BY_REIVEW);
	pstmt.setInt(1, reviewNo);
	ResultSet rs = pstmt.executeQuery();
	if(rs.next()) {
		findHistory = new History(
		rs.getInt("history_no"),
		new Reserv(rs.getInt("reserv_no"),rs.getDate("reserv_check_in"),rs.getDate("reserv_check_out"),rs.getInt("reserv_adult"),rs.getInt("reserv_child"),rs.getBoolean("isbreakfast"),rs.getInt("reserv_extra_bed"),
				new Room(rs.getInt("room_no"),
						new RoomType(rs.getInt("room_type_no"), rs.getString("room_type_name"), rs.getString("room_type_img"), rs.getString("room_type_detail"), rs.getInt("room_type_qty"), rs.getBoolean("room_type_pool")),rs.getInt("room_price"),new ArrayList<Reserv>()), 
				new User(rs.getString("user_id"),null,rs.getString("user_name"),rs.getString("user_tel"),rs.getString("user_email"),null,null,null), 
				rs.getString("reserv_payment"),rs.getDate("reserv_date"),null,rs.getInt("reserv_fprice")),
		new Review(rs.getInt("review_no"), rs.getDate("review_date"), rs.getString("review_title"), rs.getString("review_content"), rs.getString("review_img_url"),
				null)
		);
	}
	rs.close();
	pstmt.close();
	dataSource.close(con);
	return findHistory;
	
}
}
