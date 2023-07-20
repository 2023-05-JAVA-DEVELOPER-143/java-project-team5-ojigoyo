package hotel.room_type;

public class RoomTypeSQL {
	public static final String INSERT_ROOM_TYPE=
			"insert into room_type (room_type_no,room_type_name,room_type_img,room_type_detail,room_type_qty,room_type_pool)\r\n"
			+ "        values (?,?,?,?,null,?)"; 
	public static final String DELETE_ROOM_TYPE="delete from room_type where room_type_no=?"; 
	public static final String SELECT_ALL="select * from room_type"; 
	public static final String SELECT_BY_ROOM_TYPE_NO="select * from room_type where room_type_no=?"; 
	public static final String UPDATE_ROOM_TYPE="update room_type set room_type_detail=?,room_type_pool=? where room_type_no=?"; 

	public static final String FIND_QTY_BY_ROOM_TYPE_NAME ="select room_type_name,room_type_qty from room_type where room_type_name=?";

	
	public static final String ROOM_SELECT_BY_ROOM_TYPE="select * from room_type where room_type_no=?";
	
	public static final String Find_ROOM_DETAIL =
			"select room_type_name,room_price,room_type_detail,room_type_pool,room_type_qty from room_type rt join room r on rt.room_type_no=r.room_type_no where rt.room_type_name=?";
	
	public static final String FIND_MIN_PRICE=
			"select r.room_type_no,min(room_price) from room_type rt join room r on rt.room_type_no=r.room_type_no where r.room_type_no=? group by r.room_type_no";


}
