
public class Assgn8 {

	public static void main(String[] args) {
		
		String gender = args[0];
		int age = Integer.parseInt(args[1]);
		
		
		if(gender.equals("Female") && age >=1 && age <=58); {
			System.out.println("The Interest rate is 8.2%");
			
		}
		if(gender.equals("Female") && age >=59 && age <=120){
			System.out.println("The Interest rate is 7.6%");
		}
		if(gender.equals("male") && age >=1 && age <=58){
			System.out.println("The Interest rate is 9.2%");
		}
		else if(gender.equals("male") && age >=59 && age <=120){
			System.out.println("The Interest rate is 8.3%");
			
		}

	}

}
