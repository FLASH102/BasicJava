
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1 = new Student("Name", 17);
		S1.doHomework();
		int minutes = S1.readBook("Percy Jackson", 30);
		System.out.println("I have read it for " + minutes + " minutes");
	}

}
