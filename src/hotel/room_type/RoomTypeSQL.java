package hotel.room_type;

public class RoomTypeSQL {
	public static final String INSERT_ROOM_TYPE=
			"insert into room_type (room_type_no,room_type_name,room_type_img,room_type_detail,room_type_qty,room_type_pool)\r\n"
			+ "        values (?,?,?,?,null,?)"; 
	public static final String DELETE_ROOM_TYPE="delete from room_type where room_type_no=?"; 
	public static final String SELECT_ALL="select * from room_type"; 
	public static final String SELECT_BY_ROOM_TYPE_NAME="select * from room_type where room_type_no=?"; 
	public static final String UPDATE_ROOM_TYPE="update room_type set room_type_detail=?,room_type_pool=? where room_type_np=?"; 
}
