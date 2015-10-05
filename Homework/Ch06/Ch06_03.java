package Ch06;

import java.util.Arrays;
import java.util.Scanner;

public class Ch06_03 {

	public static void main(String[] args) {
		int n=1, max=Integer.MAX_VALUE,min=Integer.MIN_VALUE;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many numbers do you want?");
		n=scan.nextInt();
		while(n<=0){
			System.out.println("Error: The number must greater than 0.");
			System.out.println("How many numbers do you want?");
			n=scan.nextInt();
		}
		
		System.out.println("What is the maximum numbers do you want?");
		max=scan.nextInt();
		System.out.println("What is the minimum numbers do you want?");
		min=scan.nextInt();
		while(min >= max ){
			System.out.println("Error: You should enter a number smaller than"+ max+".");
			System.out.println("What is the minimum numbers do you want?");
			min=scan.nextInt();
		}
		Third sort = new Third();
		int[] arr= new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*(max-min))+min;
		}
		System.out.println(Arrays.toString(sort.mySort(arr)));
	}

}

class Third{
	 int n;
	 int[] arrayInt = new int[n];
	 int[] mySort(int[] arrayInt){
		 Arrays.sort(arrayInt);
		 return arrayInt;
	 }
}