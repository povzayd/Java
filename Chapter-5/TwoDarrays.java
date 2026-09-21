import java.util.Scanner ; 
public class TwoDarrays{
	static Scanner scanner = new Scanner(System.in);
	static void print(Object msg){
		System.out.print(msg);
	}
	static String input(String prompt){
		print(prompt);
		return scanner.nextLine().trim();
	}
	public static void main(String[] args){
		String[][] cars = {
			{"Defender","Autobiography","Velar"},
			{"KTM","Ninja","H2R"},
			{"G63","Fortuner","Hector"}
		};
		for(int i=0; i<cars.length; i++){
			print("");
			for(int j=0; j<cars[i].length; j++){
				print(cars[i][j]+"\n");
			} 
		}
	}
}