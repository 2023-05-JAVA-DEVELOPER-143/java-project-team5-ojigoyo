package hotel.reserv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;
import hotel.coupon.Coupon;
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
public Reserv findReservById(String userId) throws Exception{
		Reserv findReserv = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ReservSQL.SELECT_RESERV_BY_USER_ID);
		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			findReserv = new Reserv(rs.getInt("reserv_no"), rs.getDate("reserv_check_in"), rs.getDate("reserv_check_out"), rs.getInt("reserv_adult"), rs.getInt("reserv_child"), rs.getBoolean("isbreakfast"), rs.getInt("reserv_extra_bed"), 
					new Room(rs.getInt("room_no"),
							new RoomType(rs.getInt("room_type_no"), rs.getString("room_type_name"), rs.getString("room_type_img"), rs.getString("room_type_detail"), rs.getInt("room_type_qty"), rs.getBoolean("room_type_pool")),rs.getInt("room_price"),new ArrayList<Reserv>()), 
					new User(rs.getString("user_id"),null,rs.getString("user_name"),rs.getString("user_tel"),rs.getString("user_email"),null,null,null), 
					rs.getString("reserv_payment"), rs.getDate("reserv_date"), 
					new Coupon(rs.getInt("coupon_no"),rs.getString("coupon_name"),rs.getInt("coupon_dc_rate")), rs.getInt("reserv_fprice"));
			}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return findReserv;
	}
public List<Reserv> findAllReserv() throws Exception{
	List<Reserv> reservList = new ArrayList<Reserv>();
	Connection con = dataSource.getConnection();
	PreparedStatement pstmt = con.prepareStatement(ReservSQL.SELECT_RESERV_ALL);
	ResultSet rs = pstmt.executeQuery();
	while(rs.next()) {
		reservList.add(new Reserv(rs.getInt("reserv_no"), rs.getDate("reserv_check_in"), rs.getDate("reserv_check_out"), rs.getInt("reserv_adult"), rs.getInt("reserv_child"), rs.getBoolean("isbreakfast"), rs.getInt("reserv_extra_bed"), 
					new Room(rs.getInt("room_no"),
							new RoomType(rs.getInt("room_type_no"), rs.getString("room_type_name"), rs.getString("room_type_img"), rs.getString("room_type_detail"), rs.getInt("room_type_qty"), rs.getBoolean("room_type_pool")),rs.getInt("room_price"),new ArrayList<Reserv>()), 
					new User(rs.getString("user_id"),null,rs.getString("user_name"),rs.getString("user_tel"),rs.getString("user_email"),null,null,null), rs.getString("reserv_payment"), rs.getDate("reserv_date"), 
					new Coupon(rs.getInt("coupon_no"),rs.getString("coupon_name"),rs.getInt("coupon_dc_rate")), rs.getInt("reserv_fprice")));
	}
	rs.close();
	pstmt.close();
	dataSource.close(con);
	return reservList;
	
}
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
