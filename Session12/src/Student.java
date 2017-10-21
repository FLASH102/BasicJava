
public class Student {
	String name;
	int age;
	Student(String inputname,int inputage) {
		name = inputname;
		age = inputage;
	}

	int readBook(String bookName, int minutesToRead) {
		System.out.println("Read the book " + bookName + " for " + minutesToRead + " minutes");
		int minutesRead = 20;
		return minutesRead;

	}

	void doHomework() {
		System.out.println("Doing Homework! It sucks, bleh.");
	}
}
