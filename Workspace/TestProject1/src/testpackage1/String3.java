package testpackage1;
import java.util.Scanner;
public class String3 {
	public static void main(String[] args) {
		//Finding palindrome string
		String reverseString = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to test : ");
		
		String input = scan.nextLine();
		int length = input.length();
		
		for(int i = length-1; i>= 0 ; i--) {
			reverseString = reverseString + input.charAt(i);
			
			if(input.equalsIgnoreCase(reverseString))
			{
				System.out.println("String is palindrome");
			} else
			{
				System.out.println("String is not palindrome");
			}		
		}
	}
}