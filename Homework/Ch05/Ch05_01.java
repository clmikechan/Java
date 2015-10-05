package Ch05;

public class Ch05_01 {

	public static void main(String[] args) {
		double[] a={84.0,94,79.9,90.5,82.4,65.7,72.8,99.0,85.2,100};
		double sum=0,avg;
		
		for (double d:a){
			sum += d;
		}
		avg=sum/a.length;
		System.out.println("The average number of given numbers is "+avg+".");
		for(int i=0;i<a.length;i++){
			if(a[i]>avg){
				System.out.print(a[i]+", ");
			}
		}
		System.out.println(" are the numbers that are greater than the average.");
	}

}
