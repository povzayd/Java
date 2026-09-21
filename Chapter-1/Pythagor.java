import java.util.Scanner;
public class Pythagor{
	static void print(Object msg){
		System.out.print(msg);
	}
	static Scanner scanner = new Scanner(System.in);
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		double x = Double.parseDouble(input("Enter Base: "));
		double y = Double.parseDouble(input("Enter Height: "));
		print("Hypotenuse: " + (Math.sqrt((x*x)+(y*y))));
	}
}