package Ch06;

import java.util.Scanner;

public class Ch06_02 {
	public static void main(String[] args) {
		Second fac = new Second();
		int n=1;
Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the number you want to calculate the factorial?");
		n=scan.nextInt();
		while(n<0){
			System.out.println("Exception: This program can only calculate the factorial of nonnegative integer, sorry.");
			System.out.println("What is the number you want to calculate the factorial?");
			n=scan.nextInt();
		}
		System.out.println("The factorial of "+n+" is "+fac.factorial(n)+".");
	}
}

class Second{
	 long factorial(int n){
		 long sum=1;
		 for(int i=1;i<=n;i++){
			 sum *= i;
		 }
		 return sum;
	 }
	 
}