package ArrayPrograms;

public class DuplicateElementsOfArray {

	public static void main(String[] args) {
		
		int[] arr= new int[] {2,5,3,2,7,3,8,8};
		
		System.out.println("Duplicate elements in given array:");
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]== arr[j]) {
					
					System.out.println(arr[j]);
				}
			}
		}
		
		

	}

}
