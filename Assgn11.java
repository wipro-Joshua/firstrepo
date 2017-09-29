public class Assgn11 {

	public static void main(String[] args) {

		int counter = 0;

		for (int i = 0; i <= 1000; i++) {

			if ((i % 2 == 0) && (i % 3 == 0) && (i % 5 == 0)) {
				counter++;
				System.out.println(i);
			}

			if (counter == 5) {
				break;
			}
		}

	}

}
