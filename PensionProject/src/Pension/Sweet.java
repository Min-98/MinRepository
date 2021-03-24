package Pension;

public class Sweet extends RoomType {
	public Sweet() {
		super(30, 260000);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append("½ºÀ§Æ®·ë ");
		sb = sb.append(super.toString());
		return sb.toString();
	}
	
}