package Ch04;

public class Ch04_09 {

	public static void main(String[] args) {
		for(int i=1; i<=7;i++){
			for(int j=7;j>=i;j--){
				System.out.print("*");
			}	//j決定一行有幾個*，遞減所以改成由大到小計算
			System.out.println();
		}	//i決定一共有幾行
	}

}
