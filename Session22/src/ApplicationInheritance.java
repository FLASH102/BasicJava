
public class ApplicationInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nissan n1 = new Nissan();
		n1.wheels = 4;
		System.out.println(n1.wheels);

		NissanSportsCar s1 = new NissanSportsCar();
		s1.startCar();

		Honda h1 = new Honda();
		h1.wheels = 2;
		System.out.println(h1.wheels);
	}

}
