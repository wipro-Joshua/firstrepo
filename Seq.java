import java.util.Scanner;

public class Seq {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your numbers");

		int input1 = in.nextInt();

		int[] arr = new int[input1];

		for (int i = 0; i < input1; i++) {
			arr[i] = in.nextInt();
			System.out.println("Your numbers are: " + arr[i]);
		}

		int count = 1;
		int max = 1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= arr[i - 1]) {
				count++;
			} else {
				count = 1;
			}
			if (count > max) {
				max = count;
			}
		}

		System.out.println(max);

	}
}