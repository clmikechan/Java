package Ch03;
import java.util.Scanner;
public class Ch03_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1="";  //�w�q�Ĥ@�Ӧr��N����s1
		String s2="";  //�w�q�ĤG�Ӧr��N����s2
		String s3="";  //�w�q�ĤT�Ӧr��N����s3
		
		System.out.println("��J�T�Ӧr��  �H�ť���j�}");  //��J�T�Ӧr��
		if(scan.hasNext()){
			s1=scan.next();
		}
		
		if(scan.hasNext()){
			s2=scan.next();
		}
		
		if(scan.hasNext()){
			s3=scan.next();
		}
		
		int l1=s1.length();  //�Ĥ@�Ӧr����׬�l1
		int l2=s2.length();  //�ĤG�Ӧr����׬�l2
		int l3=s3.length();  //�ĤT�Ӧr����׬�l3

		System.out.println("�Ĥ@�Ӧr����׬�"+l1+"�A�ĤG�Ӧr����׬�"+l2+"�A�ĤT�Ӧr����׬�"+l3);  //��ܤT�Ӧr�ꪺ����
	}

}
