package testpackage1;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = scan.nextLine();

		for (int i = 0; i <= str.length(); i++) {
			for(int j=0; j<i;j++) {
			System.out.print(str.charAt(j));
			}
			System.out.println();		
		}

		scan.close();
	}

}
