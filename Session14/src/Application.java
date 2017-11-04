
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TODAYYYYY ISSSS OCTOBER 21, 2017! ONLY 10 DAYS BEFORE HALLOWEEN...BOOOOOOOOO!!!");

		int tableNumber = 8;
		for (int i = 1; i <= 25; i = i + 1) {
			int result = tableNumber * i;
			System.out.println(tableNumber + "*" + i + " = " + result);
		}

		char x = 'B';
		System.out.println(x);

		Student S1 = new Student("Bob");
		S1.readBook("Percy Jackson");
		S1.readBook("Percy Jackson", 30);
		S1.readbook(10);
		S1.readBook();
		S1.readBook("Percy Jackson", 50, 45);
	}

}
