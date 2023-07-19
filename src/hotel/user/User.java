package hotel.user;

import java.util.ArrayList;
import java.util.List;

import hotel.coupon.Coupon;
import hotel.inquiries.Inquiries;
import hotel.reserv.Reserv;

public class User {
	private String user_Id; //PK
	private String user_Password;
	private String user_Name;
	private String user_Tel;
	private String user_Email;
	private String user_Jumin;
	private List<Coupon> couponList;
	private List<Inquiries> inqList;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String user_Id, String user_Password, String user_Name, String user_Tel, String user_Email,
			String user_Jumin, List<Coupon> couponList, List<Inquiries> inqList) {
		super();
		this.user_Id = user_Id;
		this.user_Password = user_Password;
		this.user_Name = user_Name;
		this.user_Tel = user_Tel;
		this.user_Email = user_Email;
		this.user_Jumin = user_Jumin;
		this.couponList = couponList;
		this.inqList = inqList;
	}

	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	public String getUser_Password() {
		return user_Password;
	}

	public void setUser_Password(String user_Password) {
		this.user_Password = user_Password;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getUser_Tel() {
		return user_Tel;
	}

	public void setUser_Tel(String user_Tel) {
		this.user_Tel = user_Tel;
	}

	public String getUser_Email() {
		return user_Email;
	}

	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}

	public String getUser_Jumin() {
		return user_Jumin;
	}

	public void setUser_Jumin(String user_Jumin) {
		this.user_Jumin = user_Jumin;
	}

	public List<Coupon> getCouponList() {
		return couponList;
	}

	public void setCouponList(List<Coupon> couponList) {
		this.couponList = couponList;
	}

	public List<Inquiries> getInqList() {
		return inqList;
	}

	public void setInqList(List<Inquiries> inqList) {
		this.inqList = inqList;
	}

	@Override
	public String toString() {
		return "User [user_Id=" + user_Id + ", user_Password=" + user_Password + ", user_Name=" + user_Name
				+ ", user_Tel=" + user_Tel + ", user_Email=" + user_Email + ", user_Jumin=" + user_Jumin
				+ ", couponList=" + couponList + ", inqList=" + inqList + "]";
	}

	
	
}