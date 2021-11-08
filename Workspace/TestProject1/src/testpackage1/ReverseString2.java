package testpackage1;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String to reverse : ");
		String rev = scan.nextLine();

		for (int i = rev.length()-1; i >= 0; i--) {
			System.out.print(rev.charAt(i));
		}

	}

}
