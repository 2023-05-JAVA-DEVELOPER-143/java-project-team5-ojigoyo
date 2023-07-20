package hotel.reserv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;
import hotel.room.Room;
import hotel.room_type.RoomType;
import hotel.user.User;

public class ReservDao {
	DataSource dataSource;
	
	public ReservDao() throws Exception {
		// TODO Auto-generated constructor stub
		dataSource = new DataSource();
	}
	
	//insert
	public int insertReserv(Reserv reserv) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReservSQL.ISNERT_RESERV);
		pstmt.setDate(1, reserv.getReservCheckIn());
		pstmt.setDate(2, reserv.getReservCheckOut());
		pstmt.setInt(3, reserv.getReservAdult());
		pstmt.setInt(4, reserv.getReservChild());
		pstmt.setBoolean(5, reserv.isBreakfast());
		pstmt.setInt(6, reserv.getReservExtraBed());
		pstmt.setInt(7, reserv.getfPrice());
		pstmt.setString(8, reserv.getReservPayment());
		pstmt.setString(9, reserv.getUser().getUser_Id());
		int rowCount =pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	//예약정보(룸 포함),유저정보,쿠폰 모두 포함


public int deleteReserv(String userId) throws Exception{
	Connection con = dataSource.getConnection();
	PreparedStatement pstmt = con.prepareStatement(ReservSQL.DELETE_RESERV_BY_USER_ID);
	pstmt.setString(1, userId);
	int rowCount = pstmt.executeUpdate();
	pstmt.close();
	dataSource.close(con);
	return rowCount;
}
}
