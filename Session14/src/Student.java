
public class Student {
	String name;

	
	Student(String name) {
		this.name = name;
	}

	
	void readBook(String bookName) {
		System.out.println(name + " is reading " + bookName);
	}

	void readBook(String bookName, int minutesToRead) {
		System.out.println(name + " is reading " + bookName + " for " + minutesToRead + " minutes.");
	}

	void readbook(int minutesToRead) {
		System.out.println(name + " is reading his book for " + minutesToRead + " minutes.");
	}

	void readBook() {
		System.out.println(name + " is reading.");
	}

	void readBook(String bookName, int minutesToRead, int pagesToRead) {
		System.out.println(
				name + " is reading " + pagesToRead + " pages of " + bookName + " for " + minutesToRead + " minutes.");
	}
}
