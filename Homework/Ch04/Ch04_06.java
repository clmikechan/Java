package Ch04;

public class Ch04_06 {

	public static void main(String[] args) {
		for (int i=1; i<=10;i++){
			for(int j=1;j<=10;j++){
				System.out.print((i*j>=10)&&(i*j<100)?(" "+i*j+"   "):(i*j<10?"  "+i*j+"   ":i*j+"   "));	//用?:來進行排版
			}	//j變數決定一行輸出幾組資料
			System.out.println();
		}	//i變數決定一共有幾組資料
	}

}
