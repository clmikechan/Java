package Ch04;

public class Ch04_03 {

	public static void main(String[] args) {
		long prod=1L;	//�w�q�ܼ�
		for(long i=1L;i<=10;i++){
			prod *=i;
		}	//��for�j��p��10������
		System.out.println("for�j��: The factorial of 10 is "+ prod+".");	//��X���G	
		System.out.println("");

		prod=1L;	//�k�s�ܼ�
		long i=1L;	//�w�q�ܼ�
		while(i<=10){
			prod *=i;
			i++;
		}	//��while�j��p��10������
		System.out.println("while�j��: The factorial of 10 is "+ prod+".");	//��X���G
	}

}
