import java.util.Scanner;


public class Assgn3 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		
		String a;
		String b;
		String fWord;
		
		
		System.out.println("Enter First Word");
		a = scanner.nextLine();
		
		System.out.println("Enter Second word");
		b= scanner.nextLine();
		
		
		fWord = a+b;
		
		if(a.equals(b))
		{
			System.out.println("These words are Identical");
		}
		else 
		{
			System.out.println(fWord + " " + "These are not Identical");
		}
	}

}
