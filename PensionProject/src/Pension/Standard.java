package Pension;

public class Standard extends RoomType {
	
	public Standard() {
		super(14, 80000);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append("½ºÅÄ´Ù¸£·ë ");
		sb = sb.append(super.toString());
		return sb.toString();
	}
	
	
}