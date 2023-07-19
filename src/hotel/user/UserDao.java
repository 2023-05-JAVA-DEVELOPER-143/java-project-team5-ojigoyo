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
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_INSERT);
		pstmt.setString(1, user.getUserId());
		pstmt.setString(2, user.getUserPassword());
		pstmt.setString(3, user.getUserName());
		pstmt.setString(4, user.getUserTel());
		pstmt.setString(5, user.getUserEmail());
		pstmt.setString(6, user.getUserJumin());
		int insertRowCount = pstmt.executeUpdate();
		return insertRowCount;
	}
	
	//update 정보수정
	public int update(User user) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_UPDATE);
		pstmt.setString(1, user.getUserId());
		pstmt.setString(2, user.getUserPassword());
		pstmt.setString(3, user.getUserName());
		pstmt.setString(4, user.getUserTel());
		pstmt.setString(5, user.getUserEmail());
		pstmt.setString(6, user.getUserJumin());
		int insertRowCount = pstmt.executeUpdate();
		return insertRowCount;
	}
	//delete 삭제
	public int delete(String userid) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_REMOVE);
		pstmt.setString(1, userid);
		int deleteRowCount = pstmt.executeUpdate();
		return deleteRowCount;
	}
	public User findByPrimaryKey(String userId)throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_SELECT_BY_ID);
		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		User findUser=null;
		if (rs.next()) {
			findUser = new User(userId, userId, userId, userId, userId, userId, null, null);
		}
		
		return findUser;
	}
	
	 //사용자가 존재하는지 여부를 확인
	public int countByUserId(String userId) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_SELECT_BY_ID_COUNT);
		return 0;
		
	}
}
