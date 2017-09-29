import java.util.Scanner;


public class Assgn7 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		
		int a;
		int b;
		int flag = 0, i, j;
		
		
		System.out.println("Enter First num");
		a = scanner.nextInt();
		
		System.out.println("Enter Second num");
		b= scanner.nextInt();
		
		System.out.println("The prime numbers between " + a + " and " + b + " are ");
		if(a < b){			
			for( i= a; i<=b; i++){
				for( j= 2; j<i; j++){
					if(i%j ==0 ){
						flag = 0;
						break;
				}
					else{
						flag =1;
					}
		   
			}
				if(flag == 1){
					System.out.println(i);
				}
		}
    }
}
}