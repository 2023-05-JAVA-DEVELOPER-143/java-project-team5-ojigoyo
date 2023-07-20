package hotel.coupon;

import java.util.List;

import hotel.user.User;

public class UserCoup {
private int userCoupNo;
private List<User> userList;
private List<Coupon> couponList;

public UserCoup() {
	// TODO Auto-generated constructor stub
}

public UserCoup(int userCoupNo, List<User> userList, List<Coupon> couponList) {
	super();
	this.userCoupNo = userCoupNo;
	this.userList = userList;
	this.couponList = couponList;
}

public int getUserCoupNo() {
	return userCoupNo;
}

public void setUserCoupNo(int userCoupNo) {
	this.userCoupNo = userCoupNo;
}

public List<User> getUserList() {
	return userList;
}

public void setUserList(List<User> userList) {
	this.userList = userList;
}

public List<Coupon> getCouponList() {
	return couponList;
}

public void setCouponList(List<Coupon> couponList) {
	this.couponList = couponList;
}

@Override
public String toString() {
	return "UserCoup [userCoupNo=" + userCoupNo + ", userList=" + userList + ", couponList=" + couponList + "]";
}


}
