import java.util.Scanner;


public class Assgn6 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		
		int a;
		int b;
		int evenNums;
		
		
		System.out.println("Enter First num");
		a = scanner.nextInt();
		
		System.out.println("Enter Second num");
		b= scanner.nextInt();
		
		if(a < b){			
			for(int i= a; i<b; i++){
				if(i%2 ==0 ){
					System.out.println(i);
					
				}
			}
			
			
		}
		else {
			for(int i= b; i<a; i++){
				if(i%2 ==0 ){
					System.out.println(i);
		}
		
		
	}
			
		}
	}
}
