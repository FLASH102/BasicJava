
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1 = new Student("BoB");
		Student S2 = new Student("DoD", 4);

		S1.checkOut("Percy Jackson"); //private method in Student class
		S2.readBook("Harry Potter");
	}

}
