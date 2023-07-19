package hotel.reserv;

import java.sql.Date;

import hotel.coupon.Coupon;
import hotel.room.Room;
import hotel.room_type.RoomType;
import hotel.user.User;

public class Reserv {
private int reservNo;
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
private Coupon coupon;
private int finalPrice;

}
