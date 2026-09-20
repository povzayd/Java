import java.util.Scanner ; 
public class OR{
	static Scanner scanner = new Scanner(System.in);
	static void print(Object msg){
		System.out.print(msg);
	}
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		if(10>3 || 20<3){
			print("QWERTYUIOP");
		}
		else{
			print("ASDFGHJKL");
		}

	}
}