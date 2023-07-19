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
private int fPrice;

public Reserv() {
	// TODO Auto-generated constructor stub
}

public Reserv(int reservNo, Date reservCheckIn, Date reservCheckOut, int reservAdult, int reservChild,
		boolean isBreakfast, int reservExtraBed, Room room, User user, String reservPayment, Date reservDate,
		Coupon coupon, int fPrice) {
	super();
	this.reservNo = reservNo;
	this.reservCheckIn = reservCheckIn;
	this.reservCheckOut = reservCheckOut;
	this.reservAdult = reservAdult;
	this.reservChild = reservChild;
	this.isBreakfast = isBreakfast;
	this.reservExtraBed = reservExtraBed;
	this.room = room;
	this.user = user;
	this.reservPayment = reservPayment;
	this.reservDate = reservDate;
	this.coupon = coupon;
	this.fPrice = fPrice;
}

public int getReservNo() {
	return reservNo;
}

public void setReservNo(int reservNo) {
	this.reservNo = reservNo;
}

public Date getReservCheckIn() {
	return reservCheckIn;
}

public void setReservCheckIn(Date reservCheckIn) {
	this.reservCheckIn = reservCheckIn;
}

public Date getReservCheckOut() {
	return reservCheckOut;
}

public void setReservCheckOut(Date reservCheckOut) {
	this.reservCheckOut = reservCheckOut;
}

public int getReservAdult() {
	return reservAdult;
}

public void setReservAdult(int reservAdult) {
	this.reservAdult = reservAdult;
}

public int getReservChild() {
	return reservChild;
}

public void setReservChild(int reservChild) {
	this.reservChild = reservChild;
}

public boolean isBreakfast() {
	return isBreakfast;
}

public void setBreakfast(boolean isBreakfast) {
	this.isBreakfast = isBreakfast;
}

public int getReservExtraBed() {
	return reservExtraBed;
}

public void setReservExtraBed(int reservExtraBed) {
	this.reservExtraBed = reservExtraBed;
}

public Room getRoom() {
	return room;
}

public void setRoom(Room room) {
	this.room = room;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public String getReservPayment() {
	return reservPayment;
}

public void setReservPayment(String reservPayment) {
	this.reservPayment = reservPayment;
}

public Date getReservDate() {
	return reservDate;
}

public void setReservDate(Date reservDate) {
	this.reservDate = reservDate;
}

public Coupon getCoupon() {
	return coupon;
}

public void setCoupon(Coupon coupon) {
	this.coupon = coupon;
}

public int getfPrice() {
	return fPrice;
}

public void setfPrice(int fPrice) {
	this.fPrice = fPrice;
}

@Override
public String toString() {
	return "Reserv [reservNo=" + reservNo + ", reservCheckIn=" + reservCheckIn + ", reservCheckOut=" + reservCheckOut
			+ ", reservAdult=" + reservAdult + ", reservChild=" + reservChild + ", isBreakfast=" + isBreakfast
			+ ", reservExtraBed=" + reservExtraBed + ", room=" + room + ", user=" + user + ", reservPayment="
			+ reservPayment + ", reservDate=" + reservDate + ", coupon=" + coupon + ", fPrice=" + fPrice + "]";
}



}
