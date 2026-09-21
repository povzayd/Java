import java.util.Scanner ; 
public class StringReplace{
	static Scanner scanner = new Scanner(System.in);
	static void print(Object msg){
		System.out.print(msg);
	}
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		String name = "admin";
		print(name.replace('i','o'));
	}
}