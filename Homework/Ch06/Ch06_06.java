package Ch06;

import java.util.Scanner;

public class Ch06_06 {

	public static void main(String[] args) {
		Sixth uni=new Sixth();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter something");
		String x=scan.nextLine();
		System.out.println("The String ("+x+") is:");
		System.out.println(uni.toUnicodeString(x));

	}

}
class Sixth{
	 String s="";
	 public String toUnicodeString(String s){
		 for(int i=0;i<s.length();i++){
			 int l=(int)(s.charAt(i));
			 if(l>=Math.pow(16, 3)){this.s +="\\u"+Integer.toHexString((int)(s.charAt(i)))+" ";
			 }else if(l>=Math.pow(16, 2)){this.s +="\\u0"+Integer.toHexString((int)(s.charAt(i)))+" ";
			 }else if(l>=Math.pow(16, 1)){this.s +="\\u00"+Integer.toHexString((int)(s.charAt(i)))+" ";
			 }else{this.s +="\\u000"+Integer.toHexString((int)(s.charAt(i)))+" ";
			 }
		 }return this.s;
	 }
}