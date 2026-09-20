import java.util.Scanner ; 
public class If{
	static Scanner scanner = new Scanner(System.in);
	static void print(Object msg){
		System.out.print(msg);
	}
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		int age =18;
		if(age>=18){
			print("Eligible");
		}
		else{
			print("Not Eligible");
		}		
	}
}