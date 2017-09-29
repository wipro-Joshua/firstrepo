import java.util.Scanner;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		int sum;
		
		System.out.println("Enter First num");
		a = scanner.nextInt();
		
		System.out.println("Enter Second num");
		b = scanner.nextInt();
		
		
		sum = a + b;
		System.out.println("The Sum of " + a + " and " + b + " = " + sum);
		

	}

}
