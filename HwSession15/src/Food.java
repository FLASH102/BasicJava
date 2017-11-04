
public class Food {
	String name;
	int ageg;

	Food(String name, int age) {
	}

	void makeDinner(String foodDish, int serving) {
		buyFood(foodDish);
		cookFood(foodDish);
		serveFood(foodDish, serving);
	}

	private void buyFood(String foodDish) {
		System.out.println("I am buying the ingredients to make " + foodDish);
	}

	private void cookFood(String foodDish) {
		System.out.println("I am cooking " + foodDish);
	}

	private void serveFood(String foodDish, int serving) {
		System.out.println("I am serving " + foodDish + " for " + serving + " people");
	}
}
