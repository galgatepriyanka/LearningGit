package testpackage1;

public class ArrayOperations {

	public static void main(String[] args) {
		String[] Sarray = new String[5];
		Sarray[0] = "This";
		Sarray[1] = "is";
		Sarray[2] = "a";
		Sarray[3] = "testing";
		Sarray[4] = "Hurray";
		//Sarray[5] = "This"; Gives error Index out of bounds exception
		
		for(int i=0;i<Sarray.length;i++) {
			System.out.print(" " + Sarray[i]);
		}
	}

}
