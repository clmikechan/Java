package Ch04;

public class Ch04_02 {

	public static void main(String[] args) {
		int sum=0;	//�w�q�ܼ�
		for(int i=0;i<=1000;i++){
			if(i%2==0){
				sum +=i;
			}
		}	//�[�`�Ҧ�������
		System.out.println("The sum of postive even numbers no greater than 1000 is "+sum+".");	//��X���G
	}

}
