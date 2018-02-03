
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Bob");
		p1.eatFruit(1);
		p1.eatFruit(2);//use numbers to call on a specific fruit; i.e 1 = apple

		p1.eatFruit(Fruit.Apple);
		p1.eatFruit(Fruit.Banana);//use String to call - static, numbers are still used
		
		p1.eatFruit(enumtest.Fruit.Apple);
		p1.eatFruit(enumtest.Fruit.Grape);//use enum for limited amount, in a set (can't call on an invalid fruit)
	}

}
