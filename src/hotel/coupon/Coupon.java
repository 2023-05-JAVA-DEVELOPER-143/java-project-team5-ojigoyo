package hotel.coupon;

public class Coupon {
private int couponNo;
private String couponName;
private int couponDcRate;
public Coupon() {
	// TODO Auto-generated constructor stub
}
public Coupon(int couponNo, String couponName, int couponDcRate) {
	super();
	this.couponNo = couponNo;
	this.couponName = couponName;
	this.couponDcRate = couponDcRate;
}
public int getCouponNo() {
	return couponNo;
}
public void setCouponNo(int couponNo) {
	this.couponNo = couponNo;
}
public String getCouponName() {
	return couponName;
}
public void setCouponName(String couponName) {
	this.couponName = couponName;
}
public int getCouponDcRate() {
	return couponDcRate;
}
public void setCouponDcRate(int couponDcRate) {
	this.couponDcRate = couponDcRate;
}
@Override
public String toString() {
	return "Coupon [couponNo=" + couponNo + ", couponName=" + couponName + ", couponDcRate=" + couponDcRate + "]";
}

}
