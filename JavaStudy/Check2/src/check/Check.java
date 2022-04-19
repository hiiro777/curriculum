package check;

import constants.Constants;

public class Check {
	private static String firstName = "矢部";
	private static String lastName = "裕晃";
	
	private void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド" + "　→　" + firstName + lastName);
	}

	public static void main(String[] args) {
		Check name = new Check();
		name.printName(firstName, lastName);
		Pet hoge = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		hoge.introduce();
		RobotPet r2d2 = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		r2d2.introduce();		
	}
}
