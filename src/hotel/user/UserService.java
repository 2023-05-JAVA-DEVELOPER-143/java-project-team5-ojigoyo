package hotel.user;

public class UserService {
	private UserDao userDao;

	public UserService() throws Exception {
		userDao = new UserDao();
	}

	// 회원가입
	public int create(User user) throws Exception {
		if (userDao.countByUserId(user.getUser_Id()) >= 1) {
			return -1;
		} else {
			int rowCount = userDao.insert(user);
			return rowCount;
		}
	}

	// 회원 로그인
	public int login(String userId, String password) throws Exception {
		// 0: 실패
		// 1: 성공
		int result = 0;
		if (userDao.countByUserId(userId) == 1) {
			// 아이디존재하는경우
			User loginUser = userDao.findByPrimaryKey(userId);
			if (loginUser.getUser_Password().equals(password)) {
				// 패쓰워드일치
				result = 1;
			} else {
				// 패쓰워드불일치
				result = 0;
			}
		} else {
			// 회원이아닌경우
			result = 0;
		}
		return result;
	}

	public void logout() {

	}

	// 로그인 회원 정보보기
	public User findUser(String userId) throws Exception {
		return userDao.findByPrimaryKey(userId);
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
