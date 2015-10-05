package Ch05;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ch05_03 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		GregorianCalendar gc= new GregorianCalendar();	
		int y=0,m=0,d=0,sum=0;
		System.out.println("Please enter the year.");
		if(scan.hasNextInt()){
			y=scan.nextInt();
		}
		
		System.out.println("Please enter the month.");
		if(scan.hasNextInt()){
			m=scan.nextInt();
		}
		
		System.out.println("Please enter the day of month.");
		if(scan.hasNextInt()){
			d=scan.nextInt();
		}
		
		int []a={0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(gc.isLeapYear(y)){
			a[2]=29;
		}else{
			a[2]=28;
		}
		for(int i=0;i <m;i++){
			sum +=a[i];
		}
		sum += d;
		System.out.println("The date you enter is "+y+"/"+m+"/"+d+", which is the "+sum+"th day of the year of "+y+"." );
	}

}
