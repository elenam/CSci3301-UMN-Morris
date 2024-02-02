package headfirst.designpatterns.observer.swing;
	
import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;
	
public class SwingObserverExample {
	static JFrame frame; // make the frame static to avoid creating an object
	
	public static void main(String[] args) {
		example();
		// Elena: There is absolutely no need to create an object 
		// for the example; commenting out the code below:
//		SwingObserverExample example = new SwingObserverExample();
//		example.go();
	}
	
	public static void example() {
		frame = new JFrame();

		JButton button = new JButton("Should I do it?");
		
		// Without lambdas
		//button.addActionListener(new AngelListener()); // the inner class commented out below
		//button.addActionListener(new DevilListener()); // the inner class commented out below
		
		// With lambdas
		button.addActionListener(event -> 
			System.out.println("Don't do it, you might regret it!")
		);
		button.addActionListener(event ->
			System.out.println("Come on, do it!")
		);
		
		
		
		// Displaying the button
		frame.getContentPane().add(BorderLayout.CENTER, button);		
	

		// Set frame properties 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);

		// This code shows how to set the button background:
		//button.setBackground(Color.BLUE);
		
		// Then add a listener that, every time the button is pressed, changes
		// the background to a random color out of three colors of your choice.
		// Note that it's better to put the color choice in a separate static method 
		// and just call that method in the lambda. 
	}
	

	
	/*
	 * Remove these two inner classes to use lambda expressions instead.
	 * 
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it!");
		}
	}

	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, do it!");
		}
	}
	*/

}
