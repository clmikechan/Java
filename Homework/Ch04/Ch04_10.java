package Ch04;

public class Ch04_10 {

	public static void main(String[] args) {
		String s="ABCDEF";	//�w�q�r��ABCDEF�A����A��s10.charAt()�ӨM�w���X���@�Ӧr��	
		for(int i=0;i<s.length();i++){	//s10.charAt()��0�}�l�p�ơA�G����]�w����0��s10.length-1
			for(int j=0;j<=i;j++){
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}
	}

}
