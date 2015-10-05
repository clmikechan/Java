package Ch03;
import java.util.Scanner;
public class Ch03_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1="";  //定義第一個字串代號為s1
		String s2="";  //定義第二個字串代號為s2
		String s3="";  //定義第三個字串代號為s3
		
		System.out.println("輸入三個字串  以空白鍵隔開");  //輸入三個字串
		if(scan.hasNext()){
			s1=scan.next();
		}
		
		if(scan.hasNext()){
			s2=scan.next();
		}
		
		if(scan.hasNext()){
			s3=scan.next();
		}
		
		int l1=s1.length();  //第一個字串長度為l1
		int l2=s2.length();  //第二個字串長度為l2
		int l3=s3.length();  //第三個字串長度為l3

		System.out.println("第一個字串長度為"+l1+"，第二個字串長度為"+l2+"，第三個字串長度為"+l3);  //顯示三個字串的長度
	}

}
