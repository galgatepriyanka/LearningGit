package testpackage1;

public class stringTest {
	
	public static void main(String[] args) {
		
		String s1 = "Priyanka ";
		String s2 = "Welcome ";
		System.out.println(s1);
		//System.out.println(s2 + "**");
		//System.out.println(s1.charAt(3)); //prints value at the 3rd index
		//System.out.println(s1.compareTo(s1)); 
		//System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println("Length is " + s1.length());
		System.out.println("Checking if 2 strings are equal : " + s1.equals(s2));
		
		//comparing 2 different strings
		if(s1.equalsIgnoreCase(s2)) 
		{
		System.out.println("Strings are Equal");	
		}
		else
		{System.out.println("Strings are Not equal");}
		
		//Joining 2 strings
		System.out.println("Joining 2 strings : " + s2.concat(s1));
		
		//Escape characters
		System.out.println("This is a \"escape\" character");
		
		s1 = s1.concat("Galgate");
		System.out.println(s1);
		
		//Creating string via String class
		String s3 = new String("Java");
		System.out.println(s3);
		
		//convert char to String
		Character ch = 'P';
		s1 = Character.toString(ch);
		System.out.println(s1.concat("-riyanka"));
		
		//Another way
		s1 = s1.valueOf(ch);
		System.out.println(s1);
	}

}
