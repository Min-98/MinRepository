package Pension.test;

import Pension.util.WorkshopUtil;

public class PensionTest {
	public static void main(String[] args) {
		while (true) {
			try {
				WorkshopUtil.printHeader();			
				String input = WorkshopUtil.getUserInput("# �޴��� �Է��ϼ��� >> ");
				System.out.println("mission clear");
				break;
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
		}
	}
}