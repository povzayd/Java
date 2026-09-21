import java.util.Scanner ; 
public class Switch{
	static Scanner scanner = new Scanner(System.in);
	static void print(Object msg){
		System.out.print(msg);
	}
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		String day = "Monday";
		switch(day){
			case "Sunday": print("Today is " + day);
			break;
			case "Monday": print("Today is " + day);
			break;
			case "Tuesday": print("Today is " + day);
			break;
			case "Wednesday": print("Today is " + day);
			break;
			case "Thursday": print("Today is " + day);
			break;
			case "Friday": print("Today is " + day);
			break;
		    case "Saturday": print("Today is " + day);
			break;
			default: print("Invalid Day!");
		}
	}
}