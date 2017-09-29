import java.util.Scanner;


public class Assign5 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		
		int a;
		
		
		System.out.println("Enter your Number");
		a = scanner.nextInt();
		
		if(a>0){
			System.out.println("This number is greater than 0 so it's a positive number");
		}
		if(a<0){
			System.out.println("This number is less than 0 so it's a negative number");
		}
		else if(a == 0){
			System.out.println("This number is 0");
			
		}
		

	}
}
