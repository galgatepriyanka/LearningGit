package testpackage1;

public class ReverseString {
	
	public static String reverseString(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	}  

	public static void main(String[] args) {
		//System.out.println(StringFormatter.reverseString(""));
		System.out.println(ReverseString.reverseString("This is a test")); 			   
	}
}