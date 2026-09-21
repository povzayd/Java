import java.util.Scanner ; 
public class While{
	static Scanner scanner = new Scanner(System.in);
	static void print(Object msg){
		System.out.print(msg);
	}
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		String name = "";
		while(name.isBlank()){
			name = input("Enter Your Name: ");
		}
		print("Hello, "+name);
	}
}