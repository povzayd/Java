import java.util.Scanner ; 
public class Not{
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
		if(10!=x){
			print("QWERTYUIOP");
		}
		else{
			print("ASDFGHJKL");
		}

	}
}