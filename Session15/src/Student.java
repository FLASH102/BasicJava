
public class Student {
	String name;
	int age;

	Student(String name) {
		this.name = name;
		// Constructor is a special method that has the class name as the method
		// name, and doesn't
		// have a return type (void, int, etc.)
	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void readBook(String bookName) {
		checkOut(bookName);
		readingBook(bookName, 90, 200);
		returnBook(bookName);
	}

private	void checkOut(String bookName) {
		System.out.println(name + " is checking out " + bookName + ".");
	}

private	void readingBook(String bookName, int minutesRead, int pagesRead) {
		System.out.println(
				name + " is reading " + pagesRead + " pages of " + bookName + " for " + minutesRead + " minutes.");
	}

private	void returnBook(String bookName) {
		System.out.println(name + " is returning " + bookName + ".");
	}

}
