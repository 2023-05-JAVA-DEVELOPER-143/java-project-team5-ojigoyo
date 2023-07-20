package test;

import java.util.ArrayList;

import hotel.coupon.UserCoup;
import hotel.inquiries.Inquiries;
import hotel.user.User;
import hotel.user.UserDao;


public class UserDaoTestMain {

	public static void main(String[] args) throws Exception {
		UserDao userDao=new UserDao();
		
		ArrayList<Inquiries> inquiries = new ArrayList<Inquiries>();
		
		//중복처리
		//System.out.println("회원가입"+userDao.insert(new User("rrrr","admin","admin","112","112","960410",userCoupon, inquiries)));
		
				
	
		System.out.println("회원찾기"+userDao.findByPrimaryKey("admin"));
		
		System.out.println("업데이트 "+userDao.update(new User("rrrr","zzzz","bman","999-999","zz@zz","410960",inquiries)));
		
		
		System.out.println("삭제:"+userDao.delete("dddd"));
		
	

	}
}
