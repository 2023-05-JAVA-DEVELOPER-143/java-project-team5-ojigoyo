package hotel.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import common.DataSource;

public class UserDao {
	private DataSource dataSource;
	
	public UserDao() throws Exception{
		dataSource=new DataSource();
	}
	
	// create(insert) User테이블에 새로운 생성자.
	public int insert(User user) throws Exception{
		return 0;
	}
	
	//update 정보수정
	public int update(User user) throws Exception{
		
		return 0;
	}
	//delete 삭제
	public int delete(String userid) throws Exception{
		
		return 0;
	}
	public User findByPrimaryKey(String userId)throws Exception {
		User user=null;
		return user;
	}
	
	 //사용자가 존재하는지 여부를 확인
	public int countByUserId(String userId) throws Exception {

		return 0;
		
	}
}
