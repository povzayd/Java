import java.util.Scanner ; 
public class StringUpperCase{
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
		print(name.toUpperCase()+"\n");
		print(name.toLowerCase()+"\n");
	}
}