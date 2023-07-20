package hotel.room_type;

import java.sql.Connection;
import java.sql.PreparedStatement;

import common.DataSource;

public class RoomTypeDao {
	private DataSource dataSource;
	public RoomTypeDao() throws Exception {
	dataSource=new DataSource();
	}
	
	/***************** insert RoomType 기본 ******************/
	
	public void insertRoomType(RoomType roomType) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(RoomTypeSQL.INSERT_ROOM_TYPE);
		pstmt.setInt(1, roomType.getRoomTypeNo());
		pstmt.setString(2, roomType.getRoomTypeName());
		pstmt.setString(3, roomType.getRoomTypeImgUrl());
		pstmt.setString(4, roomType.getRoomTypeDetail());
		pstmt.setBoolean(5, roomType.isHasPool());
		
		
		
	}
	
	
	
	
	
}
