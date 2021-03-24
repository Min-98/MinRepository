package Pension;

public class Customer {
	private String name;
	private String phone;
	public static int index = 0;
	
	public Customer(String name, String phone) { //생성자
		this.name = name;             // this.name 필드, name(매개변수)
		this.phone = phone;           
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append("현재 투숙객 - [이름] ");
		sb = sb.append(this.name);
		sb = sb.append(" [전화번호] ");
		sb = sb.append(this.phone);
		return sb.toString();
	}
}