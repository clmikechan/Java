package Ch04;

public class Ch04_01 {
	public static void main(String[] args) {
int n=0, sum=0;	//定義變數
		
		for (int i=1;i<=10;i++){
			n=(int)(Math.random()*100)+1;
			sum += n;
			System.out.println("The random number #"+i+" is "+n);
		}	//創造五組介於1到100間的隨機整數並加總
		System.out.println("The sum of these random numbers is "+sum+", and the average is "+(float)(sum)/10+". However, if one just consider the average in int, the value is "+sum/10+".");	//輸出結果
	}
}
