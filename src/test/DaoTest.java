package test;

import java.sql.Date;
import java.util.ArrayList;

import hotel.reserv.Reserv;
import hotel.reserv.ReservDao;
import hotel.room.Room;
import hotel.room_type.RoomType;
import hotel.user.User;

public class DaoTest {
	
	public static void main(String[] args) throws Exception {
		ReservDao reservDao;
		reservDao = new ReservDao();
		/*
		 * private int reservNo;
	private Date reservCheckIn;
	private Date reservCheckOut;
	private int reservAdult;
	private int reservChild;
	private boolean isBreakfast;
	private int reservExtraBed;
	private Room room;
	private User user;
	private String reservPayment;
	private Date reservDate;
	private int fPrice;*/
		RoomType roomtype = new RoomType(10,"roomtype","url","detail",10,false);
		Room room = new Room(10,new RoomType(),80000,null);
		User user = new User("aaaa","aaaa","name","a","a","a",null);
		Reserv reserv= new Reserv(1,new Date(1),new Date(100),3,2,true,1,new Room(),new User(),"card",null,900000);
		//System.out.println(reservDao.insert(reserv));
		//System.out.println(reservDao.updateOption(reserv));
		//System.out.println(reservDao.deleteById("aaaa"));
		//System.out.println(reservDao.deleteByReservNO(1));
		
	}
	
}
