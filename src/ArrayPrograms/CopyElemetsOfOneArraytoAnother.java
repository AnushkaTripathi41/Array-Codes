package ArrayPrograms;

public class CopyElemetsOfOneArraytoAnother {

	public static void main(String[] args) {
		
		//initialize array
		int[] arr1= new int[] {1,2,3,4,5};
		
		int[] arr2= new int[arr1.length];
		
		//Copying all elements of one array to another
		for(int i=0; i<arr1.length; i++) {
			arr2[i]= arr1[i];
		}
		
		//print original array
		System.out.println("Elements of Original Array: ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		
		//print second array
		System.out.println("Elements of Second Array: ");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
