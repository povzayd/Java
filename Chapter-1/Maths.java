import java.util.Scanner;
public class Maths{
	static void print(Object msg){
		System.out.print(msg);
	}
	static Scanner scanner = new Scanner(System.in);
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		double x  = 3.14;
		double y = -10;
		print(Math.max(x,y)+"\n");
		print(Math.min(x,y)+"\n");
		print(Math.abs(y)+"\n");
		print(Math.sqrt(x)+"\n");
		print(Math.round(x)+"\n");
		print(Math.ceil(x)+"\n");
		print(Math.floor(x)+"\n");
	}
}