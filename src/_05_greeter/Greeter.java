package _05_greeter;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Greetings " + input);

	}

}
