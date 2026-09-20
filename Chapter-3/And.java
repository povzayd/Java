import java.util.Scanner ; 
public class And{
	static Scanner scanner = new Scanner(System.in);
	static void print(Object msg){
		System.out.print(msg);
	}
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		int x = 10;
		int y = 23;
		if(x>0 && y>0){
			print("True");
		}
		else{
			print("False");
		}
	}
}