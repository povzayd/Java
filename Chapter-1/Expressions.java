import java.util.Scanner; 
public class Expressions{
	static void print(Object msg){
		System.out.print(msg);
	}
	static Scanner scanner = new Scanner(System.in);
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		// expression = combo of operand + operator
		// operant = values, variables,numbers,quantity
		//operator = + - * / %
		print("Your goto calci!!!\n");
		double x = Double.parseDouble(input("Enter Your First Number: "));
		double y = Double.parseDouble(input("Enter Your Second Number: "));
		print("Here are all the possible results: ");
		print("\nX + Y = " + (x+y));
		print("\nX - Y = " + (x-y));
		print("\nX * Y = " + (x*y));
		print("\nX / Y = " + (x/y));
		print("\nX % Y = " + (x%y));
		print("\nX++ = " + (x++));
		print("\n++X = " + (++x));
		print("\nX-- = " + (x--));
		print("\n--X = " + (--x));
		
	}
}