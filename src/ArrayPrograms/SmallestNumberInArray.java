package ArrayPrograms;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		
		int[] arr= new int[] {25,65,7,19,11,6};
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]< min) {
				min= arr[i];
			}
		}
		System.out.println("Smallest number in Array: "+min);

	}

}
