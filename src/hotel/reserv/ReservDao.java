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
	
	
}
