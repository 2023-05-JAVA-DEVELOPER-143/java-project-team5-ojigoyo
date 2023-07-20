package test;

import java.util.List;

import hotel.room.Room;
import hotel.room.RoomDao;

public class RoomDaoTestMain {

	public static void main(String[] args) throws Exception {
		RoomDao roomDao;
		roomDao=new RoomDao();
	
		List<Room> roomList =roomDao.findByRoomType(1);
		System.out.println(roomList);
	}

}
