import javax.swing.JOptionPane;
import java.util.Scanner;
public class SimpleGui{
	static void print(Object msg){
		System.out.print(msg);
	}
	static Scanner scanner = new Scanner(System.in);
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog("Enter Your Name: ");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age: "));
		JOptionPane.showMessageDialog(null, "You are "+ age);
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Weight: "));
		JOptionPane.showMessageDialog(null,"you are "+weight+"kgs.");
	}
}