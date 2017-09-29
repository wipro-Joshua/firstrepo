import java.util.Scanner;


public class Asgn1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String a;
		String b;
		String fWord;
		
		
		System.out.println("Enter First Word");
		a = scanner.nextLine();
		
		System.out.println("Enter Second word");
		b= scanner.nextLine();
		
		
		fWord= a + b;
		
		System.out.println(fWord);

	}

}
