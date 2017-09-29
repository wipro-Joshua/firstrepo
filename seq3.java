
public class seq3 {
	
	public static void main (String [] args){
		
		int[] nums = {1,2,4,6,8, 9};
		int len = longSeq(nums);
		System.out.println("The longest seqeunce is: " + len);
		
	}
	
	public static int longSeq (int [] seq){
		
		int[] L = new int [seq.length];
		L[0] = 1;
		
		for(int i =1; i<L.length; i++){
			int maxn = 0;
			
			for(int j=0; j<i; j++){
				if(seq[j] < seq[i] && L[j] > maxn){
					maxn = L[j];
				}
			}
			
			L[i]= maxn+1;
			
			
		}
		int maxi = 0;
		for(int i = 0; i < L.length; i++){
			if(L[i]> maxi){
				maxi = L[i];
			}
		}
		
		return maxi;
	}
	
	

}
