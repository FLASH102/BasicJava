
public class Person {
	String name;

	Person(String name) {
		this.name = name;

	}

	void eatFruit(int fruitType) {
		if (fruitType == 1) {
			System.out.println("Eating Apple");
		} else if (fruitType == 2) {
			System.out.println("Eating Banana");

		} else {
			System.out.println("I do not know what fruit I am eating");
		}
	}
	
	void eatFruit(enumtest.Fruit fruitType) {
		System.out.println("Eating " + fruitType);
	}
}
