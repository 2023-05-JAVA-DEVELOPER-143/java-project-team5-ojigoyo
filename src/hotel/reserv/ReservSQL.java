package hotel.reserv;

public class ReservSQL {
//public static final String INSERT_RESERV = "insert into reserv(reserv_no,reserv_check_in,reserv_check_out,reserv_adult,reserv_child,isbreakfast,reserv_extra_bed,reserv_date,reserv_fprice,reserv_payment,user_id) values(reserv_reserv_no_seq.nextval,to_date(?,'YYYY/MM/DD'),to_date(?,'YYYY/MM/DD'),?,?,?,?,sysdate,?,?,?)";
public static final String INSERT_RESERV = "insert into reserv(reserv_no,reserv_check_in,reserv_check_out,reserv_adult,reserv_child,isbreakfast,reserv_extra_bed,reserv_date,reserv_payment,user_id) values(reserv_reserv_no_seq.nextval,?,?,?,?,?,?,sysdate,?,?)";
public static final String UPDATE_RESERV_OPTION="update reserv set RESERV_ADULT=?,RESERV_CHILD=?,ISBREAKFAST=?,RESERV_EXTRA_BED=?,RESERV_PAYMENT=? where reserv_no=?";
public static final String DELETE_RESERV_BY_USER_ID = "delete from reserv where reserv.user_id=?";
public static final String DELETE_RESERV_BY_RESERV_NO= "delete from reserv where reserv_no=?";
public static final String SELECT_RESERV ="select * from reserv";
public static final String SELECT_ROOM_ROOMTYPE_ALL="select * from room r join room_type rt on r.room_type_no= rt.room_type_no";
public static final String SELECT_ROOM_ROOMTYPE_RESERV_ALL="select * from room r join room_type rt on r.room_type_no= rt.room_type_no join reserv re on re.room_no=r.room_no";
//public static final String FIND_EMPTY_ROOM="select * from room r join room_type rt on r.room_type_no= rt.room_type_no join reserv re on re.room_no=r.room_no where rt.room_type_no=? and re.reserv_date>? or re.reserv_date<?";
public static final String FIND_EMPTY_ROOM="select * from room r join room_type rt on r.room_type_no= rt.room_type_no join reserv re on re.room_no=r.room_no where re.reserv_date>? or re.reserv_date<?";
public static final String SELECT_RESERV_USER_ALL="select * from reserv re join userinfo u on u.user_id = re.user_id";
public static final String SELECT_RESERV_USER_DETAIL="select * from reserv re join userinfo u on u.user_id = re.user_id join room r on re.room_no=r.room_no join room_type rt on r.room_type_no = rt.room_type_no where re.reserv_no=?";
public static final String SELECT_RESERV_BY_ID="select * from reserv re join userinfo u on u.user_id = re.user_id where u.user_id=?";
public static final String FIND_MY_RESERV_DEFAULT="select * from reserv re join userinfo u on u.user_id = re.user_id where u.user_id =? and (sysdate-reserv_date)<30";
public static final String FIND_MY_RESERV_BY_DATE="select * from reserv re join userinfo u on u.user_id = re.user_id where u.user_id =? and reserv_date Between ? and ?+1";
}
