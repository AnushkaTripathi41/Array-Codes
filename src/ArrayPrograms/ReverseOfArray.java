package ArrayPrograms;

public class ReverseOfArray {

	public static void main(String[] args) {
		
		int[] arr= new int[] {3,14,8,25,32};
		
		for(int i= arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
