package Pension;

public class Sweet extends RoomType {
	public Sweet() {
		super(30, 260000);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append("����Ʈ�� ");
		sb = sb.append(super.toString());
		return sb.toString();
	}
	
}