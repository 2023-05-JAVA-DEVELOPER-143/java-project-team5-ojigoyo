package hotel.user;

public class UserService {
	private UserDao userDao;

	public UserService() throws Exception {
		userDao = new UserDao();
	}

	// 회원가입
	public boolean create(User newuser) throws Exception {
		boolean isSuccess=false;
		User findUser = userDao.findByPrimaryKey(newuser.getUser_Id());
		if (findUser==null){
	    	int rowCount=userDao.insert(newuser);
	    	isSuccess = true;

		}else {
			isSuccess=false;
		}
			return isSuccess;
		}
	

	// 회원 로그인
	public User login(String userId, String password) throws Exception {
		User loginUser =userDao.findByPrimaryKey(userId);
		if(loginUser!=null && loginUser.getUser_Password().equals(password)) {
			return loginUser;
		}
		return null;
		
	}
	
	
	public void logout() {

	}

	// 로그인 회원 정보보기
	public User findUser(String userId) throws Exception {
		return userDao.findByPrimaryKey(userId);
	}
	
	//아이디 찾기 
	public User findId(String username ,String userJumin)throws Exception{
		User localfindUser= userDao.findByUserId(username, userJumin);
		if(localfindUser!=null && localfindUser.getUser_Name().equals(username) && localfindUser.getUser_Jumin().equals(userJumin)) {
			return localfindUser;
		}return null;
	}
	
	//비밀번호찾기
	public User findPassword(String userId, String username,String userJumin)throws Exception{
		return userDao.findByUserPassword(userId, username, userJumin);
	}
	// 회원정보 수정
	public int update(User user) throws Exception {
		return userDao.update(user);
	}

	public boolean isDuplicated(String userId) throws Exception {
		if (userDao.countByUserId(userId) >= 1) {
			return true;
		} else {
			return false;
		}
	}

	public int remove(String userId) throws Exception {
		return userDao.delete(userId);
	}
}
