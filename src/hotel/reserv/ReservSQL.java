package hotel.reserv;

public class ReservSQL {
public static final String ISNERT_RESERV = "insert into reserv(reserv_no,reserv_check_in,reserv_check_out,reserv_adult, reserv_child,isbreakfast,reserv_extra_bed,reserv_date,reserv_fprice,reserv_payment,user_id) values(reserv_reserv_no_seq.nextval,?,?,?,?,?,?,sysdate,?,?,?)";
public static final String SELECT_RESERV_BY_USER_ID = "select * from userinfo u join reserv r on u.user_id =r.user_id join user_coup uc on uc.user_id=u.user_id where u.user_id=?";
public static final String DELETE_RESERV_BY_USER_ID = "delete from reserv where reserv.user_id=?";
public static final String SELECT_RESERV_ALL = "select * from userinfo u join reserv r on u.user_id  = r.user_id";
}
