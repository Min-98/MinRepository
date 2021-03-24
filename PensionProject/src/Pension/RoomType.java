package Pension;

public class RoomType {
	private int roomSize;
	private int price;
	
	public RoomType(int roomSize, int price) {
		this.roomSize = roomSize;
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append("(");
		sb = sb.append(this.roomSize);
		sb = sb.append("평/");
		sb = sb.append(this.price);
		sb = sb.append("원)");
		return sb.toString();
	}
	
	
}