package testpackage1;

import java.util.Scanner;

public class StringSegregate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println("Character " + i + ": "+ str.charAt(i));
		}
		

	}

}
