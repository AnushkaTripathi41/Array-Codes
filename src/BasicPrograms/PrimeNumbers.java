package BasicPrograms;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int n=7, temp=0;
		
		for(int i=2; i<n-1; i++) {
			if(n%i==0) {
				temp=temp+1;
			}
		}
		
		if(temp==0) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a prime number");
		}	

	}

}
