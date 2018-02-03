package basicjava;

public class Student {


	String name;

	Student(String name) {
		this.name = name;

	}

	Student() {

	}

	int play(Game type) {
		if(type == Game.Basketball) {
			System.out.println("Playing basketball");
		}
		else if(type == Game.Soccer) {
			System.out.println("Playing soccer");
		}
		return 10;
	}


	int play2(int gametype) {
		switch (gametype) {
		case 1:
			System.out.println("I am playing basketball.");
			break;

		case 2:
			System.out.println("I am playing soccer.");
			break;
		default:
			System.out.println("I don't know what I am playing.");
		}
		return 10;
	}
}
