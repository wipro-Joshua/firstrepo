
public class ReverseString {

	public static void main(String[] args) {
		String string1 = args[0];
		String string2 = args[1];
		
		int stringLenght = string2.length() - 1;
		String newString = "";
		
		for(int i = stringLenght; i>= 0; i--)
		{
			newString +=string2.charAt(stringLenght);
			stringLenght--;
		}
		
		System.out.println(string1 + " " + newString);

	}

}
