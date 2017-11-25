
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Math m1 = new Math();
		int result = m1.findAbsoluteValue(-12);
		System.out.println("The absolute value is " + result);
		
		Math m2 = new Math();
		result = m2.findAbsoluteValue(6);
		System.out.println("The absolute value is " + result);

		Math m3 = new Math();
		result = m3.getMaximumValue(4,7);
		System.out.println("The maximum number is " + result);
		
		Math m4 = new Math();
		result = m4.getMaximumValue(-2, -10);
		System.out.println("The maximum number is " + result);
	}

}
