package hotel.reserv;

public class ReservSQL {
public static final String ISNERT_RESERV = "insert into reserv(reserv_no,reserv_check_in,reserv_check_out,reserv_adult,reserv_child,isbreakfast,reserv_extra_bed,reserv_date,reserv_fprice,reserv_payment,coupon_no,user_id) values(reserv_reserv_no_seq.nextval,to_date(?,'YYYY/MM/DD'),to_date(?,'YYYY/MM/DD'),?,?,?,?,sysdate,?,?,?,?)";
public static final String SELECT_RESERV_BY_USER_ID = "select * from userinfo u join reserv r on u.user_id = r.user_id join coupon c on u.coupon_no=c.coupon_no where u.user_id=?";
public static final String DELETE_RESERV_BY_USER_ID = "delete from reserv where reserv.user_id=?";
public static final String SELECT_RESERV_ALL = "select * from userinfo u join reserv r on u.user_id  = r.user_id";
}
