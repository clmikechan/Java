package Ch03;
import java.util.Scanner;
public class Ch03_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number1=0;
		int number2=1;
		System.out.println("輸入第一個整數");  //非交換運算兩個數先後順序有區別，在此輸入第一個數
		if(scan.hasNextInt()){
			number1=scan.nextInt();
		}
		
		System.out.println("輸入第二個整數，此數字不得為0");  //非交換運算兩個數先後順序有區別，在此輸入第二個數
		if(scan.hasNextInt()){
			number2=scan.nextInt();
		}
		System.out.println(number1+"+"+number2 +"="+(number1+number2));  //兩個數相加的和
		System.out.println(number1+"-"+number2 +"="+(number1-number2));  //兩個數相減的差
		System.out.println(number1+"*"+number2 +"="+(number1*number2));  //兩個數相乘的積
		if(number2==0){
			System.out.println("除數為零，故無法計算第一數除以第二數之商以及餘數");  //除數為零，故無法計算第一數除以第二數之商以及餘數
		}else{
			System.out.println(number1+"/"+number2 +"="+(number1/number2)+"...餘"+(number1%number2));  //第一個數除以第二個數的商數及餘數
		}
	}

}
