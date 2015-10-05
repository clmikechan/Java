package Ch06;

import java.util.Arrays;

public class Ch06_04 {

	public static void main(String[] args) {
		Fouth lucky = new Fouth();
		lucky.luckyNumbers();
		System.out.print(Arrays.toString(lucky.luckyNumber));
	}
}
class Fouth{
	 int[] luckyNumber=new int[6];
	 int[] luckyNumbers(){
		 for(int i=0;i<luckyNumber.length;i++){
			 luckyNumber[i]=(int)(Math.random()*42)+1;
		 }
		 return luckyNumber;
	 }
}