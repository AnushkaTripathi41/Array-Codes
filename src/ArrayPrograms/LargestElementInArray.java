package ArrayPrograms;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		int[] arr= new int[] {45, 6, 17, 67, 32, 9};
		int max=arr[0];
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
		}
		System.out.println("Largest element in Array is: "+max);
		

	}

}
