
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player();
		
		p1.play();
		
		int scoreReceived = p1.getScore();
		System.out.println("I got " + scoreReceived + " points!");
		
		p1.getScore(10);

	}

}
