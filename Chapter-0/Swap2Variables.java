public class Swap2Variables{
	static void print(Object msg){
		System.out.println(msg);
	}
	public static void main(String[] args){
		String x = "Water";
		String y = "Milk";
		String z;
		print("X holds: " + x);
		print("Y holds: " + y);
		
		// Swapping
		z = x ;
		x = y;
		y = z;
		// Output
		print("X holds: " + x);
		print("Y holds: " + y);
		print("Z holds: "+ z);
	}
}