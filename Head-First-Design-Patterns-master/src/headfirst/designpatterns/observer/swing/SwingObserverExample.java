package headfirst.designpatterns.observer.swing;
	
import java.awt.*;
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
