package Ch04;

public class Ch04_10 {

	public static void main(String[] args) {
		String s="ABCDEF";	//定義字串ABCDEF，之後再用s10.charAt()來決定應出哪一個字元	
		for(int i=0;i<s.length();i++){	//s10.charAt()由0開始計數，故條件設定應為0至s10.length-1
			for(int j=0;j<=i;j++){
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}
	}

}
