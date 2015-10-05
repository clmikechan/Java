package Ch06;

import java.util.Scanner;

public class Ch06_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,bean=0;
		double avg=0;
		System.out.println("Enter something:");
		String x=scan.nextLine();
		
		x=x.toLowerCase();
		int q = x.indexOf("quit");
		System.out.println(x);
		while(q ==-1){
			x=x.trim();		
			while(x.indexOf(' ') != -1){
				int space=x.indexOf(" ");	//讀出第一個空白處
				String number=x.substring(0,space);		//讀出space第一個空白之前的東西number
				int xx=Integer.parseInt(number);	//把第一個空白之前的東西變數字xx
				sum +=xx;	//把xx放入撲滿
				if(xx>max)max=xx;	//比較xx和最大數
				if(xx<min)min=xx;	//比較xx和最小數
				++bean;		//豆子數多1
				x=x.substring(space);	//讀出第一個空白之後的東西
				x=x.trim();
			}
			int xx=Integer.parseInt(x);	//把第一個空白之前的東西變數字xx
			sum +=xx;	//把xx放入撲滿
			if(xx>max)max=xx;	//比較xx和最大數
			if(xx<min)min=xx;	//比較xx和最小數
			++bean;		//豆子數多1
			avg=(double)(sum)/bean;
			System.out.println("The Sum is "+sum+", the max is "+max+", the min is "+min+", there are "+bean+" numbers, and the average is "+avg+".");
			
			
			System.out.println();
			sum=0;max=Integer.MIN_VALUE;min=Integer.MAX_VALUE;bean=0;
			System.out.println("Enter something:");			
			x=scan.nextLine(); 
			x=x.toLowerCase();
			q = x.indexOf("quit");
			System.out.println(x);
		}

	}

}
