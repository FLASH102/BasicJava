
public class Person {
	int age;
	String name;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void printDetails() {
		System.out.println(name + "'s " + "age is " + age);
	}
}
