package Ch06;

import java.util.Scanner;

public class Ch06_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int width=1,height=1;
		System.out.println("What is the width you want?");
		width=scan.nextInt();
		while(width<=0){
			System.out.println("Error: The width must greater than 0");
			System.out.println("What is the height you want?");
			width=scan.nextInt();
		}
		
		System.out.println("What is the height you want?");
		height=scan.nextInt();
		while(height<=0){
			System.out.println("Error: The height must greater than 0.");
			System.out.println("What is the height you want?");
			height=scan.nextInt();
		}
		
		
		First star = new First();
		star.starSquare(width,height);
	}

}

class First{
	 void starSquare(int width, int height){
			for(int j=1;j<=height;j++){
			for(int i=1;i<= width;i++){
				System.out.print("*");
			}System.out.println();}
		}
}