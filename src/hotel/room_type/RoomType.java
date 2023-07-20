package hotel.room_type;

public class RoomType {
	private int roomTypeNo;
	private String roomTypeName;
	private String roomTypeImg;
	private String roomTypeDetail;
	private Boolean roomTypePool;
	private int roomTypeQty;

	public RoomType() {
		// TODO Auto-generated constructor stub
	}

	public RoomType(int roomTypeNo, String roomTypeName, String roomTypeImg, String roomTypeDetail,
			Boolean roomTypePool, int roomTypeQty) {
		super();
		this.roomTypeNo = roomTypeNo;
		this.roomTypeName = roomTypeName;
		this.roomTypeImg = roomTypeImg;
		this.roomTypeDetail = roomTypeDetail;
		this.roomTypePool = roomTypePool;
		this.roomTypeQty = roomTypeQty;
	}

	public int getRoomTypeNo() {
		return roomTypeNo;
	}

	public void setRoomTypeNo(int roomTypeNo) {
		this.roomTypeNo = roomTypeNo;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public String getRoomTypeImg() {
		return roomTypeImg;
	}

	public void setRoomTypeImg(String roomTypeImg) {
		this.roomTypeImg = roomTypeImg;
	}

	public String getRoomTypeDetail() {
		return roomTypeDetail;
	}

	public void setRoomTypeDetail(String roomTypeDetail) {
		this.roomTypeDetail = roomTypeDetail;
	}

	public Boolean getRoomTypePool() {
		return roomTypePool;
	}

	public void setRoomTypePool(Boolean roomTypePool) {
		this.roomTypePool = roomTypePool;
	}

	public int getRoomTypeQty() {
		return roomTypeQty;
	}

	public void setRoomTypeQty(int roomTypeQty) {
		this.roomTypeQty = roomTypeQty;
	}

	@Override
	public String toString() {
		return "RoomType [roomTypeNo=" + roomTypeNo + ", roomTypeName=" + roomTypeName + ", roomTypeImg=" + roomTypeImg
				+ ", roomTypeDetail=" + roomTypeDetail + ", roomTypePool=" + roomTypePool + ", roomTypeQty="
				+ roomTypeQty + "]";
	}
	
	
	
	
	
	
}
