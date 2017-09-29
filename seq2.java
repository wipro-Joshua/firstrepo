import java.util.HashSet;


public class seq2 {

	public static void main(String[] args) {

		int [] nums = {4,7,5,1,2,3,30};
		
		int len = longSeq(nums);
		System.out.println("Longest Seq is: " + len);
		
	}
		
	static int longSeq (int arr []) {
			
			HashSet<Integer> set = new HashSet<Integer>();
			int maxLen = 0;
			
			
			for (int i = 0; i < arr.length; ++i)
				set.add(arr[i]);
			
			
			for (int i = 0; i < arr.length; ++i){
				int num = arr[i];
				if(!set.contains(num - i)){
					int j = num;
					while(set.contains(j)){
						j++;
					}
					if(maxLen < j - num){
				       maxLen = j - num;
					}
				}
				
			}
			return maxLen;
			
			
		}
		
		


	}


