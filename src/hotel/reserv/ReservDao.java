package hotel.reserv;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;
import hotel.inquiries.Inquiries;
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
	public int deleteByReservNo(int reservNo) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReservSQL.DELETE_RESERV_BY_RESERV_NO);
		pstmt.setInt(1, reservNo);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
//	public List<Room> selectRoomRTypeAll(){
//		List<Room> roomList = new ArrayList<Room>();
//		Connection con = dataSource.getConnection();
//		PreparedStatement pstmt = con.prepareStatement(ReservSQL.SELECT_ROOM_ROOMTYPE_ALL);
//		ResultSet rs = pstmt.executeQuery();
//		while(rs.next()) {
//			roomList.add(new Room(rs.getInt("room_no"), null, null))		
//		}
//		rs.close();
//		pstmt.close();
//		dataSource.close(con);
//		return roomList;
//		select * from room r join room_type rt on r.room_type_no= rt.room_type_no";
//	}
	public List<Reserv> selectAllReservRoom() throws Exception{
		List<Reserv> reservList = new ArrayList<Reserv>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReservSQL.SELECT_ROOM_ROOMTYPE_RESERV_ALL);
		ResultSet rs =pstmt.executeQuery();
		while(rs.next()) {
			reservList.add(new Reserv(rs.getInt("reserv_no"), rs.getDate("reserv_check_in"), rs.getDate("reserv_check_out"), rs.getInt("reserv_adult"), rs.getInt("reserv_child"), rs.getBoolean("isbreakfast"), rs.getInt("reserv_extra_bed"), 
					new Room(rs.getInt("room_no"),new RoomType(rs.getInt("room_type_no"), rs.getString("room_type_name"), rs.getString("room_type_img"), rs.getString("room_type_detail"), rs.getBoolean("room_type_pool"),rs.getInt("room_type_qty") , rs.getInt("room_type_price"), new ArrayList<Room>()),new ArrayList<Reserv>()), 
					new User(), rs.getString("reserv_payment"), rs.getDate("reserv_date")));
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return reservList;
		}
	public int emptyRoom(int roomTypeNo,Date checkIn, Date checkOut) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReservSQL.FIND_EMPTY_ROOM);
		pstmt.setInt(1, roomTypeNo);
		pstmt.setDate(2, checkIn);
		pstmt.setDate(3, checkOut);
		ResultSet rs =pstmt.executeQuery();
		int emptyRoomNo=0;
		if(rs.next()) {
			 emptyRoomNo = rs.getInt("room_no");
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return emptyRoomNo;
	}
	
	public Reserv selectReserv() throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReservSQL.SELECT_RESERV_USER_ALL);
		ResultSet rs = pstmt.executeQuery();
		Reserv reserv=null;
		if(rs.next()) {
			 reserv = new Reserv(rs.getInt("reserv_no"), rs.getDate("reserv_check_in"), rs.getDate("reserv_check_out"), rs.getInt("reserv_adult"), rs.getInt("reserv_child"), rs.getBoolean("isbreakfast"), rs.getInt("reserv_extra_bed"), new Room(), new User(), rs.getString("reserv_payment"), rs.getDate("reserv_date"));
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return reserv;
	}
	public List<Reserv> selectAllAll(int reservNo) throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Reserv> reservList = new ArrayList<Reserv>();
		con=dataSource.getConnection();
		pstmt = con.prepareStatement(ReservSQL.SELECT_RESERV_USER_DETAIL);
		pstmt.setInt(1, reservNo);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			reservList.add(new Reserv(rs.getInt("reserv_no"), rs.getDate("reserv_check_in"), rs.getDate("reserv_check_out"), rs.getInt("reserv_adult"), rs.getInt("reserv_child"), rs.getBoolean("isbreakfast"), rs.getInt("reserv_extra_bed"), 
					new Room(rs.getInt("room_no"),new RoomType(rs.getInt("room_type_no"), rs.getString("room_type_name"), rs.getString("room_type_img"), rs.getString("room_type_detail"), rs.getBoolean("room_type_pool"),rs.getInt("room_type_qty") , rs.getInt("room_type_price"), new ArrayList<Room>()),new ArrayList<Reserv>()), 
					new User(rs.getString("user_id"),rs.getString("user_password"),rs.getString("user_name"),rs.getString("user_tel"),rs.getString("user_email"),rs.getString("user_jumin"),new ArrayList<Inquiries>()), rs.getString("reserv_payment"), rs.getDate("reserv_date")));
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return reservList;
	}
	public List<Reserv> findMyReserv(String userId) throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Reserv> reservList = new ArrayList<Reserv>();
		con=dataSource.getConnection();
		pstmt = con.prepareStatement(ReservSQL.SELECT_RESERV_BY_ID);
		pstmt.setString(1, userId);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			reservList.add(new Reserv(rs.getInt("reserv_no"), rs.getDate("reserv_check_in"), rs.getDate("reserv_check_out"), rs.getInt("reserv_adult"), rs.getInt("reserv_child"), rs.getBoolean("isbreakfast"), rs.getInt("reserv_extra_bed"), 
					new Room(), 
					new User(), rs.getString("reserv_payment"), rs.getDate("reserv_date")));
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return reservList;
	}
	public List<Reserv> findMyReservDefault(String userId) throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Reserv> reservList = new ArrayList<Reserv>();
		con=dataSource.getConnection();
		pstmt = con.prepareStatement(ReservSQL.FIND_MY_RESERV_DEFAULT);
		pstmt.setString(1, userId);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			reservList.add(new Reserv(rs.getInt("reserv_no"), rs.getDate("reserv_check_in"), rs.getDate("reserv_check_out"), rs.getInt("reserv_adult"), rs.getInt("reserv_child"), rs.getBoolean("isbreakfast"), rs.getInt("reserv_extra_bed"), 
					new Room(), 
					new User(), rs.getString("reserv_payment"), rs.getDate("reserv_date")));
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return reservList;
	}
	public List<Reserv> findMyReservByDate(String userId,java.util.Date optionStartDate, java.util.Date optionEndDate) throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Reserv> reservList = new ArrayList<Reserv>();
		con=dataSource.getConnection();
		pstmt = con.prepareStatement(ReservSQL.FIND_MY_RESERV_BY_DATE);
		pstmt.setString(1, userId);
		pstmt.setDate(2, (Date)optionStartDate);
		pstmt.setDate(3, (Date)optionEndDate);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			reservList.add(new Reserv(rs.getInt("reserv_no"), rs.getDate("reserv_check_in"), rs.getDate("reserv_check_out"), rs.getInt("reserv_adult"), rs.getInt("reserv_child"), rs.getBoolean("isbreakfast"), rs.getInt("reserv_extra_bed"), 
					new Room(rs.getInt("room_no"),new RoomType(rs.getInt("room_type_no"), rs.getString("room_type_name"), rs.getString("room_type_img"), rs.getString("room_type_detail"), rs.getBoolean("room_type_pool"),rs.getInt("room_type_qty") , rs.getInt("room_type_price"), new ArrayList<Room>()),new ArrayList<Reserv>()), 
					new User(), rs.getString("reserv_payment"), rs.getDate("reserv_date")));
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return reservList;
	}

	
	
}
