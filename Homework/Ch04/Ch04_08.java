package Ch04;

public class Ch04_08 {

	public static void main(String[] args) {
		for(int i=1; i<=7;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}	//j決定一行要輸出幾個*
			System.out.println();	//把不同行資料分開
		}	//i決定一共有幾行
	}

}
