package hotel.reserv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	public int insert(Reserv reserv) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReservSQL.INSERT_RESERV);
		pstmt.setDate(1, reserv.getReservCheckIn());
		pstmt.setDate(2, reserv.getReservCheckOut());
		pstmt.setInt(3, reserv.getReservAdult());
		pstmt.setInt(4, reserv.getReservChild());
		pstmt.setBoolean(5, reserv.isBreakfast());
		pstmt.setInt(6, reserv.getReservExtraBed());
		pstmt.setString(7,reserv.getReservPayment());
		pstmt.setString(8, reserv.getUser().getUser_Id());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	public int updateOption(Reserv reserv) throws Exception{ 
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReservSQL.UPDATE_RESERV_OPTION);
		pstmt.setInt(1, reserv.getReservAdult());
		pstmt.setInt(2, reserv.getReservChild());
		pstmt.setBoolean(3, reserv.isBreakfast());
		pstmt.setInt(4, reserv.getReservExtraBed());
		pstmt.setString(5, reserv.getReservPayment());
		pstmt.setInt(6, reserv.getReservNo());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	public int deleteById(String userid) throws Exception {//내 예약 전체 삭제
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReservSQL.DELETE_RESERV_BY_USER_ID);
		pstmt.setString(1, userid);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
		
	}
	public int deleteByReservNO(int reservNo) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReservSQL.DELETE_RESERV_BY_RESERV_NO);
		pstmt.setInt(1, reservNo);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	public List<Room> selectRoomRTypeAll(){
		List<Room> roomList = new ArrayList<Room>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReservSQL.SELECT_ROOM_ROOMTYPE_ALL);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			RoomType rt = new RoomType(rs.getInt("room_type_no"),rs.getString("room_type_name"),rs.getString("room_type_img"),rs.getString("room_type_detail"),rs.getInt("room_type_qty"),rs.getBoolean("room_type_pool"));
					
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return roomList;
		select * from room r join room_type rt on r.room_type_no= rt.room_type_no";
	}
	public static final String SELECT_ROOM_ROOMTYPE_RESERV_ALL="select * from room r join room_type rt on r.room_type_no= rt.room_type_no join reserv re on re.reserv_no=r.reserv_no";
	public static final String FIND_EMPTY_ROOM="select * from room r join room_type rt on r.room_type_no= rt.room_type_no join reserv re on re.reserv_no=r.reserv_no where rt.room_type_no=? and re.reserv_date>to_date(?,'YYYY/MM/DD') or re.reserv_date<to_date(?,'YYYY/MM/DD')";
	public static final String SELECT_RESERV_USER_ALL="select * from reserv re join userinfo u on u.user_id = re.user_id";
	public static final String SELECT_RESERV_USER_DETAIL="select * from reserv re join userinfo u on u.user_id = re.user_id join room r on re.reserv_no=r.reserv_no join room_type rt on r.room_type_no = rt.room_type_no where re.reserv_no=?";
	public static final String SELECT_RESERV_BY_ID="select * from reserv re join userinfo u on u.user_id = re.user_id where u.user_id=?";
	public static final String FIND_MY_RESERV_DEFAULT="select * from reserv re join userinfo u on u.user_id = re.user_id where u.user_id =? and (sysdate-reserv_date)<30";
	public static final String FIND_MY_RESERV_BY_DATE="select * from reserv re join userinfo u on u.user_id = re.user_id where u.user_id =? and reserv_date Between to_date(?,'yyyy/mm/dd') and to_date(?,'yyyy/mm/dd')+1";

	
	
}
