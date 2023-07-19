package hotel.user;

import java.util.ArrayList;
import java.util.List;

import hotel.inquiries.Inquiries;
import hotel.reserv.Reserv;

public class User {
	private String userId; //PK
	private String userPassword;
	private String userName;
	private String userTel;
	private String userEmail;
	private String userJumin;
	private List<Inquiries> inqList;
	private List<Reserv> reservList;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userId, String userPassword, String userName, String userTel, String userEmail, String userJumin,
			List<Inquiries> inqList, List<Reserv> reservList) {
		super();
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userTel = userTel;
		this.userEmail = userEmail;
		this.userJumin = userJumin;
		if (inqList==null) {
			this.inqList = new ArrayList<Inquiries>();
		}else {
			this.inqList = inqList;			
		}
		if (reservList==null) {
			this.reservList = new ArrayList<Reserv>();
		}else {
			this.reservList = reservList;			
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserJumin() {
		return userJumin;
	}

	public void setUserJumin(String userJumin) {
		this.userJumin = userJumin;
	}

	public List<Inquiries> getInqList() {
		return inqList;
	}

	public void setInqList(List<Inquiries> inqList) {
		this.inqList = inqList;
	}

	public List<Reserv> getReservList() {
		return reservList;
	}

	public void setReservList(List<Reserv> reservList) {
		this.reservList = reservList;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName + ", userTel="
				+ userTel + ", userEmail=" + userEmail + ", userJumin=" + userJumin + ", inqList=" + inqList
				+ ", reservList=" + reservList + "]";
	}
	
	
}