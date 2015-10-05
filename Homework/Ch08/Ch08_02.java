package Ch08;
import java.io.*;
import java.net.*;
public class Ch08_02 {
	public static void main(String[] args) {
		methodA();
		System.out.println("Program ends");
	}
	
	static void methodA(){
		try{
		int i=3/0;														//ArithmeticException
		URL urlA= new URL("http://www.seed.net.tw");					//MalformedURLException
		FileInputStream fis = new FileInputStream("C:\\Test.txt");		//FileNotFoundException
		}catch(ArithmeticException e){
			System.out.println("The denominator cannot be zero.");
		}catch(MalformedURLException e){
			System.out.println("This URL is incorrect.");
		}catch(FileNotFoundException e){System.out.println("Sorry, but this file cannot be found.");
		}
	}
}
