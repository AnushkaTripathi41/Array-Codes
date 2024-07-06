package DemoCode;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		//int a=10;
		//int b=20;
		
		//int sum=a+b;
		
		//System.out.println("The sum is: "+sum);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=sc.nextInt();
		
		System.out.print("Enter second number: ");
		int b=sc.nextInt();
		
		int sum=a+b;
		
		System.out.println("The sum is: "+sum);

	}

}
