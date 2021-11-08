package testpackage1;

public class ArraySort {

	public static void main(String[] args) {
		int array1[] = { 2, 6, 1, 10, 3 };
		int length = array1.length;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array1[i] < array1[j]) {
					int temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}
		}
		for(int i=0;i<length;i++) {
			System.out.println(array1[i]);
		}
		
	}

}
