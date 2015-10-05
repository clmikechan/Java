package Ch04;

public class Ch04_05 {

	public static void main(String[] args) {
		for(int i=10;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j+"\t");
			}	//j變數決定一行輸出幾組數字
			System.out.println();
		}	//i變數決定輸出幾行資料
	}

}
