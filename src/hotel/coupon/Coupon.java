package hotel.coupon;

/**
 * @author itwill
 *
 */
public class Coupon {
	private int coupon_No;
	private String coupon_Name;
	private int coupon_Dc_Rate;

	public Coupon() {
	// TODO Auto-generated constructor stub
	}

	public Coupon(int coupon_No, String coupon_Name, int coupon_Dc_Rate) {
		super();
		this.coupon_No = coupon_No;
		this.coupon_Name = coupon_Name;
		this.coupon_Dc_Rate = coupon_Dc_Rate;
	}

	public int getCoupon_No() {
		return coupon_No;
	}

	public void setCoupon_No(int coupon_No) {
		this.coupon_No = coupon_No;
	}

	public String getCoupon_Name() {
		return coupon_Name;
	}

	public void setCoupon_Name(String coupon_Name) {
		this.coupon_Name = coupon_Name;
	}

	public int getCoupon_Dc_Rate() {
		return coupon_Dc_Rate;
	}

	public void setCoupon_Dc_Rate(int coupon_Dc_Rate) {
		this.coupon_Dc_Rate = coupon_Dc_Rate;
	}

	@Override
	public String toString() {
		return "Coupon [coupon_No=" + coupon_No + ", coupon_Name=" + coupon_Name + ", coupon_Dc_Rate=" + coupon_Dc_Rate
				+ "]";
	}
	
	
}
