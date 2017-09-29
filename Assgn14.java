import java.util.Arrays;
import java.util.List;

public class Assgn14 {
	
	public static int searchIx (int [] array, int num) {
		
		if(array == null) return -1;
		int length = array.length;
		int i = 0;
		while (i < length) {
			if(array[i] == num) return i;
			else i= i+1;
		}
		return -1;
	}

	public static void main (String []args){
		
		int [] array = {1, 3, 5, 7, 9, 11, 13};
		System.out.println(searchIx(array, 13));
		System.out.println(searchIx(array, 25));
		
		
	}

}
