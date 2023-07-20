package hotel.room_type;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;
import hotel.room.Room;

public class RoomTypeDao {
	private DataSource dataSource;
	public RoomTypeDao() throws Exception {
	dataSource=new DataSource();
	}
	
	/***************** insert RoomType  ******************/
	
	public int insertRoomType(RoomType roomType) throws Exception{
		int rowCount=0;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(RoomTypeSQL.INSERT_ROOM_TYPE);
		pstmt.setInt(1, roomType.getRoomTypeNo());
		pstmt.setString(2, roomType.getRoomTypeName());
		pstmt.setString(3, roomType.getRoomTypeImgUrl());
		pstmt.setString(4, roomType.getRoomTypeDetail());
		pstmt.setBoolean(5, roomType.isHasPool());
		rowCount=pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	
	
	/******************** select by RoomTypeName ***************************/
	
	public RoomType selectByRoomTypeName(int roomTypeNo) throws Exception{
		RoomType findRoomType =null;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(RoomTypeSQL.SELECT_BY_ROOM_TYPE_NO);
		pstmt.setInt(1, roomTypeNo);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			findRoomType=new RoomType(rs.getInt("room_type_no"), 
						 			  rs.getString("room_type_name"), 
						 			  rs.getString("room_type_img"), 
						 			  rs.getString("room_type_detail"),
						 			  0, 
						 			  rs.getBoolean("room_type_qty"));
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return findRoomType;
	}
	
	/******************** update By RoomTypeNo ****************************/
	public int updateRoomType(RoomType roomType) throws Exception{
		int rowCount =0;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(RoomTypeSQL.UPDATE_ROOM_TYPE);
		pstmt.setString(1, roomType.getRoomTypeDetail());
		pstmt.setBoolean(2, roomType.isHasPool());
		pstmt.setInt(3, roomType.getRoomTypeNo());
		rowCount=pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	

	/******************** deleteByRoomTypeNo *********************************/
	public int deleteRoomType(int roomTypeNo) throws Exception{
		int rowCount=0;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(RoomTypeSQL.DELETE_ROOM_TYPE);
		pstmt.setInt(1, roomTypeNo);
		rowCount=pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	

	
	/*********************** select all 기본 ***************************/
	
	public List<RoomType> selectAll() throws Exception{
		List<RoomType> roomTypeList = new ArrayList<RoomType>();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(RoomTypeSQL.SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			roomTypeList.add(new RoomType(rs.getInt("room_type_no"), 
		 			  					  rs.getString("room_type_name"), 
		 			  					  rs.getString("room_type_img"), 
		 			  					  rs.getString("room_type_detail"),
		 			  					  0, 
		 			  					  rs.getBoolean("room_type_qty")));
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return roomTypeList;
	}
	
	
	
	
	
	
	
}
