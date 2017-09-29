import java.util.Arrays;


public class Assgn13 {

	public static void main(String[] args) {
		
		int[] intArray =  {5, 6, 7, 8, 9, 30000, 11, 12, 13, 14};
 
		int min = Arrays.stream(intArray).min().getAsInt();
		int max = Arrays.stream(intArray).max().getAsInt();
				
		
		System.out.println(" Min = " + min);
		System.out.println(" Max = " + max);
		
	}

}
