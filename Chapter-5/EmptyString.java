import java.util.Scanner ; 
public class EmptyString{
	static Scanner scanner = new Scanner(System.in);
	static void print(Object msg){
		System.out.print(msg);
	}
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		String name = "ADMIN";
		if(name.isEmpty()==true){
			print("EMPTY");
		}
		else{
			print("NOT EMPTY");
		}
	}
}