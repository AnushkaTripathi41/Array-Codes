package BasicPrograms;

public class FibonacciDemo {
	
	static int n1=0, n2=1, n3;
	
	//Using recursion
	static void printFibonacci(int count) {
		
		if(count>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		
		System.out.print(" "+n3);
		printFibonacci(count-1);
		
		}
		
	}

	public static void main(String[] args) {
		
		int count=10;
		
		System.out.print(n1+" "+n2);
		
		printFibonacci(count-2);
		
		
		/*int n1=0, n2=1, n3, count=10;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2; i<count; i++) {
			
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}*/
		

	}

}
