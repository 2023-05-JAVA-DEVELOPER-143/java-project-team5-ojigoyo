package test;

import java.sql.Date;
import java.util.ArrayList;

import hotel.coupon.Coupon;
import hotel.reserv.Reserv;
import hotel.reserv.ReservDao;
import hotel.room.Room;
import hotel.room_type.RoomType;
import hotel.user.User;

public class DaoTest {
	
	public static void main(String[] args) throws Exception {
		ReservDao reservDao;
		reservDao = new ReservDao();
		Reserv reserv = new Reserv(0, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()), 1, 1, false, 0, null, null, "card", null, null,9000);
		System.out.println(reservDao.insertReserv(reserv));
	}
	
}
