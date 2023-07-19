package hotel.user;

public class UserSQL {
	public static final String  USER_INSERT=
			"insert into userinfo(USER_ID,USER_PASSWORD,USER_NAME,USER_EMAIL,USER_PHONE,USER_ADDRESS,USER_GENDER,USER_BIRTHDATE) "
			+ "values(?,?,?,?,?,?,?,sysdate)";
	
	public static final String USER_SELECT_BY_ID="";
	
	public static final String USERT_REMOVE="";
	
	public static final String USER_UPDATE="";
	
	public static final String USER_SELECT_BY_ID_COUNT="";
}
