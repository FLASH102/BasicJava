import java.awt.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.awt.Frame f = new java.awt.Frame("Bhavika");
		f.setSize(500, 800);
		f.setVisible(true);

		
		
		Label l = new Label("Hey kids! This is my first GUI application.");

		f.add(l);
	
		
		double getMathPI = Math.PI;

		System.out.println(getMathPI);

	}

}
