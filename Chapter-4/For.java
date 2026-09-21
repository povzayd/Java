import java.util.Scanner ; 
public class For{
	static Scanner scanner = new Scanner(System.in);
	static void print(Object msg){
		System.out.print(msg);
	}
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		int x = 0;
		for(int i=0; i <= 20; i++){
			print(i+"\n");
		}
		for(int i=20; i >= 0; i--){
			print(i+"\n");
		}
	}
}