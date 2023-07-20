package hotel.coupon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;

public class CouponDao {
	DataSource dataSource;

	public CouponDao() throws Exception {
		dataSource = new DataSource();
	}

	public int insertCoup(Coupon coup) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CouponSQL.INSERT_COUPON);
		pstmt.setString(1, coup.getCoupon_Name());
		pstmt.setInt(2, coup.getCoupon_Dc_Rate());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}

	public int deleteCoup(int coupNo) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CouponSQL.DELETE_COUPON);
		pstmt.setInt(1, coupNo);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	
	public int updateCoup(Coupon coup) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CouponSQL.UPDATE_COUPON_DC);
		pstmt.setString(1, coup.getCoupon_Name());
		pstmt.setInt(2, coup.getCoupon_Dc_Rate());
		pstmt.setInt(3, coup.getCoupon_No());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	public List<Coupon> findCoupById(String userId)throws Exception{
		List findCoup = new ArrayList<Coupon>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CouponSQL.FIND_COUP_BY_USER_ID);
		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			findCoup.add(new Coupon(rs.getInt("coupon_no"), rs.getString("coupon_name"), rs.getInt("coupon_dc_rate")));
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);		
		return findCoup;
	}
}
