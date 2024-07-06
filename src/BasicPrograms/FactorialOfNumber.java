package BasicPrograms;

public class FactorialOfNumber {
	
	static int factorial(int n) {
		
		if (n==0) {
			return 1;
		}
		else {
			return (n*factorial(n-1));
		}
		
	}

	public static void main(String[] args) {
		
		//Using for loop
		
		//int num=5, fact=1;
		//for(int i=1; i<=num; i++) {
			//fact=fact*i;
		//}		
		//System.out.println(fact);
		
		int num= 4, fact=1;
		fact= factorial(num);
		System.out.println(fact);
	}

}
