
public class Assgn15 {

	public static void main(String[] args) {
		
		int [] intArray = {2,3,4,5,6,6,7,7,8,2,1};
		
		
		//Print original list
		System.out.println("List of numbers: ");
		for(int i = 0; i<intArray.length; i++){
			System.out.println(intArray[i]);
		}
		
		
		//Sort List and print
		System.out.println("Sorted List");
		for(int i = 0; i<intArray.length; i++){
			
			for(int j=i; j<intArray.length; j++){
				
				if(intArray[i] > intArray[j]){
					
					int temp= intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		
		
		//Sorted List- Remove Duplicates
		for(int i = 0; i<intArray.length; i++){
			System.out.println(intArray[i]);
		}
		
		System.out.println("After Duplicates Removed: ");
		int b=0;
		intArray[b] = intArray[0];
		for(int i = 0; i <intArray.length; i++){
			
			if(intArray[b]!=intArray[i]){
				b++;
				intArray[b] = intArray[i];
				
				
			}
		}
		
		for(int i = 0; i <=b; i++){
			
			System.out.println(intArray[i]);
		}
		

	}

}
