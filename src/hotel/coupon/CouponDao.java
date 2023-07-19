package hotel.coupon;

import java.sql.Connection;
import java.sql.PreparedStatement;

import common.DataSource;

public class CouponDao {
DataSource dataSource;
public CouponDao() throws Exception{
	dataSource = new DataSource();
}
public int insertCoup(Coupon coup) throws Eception{
	Connection con = dataSource.getConnection();
	PreparedStatement pstmt = con.prepareStatement(CouponSQL.INSERT_COUPON);
	pstmt.setString(1, "name");
	pstmt.setString(2, "rmsid");
}
public int deleteCoup(int coupNo) {
	Connection con = dataSource.getConnection();
	PreparedStatement pstmt = con.prepareStatement("bb");
	int rowCount = pstmt.setInt(1, coupNo);
	
	pstmt.close();
}
}
