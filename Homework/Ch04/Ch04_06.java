package Ch04;

public class Ch04_06 {

	public static void main(String[] args) {
		for (int i=1; i<=10;i++){
			for(int j=1;j<=10;j++){
				System.out.print((i*j>=10)&&(i*j<100)?(" "+i*j+"   "):(i*j<10?"  "+i*j+"   ":i*j+"   "));	//��?:�Ӷi��ƪ�
			}	//j�ܼƨM�w�@���X�X�ո��
			System.out.println();
		}	//i�ܼƨM�w�@�@���X�ո��
	}

}
