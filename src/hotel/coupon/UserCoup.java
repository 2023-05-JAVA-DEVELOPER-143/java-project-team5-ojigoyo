package hotel.coupon;

import java.util.ArrayList;
import java.util.List;

import hotel.user.User;

public class UserCoup {
	private int userCoup_No;
	
	private User user;
	private List<Coupon> couponList;
	
	public UserCoup() {
		couponList =new ArrayList<Coupon>();
	}

	public UserCoup(int userCoupNo, User user, List<Coupon> couponList) {
		super();
		this.userCoup_No = userCoupNo;
		this.user = user;
		if(couponList==null) {
			this.couponList=new ArrayList<Coupon>();
		}else {
			this.couponList = couponList;			
		}
	}

	public int getUserCoupNo() {
		return userCoup_No;
	}

	public void setUserCoupNo(int userCoupNo) {
		this.userCoup_No = userCoupNo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Coupon> getCouponList() {
		return couponList;
	}

	public void setCouponList(List<Coupon> couponList) {
		this.couponList = couponList;
	}

	@Override
	public String toString() {
		return "UserCoup [userCoupNo=" + userCoup_No + ", user=" + user + ", couponList=" + couponList + "]";
	}
	
	


}
