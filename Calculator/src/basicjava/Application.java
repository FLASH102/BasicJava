package basicjava;

import java.awt.*;

import javax.swing.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f1 = new JFrame("Calculator"); //adding a frame
		f1.setSize(1000, 1000);//setting the size dimensions
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//add method to close operation
		GridLayout frameLayout = new GridLayout(2, 2);//create grid layout object
		f1.setLayout(frameLayout);//use the object and assign to frame
		f1.setBackground(Color.BLACK);//set background color to black
		
		Result r1 = new Result(); //create the result panel
		JPanel dummy = new JPanel();//create a dummy panel to fill space
		NumberPanel n1 = new NumberPanel(r1);//create number panel, takes input from result panel
		OperationPanel o1 = new OperationPanel(r1);//create operation panel, takes input from result panel

		f1.add(r1);
		f1.add(dummy);
		f1.add(n1);
		f1.add(o1);//add the panels in the order you want them to show
		f1.setVisible(true);//frame should be visible

	}

		
	}







