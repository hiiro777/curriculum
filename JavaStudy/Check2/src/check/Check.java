package check;

import constants.Constants;

public class Check {
	private static String firstName = "1";
	private static String lastName = "2";
	
	private static String printName = firstName + lastName;
	
	public void printName() {
		System.out.println("printNameメソッド" + "　→　" + printName);
	}

	public static void main(String[] args) {
		Check name = new Check();
		name.printName();
		Pet hoge = new Pet(Constants.CHECK_CLASS_HOGE, Constants.CHECK_CLASS_HOGE);
		hoge.introduce();
		Pet r2d2 = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		r2d2.introduce();		
	}
}
