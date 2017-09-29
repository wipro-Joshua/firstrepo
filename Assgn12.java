import java.util.Scanner;

public class Assgn12 {

	public static void main(String[] args) {

		double a;
		double b;
		boolean yn = true;

		String operation;
		String carryon;

		while (yn) {
			Scanner op = new Scanner(System.in);

			System.out.println("Choose operation \n 1 : Add  \n 2 : Substract");
			operation = op.next();

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter first number");
			a = scanner.nextDouble();

			System.out.println("Enter Second number");
			b = scanner.nextDouble();

			switch (operation) {
			case "Add":
				System.out.println(a + b);
				break;
			case "Substract":
				System.out.println(a - b);
				break;
			default:
				System.out.println("Please Choose Operation");
				break;
			}
		

			Scanner co = new Scanner(System.in);

			System.out.println("Do you want to continue? 'Yes' or 'No'");
			carryon = co.next();

			switch (carryon) {
			case "Y":
				yn = true;
				break;
			case "y":
				yn = true;
				break;
			case "N":
				yn = false;
				break;
			case "n":
				yn = false;
				break;
			default:
				System.out.println(" Y for 'Yes' and N for 'No' ");
				break;
			}
			
		}

		if (yn == false){
			System.out.println(" Thank you for playing... Peace Out");
		}
		
		

	}
}
