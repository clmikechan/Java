package Ch04;

public class Ch04_03 {

	public static void main(String[] args) {
		long prod=1L;	//定義變數
		for(long i=1L;i<=10;i++){
			prod *=i;
		}	//用for迴圈計算10階乘數
		System.out.println("for迴圈: The factorial of 10 is "+ prod+".");	//輸出結果	
		System.out.println("");

		prod=1L;	//歸零變數
		long i=1L;	//定義變數
		while(i<=10){
			prod *=i;
			i++;
		}	//用while迴圈計算10階乘數
		System.out.println("while迴圈: The factorial of 10 is "+ prod+".");	//輸出結果
	}

}
