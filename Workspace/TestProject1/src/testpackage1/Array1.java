package testpackage1;

public class Array1 {

	public static void main(String[] args) {
		int i[] = new int[5];
		for(int a=0;a<5;a++)
		{
			i[a]=a;
			System.out.println(i[a]);
		}
		//int length = i.length;
		System.out.println("Length of array : " + i.length);
	}

}
