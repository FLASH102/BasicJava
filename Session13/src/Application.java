
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Bhavika", 13);
		boolean canDrive = p1.canDrive();

		if (canDrive) {
			System.out.println(p1.name + ", you can drive! WHOOP WHOOP YAYAY");
		} else {
			System.out.println(p1.name + ", you cannot drive. wahwah");
		}

		Person p2 = new Person("Momoji", 66);
		canDrive = p2.canDrive();

		if (canDrive) {
			System.out.println(p2.name + ", you can drive! WHOOP WHOOP YAYAY");
		} else {
			System.out.println(p2.name + ", you cannot drive. wahwah.");
		}

	}

}
