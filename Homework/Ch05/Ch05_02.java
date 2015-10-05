package Ch05;

import java.util.Arrays;

public class Ch05_02 {

	public static void main(String[] args) {
		System.out.println("方法壹");
		int[]a= new int[6];
		int d;
		for(int i=0;i<a.length;i++){
			d=(int)(Math.random()*42)+1;
			int j=0;
			while(d==a[0]||d==a[1]||d==a[2]||d==a[3]||d==a[4]||d==a[5]){
				d=(int)(Math.random()*42)+1;
			}
			a[i]=d;
		}
		System.out.println("The 6 numbers are: "+Arrays.toString(a)+",");
		Arrays.sort(a);
		System.out.println("If one rearrange them from the smallest to the largest, which is: "+Arrays.toString(a)+".");
		System.out.println("");

		System.out.println("方法貳");	//我想到的是另一種方法，就是所有的位置只會有0或1，然後當總和等於6時，代表取了六個相異整數。
		System.out.print("The 6 numbers are: "); 
		int[] b = new int[43];
					
		d=0;
		int sum=0;

		while(sum<6){
			d=(int)(Math.random()*42)+1;
			if(b[d]==0){System.out.print(d+" ");}
			b[d]= b[d] == 0 ? ++b[d] : b[d];
			sum=0;
			for(int i=0; i<b.length; i++){	
				sum +=b[i];
			}			
		}
		System.out.println("");
		System.out.print("If one rearrange them from the smallest to the largest, which is: "); 
		for(int i=1; i<b.length;i++){
			if(b[i]!=0){
				System.out.print(i+" ");
			}
		}
	}

}
