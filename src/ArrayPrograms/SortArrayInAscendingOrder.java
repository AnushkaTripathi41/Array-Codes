package ArrayPrograms;

import java.util.Arrays;

public class SortArrayInAscendingOrder {

	public static void main(String[] args) {
		
		int[] array= new int[] {2,25,45,12,32,21,35};
		
		System.out.println("Elements sorted in ascending order: ");
		
		Arrays.sort(array);
		
		for(int i=0; i<array.length; i++) {
			
			System.out.println(array[i]);
		}

	}

}
