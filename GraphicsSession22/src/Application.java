import java.awt.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Hi");
		f.setSize(1000, 1000);
		f.setVisible(true);
		f.setBackground(Color.pink);

		Label l = new Label("Hey kids. This is my first GUI Application class!");

		f.add(l);

		Label l1 = new Label("Colors YAAAAS");
		f.add(l1);

	}

}
