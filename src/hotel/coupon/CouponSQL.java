package hotel.coupon;

public class CouponSQL {
public static final String INSERT_COUPON = "insert into coupon(coupon_no,coupon_name,coupon_dc_rate) values(coupon_coupon_no_seq.nextval,?,?)";
public static final String FIND_COUP_BY_USER_ID="select * from user_coup uc join userinfo u on uc.user_id = u.user_id join coupon c on uc.coupon_no=c.coupon_no where u.user_id=?";
public static final String DELETE_COUPON="delete from coupon where coupon_no=?";
public static final String UPDATE_COUPON_DC = "update coupon set coupon_name=?, coupon_dc_rate=? where coupon_no=?";
}
