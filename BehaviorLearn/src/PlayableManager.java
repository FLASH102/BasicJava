
public class PlayableManager {
	static Playable getPlayer(int option) {// interface can be the output data type
		Playable player = null;
		switch (option) {
		case 1:
			player = new Person();
			break;
		case 2:
			player = new Dog();
			break;

		}
		return player;
	}
}
