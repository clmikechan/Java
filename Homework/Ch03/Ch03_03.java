package Ch03;
import java.util.Scanner;
public class Ch03_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number1=0;
		int number2=1;
		System.out.println("��J�Ĥ@�Ӿ��");  //�D�洫�B���Ӽƥ��ᶶ�Ǧ��ϧO�A�b����J�Ĥ@�Ӽ�
		if(scan.hasNextInt()){
			number1=scan.nextInt();
		}
		
		System.out.println("��J�ĤG�Ӿ�ơA���Ʀr���o��0");  //�D�洫�B���Ӽƥ��ᶶ�Ǧ��ϧO�A�b����J�ĤG�Ӽ�
		if(scan.hasNextInt()){
			number2=scan.nextInt();
		}
		System.out.println(number1+"+"+number2 +"="+(number1+number2));  //��ӼƬۥ[���M
		System.out.println(number1+"-"+number2 +"="+(number1-number2));  //��ӼƬ۴�t
		System.out.println(number1+"*"+number2 +"="+(number1*number2));  //��ӼƬۭ����n
		if(number2==0){
			System.out.println("���Ƭ��s�A�G�L�k�p��Ĥ@�ư��H�ĤG�Ƥ��ӥH�ξl��");  //���Ƭ��s�A�G�L�k�p��Ĥ@�ư��H�ĤG�Ƥ��ӥH�ξl��
		}else{
			System.out.println(number1+"/"+number2 +"="+(number1/number2)+"...�l"+(number1%number2));  //�Ĥ@�Ӽư��H�ĤG�Ӽƪ��ӼƤξl��
		}
	}

}
