import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Assgn16 {

	public static void main(String[] args) {
		
		int [] intArray = {3,4,5,6,7,8,3,9,9,5,5};
		//System.out.println(Arrays.toString(intArray));
	
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : intArray){
			Integer count = map.get(i);
			map.put(i, count != null ? count+1 : 0);
		}
		
		Integer highest = Collections.max(map.entrySet(), new Comparator<Map.Entry<Integer, Integer>>(){
			
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2){
				return o1.getValue().compareTo(o2.getValue());
			}
		}).getKey();
		
		System.out.println(highest);
	}

}
