package test;

import hotel.user.User;
import hotel.user.UserDao;

public class UserDaoTestMain {

	public static void main(String[] args) throws Exception {
		UserDao userDao=new UserDao();
		
		System.out.println("회원가입"+
				userDao.insert(new User()));
		
		System.out.println("회원찾기"+userDao.findByPrimaryKey(null));
		
		System.out.println("업데이트 "+userDao.update(
				new User()));
		
		System.out.println("삭제:"+userDao.delete(null));
		
		

	}
}
