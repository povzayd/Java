import java.util.Scanner ; 
public class NestedLoops{
	static Scanner scanner = new Scanner(System.in);
	static void print(Object msg){
		System.out.print(msg);
	}
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		int rows;
		int columns;
		String symbol = "";
		rows = Integer.parseInt(input("Enter Number Of Rows: "));
		columns = Integer.parseInt(input("Enter Number Of Columns: "));
		symbol = input("Enter the symbol: ");
		for(int i =1; i<= rows; i++){
			print("\n");
			for(int j = 1; j<=columns; j++){
				print(symbol);
			}
		}
	}
}