package testpackage1;

public class StringsImmutable {
	public static String RTest(String st) {
		StringBuilder stringtest = new StringBuilder(st);
		stringtest.reverse();
		return stringtest.toString();
		
	} 

	public static void main(String[] args) {
		String str1 = "String 1";
		System.out.println(str1.concat(" and 2"));
		System.out.println(str1);
		
		String new1 = RTest("Priyanka Galgate");
		System.out.println(new1);

	}

}
