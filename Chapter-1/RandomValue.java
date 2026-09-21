import java.util.Scanner;
import java.util.Random;
public class RandomValue{
	static Scanner scanner = new Scanner(System.in);
	static void print(Object msg){
		System.out.print(msg);
	}
	static Random random = new Random();
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		print(random.nextInt(6)+1);
	}
}