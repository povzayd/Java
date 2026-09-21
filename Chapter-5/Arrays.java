import java.util.Scanner ; 
public class Arrays{
	static Scanner scanner = new Scanner(System.in);
	static void print(Object msg){
		System.out.print(msg);
	}
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		String[] cars = {"Audi", "BMW", "KIA", "FORD"};
		for(int i =0; i<cars.length; i++){
			print(cars[i]+"\n");
		}
	}
}