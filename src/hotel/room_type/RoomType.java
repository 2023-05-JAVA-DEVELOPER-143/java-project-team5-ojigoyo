package hotel.room_type;

public class RoomType {
	private int roomTypeNo;
	private String roomTypeName;
	private String roomTypeImgUrl;
	private String roomTypeDetail;
	private int roomTypeQty;
	private boolean hasPool;

	public RoomType() {
		
	}

	public RoomType(int roomTypeNo, String roomTypeName, String roomTypeImgUrl, String roomTypeDetail, int roomTypeQty,
			boolean hasPool) {
		super();
		this.roomTypeNo = roomTypeNo;
		this.roomTypeName = roomTypeName;
		this.roomTypeImgUrl = roomTypeImgUrl;
		this.roomTypeDetail = roomTypeDetail;
		this.roomTypeQty = roomTypeQty;
		this.hasPool = hasPool;
	}

	

	@Override
	public String toString() {
		return "RoomType [roomTypeNo=" + roomTypeNo + ", roomTypeName=" + roomTypeName + ", roomTypeImgUrl="
				+ roomTypeImgUrl + ", roomTypeDetail=" + roomTypeDetail + ", roomTypeQty=" + roomTypeQty + ", hasPool="
				+ hasPool + "]";
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

	public String getRoomTypeImgUrl() {
		return roomTypeImgUrl;
	}

	public void setRoomTypeImgUrl(String roomTypeImgUrl) {
		this.roomTypeImgUrl = roomTypeImgUrl;
	}

	public String getRoomTypeDetail() {
		return roomTypeDetail;
	}

	public void setRoomTypeDetail(String roomTypeDetail) {
		this.roomTypeDetail = roomTypeDetail;
	}

	public int getRoomTypeQty() {
		return roomTypeQty;
	}

	public void setRoomTypeQty(int roomTypeQty) {
		this.roomTypeQty = roomTypeQty;
	}

	public boolean isHasPool() {
		return hasPool;
	}

	public void setHasPool(boolean hasPool) {
		this.hasPool = hasPool;
	}
	
	
	
}
