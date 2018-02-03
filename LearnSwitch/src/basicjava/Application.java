
package basicjava;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Bob");
		Student s2 = new Student();

		int minutesPlayed = s1.play(Game.Basketball);

		System.out.println(minutesPlayed);

		minutesPlayed = s2.play2(2);

		System.out.println(minutesPlayed);
	}

}
