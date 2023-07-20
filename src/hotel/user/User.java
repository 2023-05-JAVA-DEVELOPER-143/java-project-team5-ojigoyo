package hotel.user;

import java.util.ArrayList;
import java.util.List;

import hotel.coupon.UserCoup;
import hotel.inquiries.Inquiries;

public class User {
	private String user_Id; // PK
	private String user_Password;
	private String user_Name;
	private String user_Tel;
	private String user_Email;
	private String user_Jumin;
	
	private List<UserCoup> coupList;
	private List<Inquiries> inqList;

    public User() {
        coupList = new ArrayList<UserCoup>(); 
        inqList = new ArrayList<Inquiries>();
    }

	public User(String user_Id, String user_Password, String user_Name, String user_Tel, String user_Email,
			String user_Jumin, List<UserCoup> coupList, List<Inquiries> inqList) {
		super();
		this.user_Id = user_Id;
		this.user_Password = user_Password;
		this.user_Name = user_Name;
		this.user_Tel = user_Tel;
		this.user_Email = user_Email;
		this.user_Jumin = user_Jumin;
		if (coupList==null) {
			this.coupList =new ArrayList<UserCoup>();
		}else {
			this.coupList = coupList;			
		}
		if(inqList==null) {
			this.inqList =new ArrayList<Inquiries>();
		}else {
			this.inqList = inqList;			
		}
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

	public List<UserCoup> getCoupList() {
		return coupList;
	}

	public void setCoupList(List<UserCoup> coupList) {
		this.coupList = coupList;
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
				+ ", user_Tel=" + user_Tel + ", user_Email=" + user_Email + ", user_Jumin=" + user_Jumin + ", coupList="
				+ coupList + ", inqList=" + inqList + "]";
	}

	
	

	
	
	

	
	
	
}