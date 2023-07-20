package test;

import hotel.room_type.RoomType;
import hotel.room_type.RoomTypeDao;

public class RoomTypeDatoTestMain {

	public static void main(String[] args) throws Exception {
		RoomTypeDao roomTypeDao;
		roomTypeDao=new RoomTypeDao();
		
		RoomType a =roomTypeDao.findQtyByRoomTypeName("1번객실타입");
		System.out.println(a);
	}

}
