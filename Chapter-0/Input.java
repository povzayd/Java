import java.util.Scanner;

public class Input{
	static void print(Object msg){
		System.out.print(msg);
	}
	static Scanner scanner = new Scanner(System.in);
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		String name = input("Enter your name: ");
		int age = Integer.parseInt(input("Enter your age: "));
		double weight = Double.parseDouble(input("Enter your weight: "));
		age++;
		print("Welcome: " + name + "\nYou are " + age + "\n You are " + weight + "kgs.");
	}
}






// static String input(String prompt) {
//         print(prompt);
//         return scanner.nextLine();
//     }