package Ch06;

import java.util.Scanner;

public class Ch06_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,bean=0;
		double avg=0;
		System.out.println("Enter something:");
		String x=scan.nextLine();
		
		x=x.toLowerCase();
		int q = x.indexOf("quit");
		System.out.println(x);
		while(q ==-1){
			x=x.trim();		
			while(x.indexOf(' ') != -1){
				int space=x.indexOf(" ");	//Ū�X�Ĥ@�ӪťճB
				String number=x.substring(0,space);		//Ū�Xspace�Ĥ@�Ӫťդ��e���F��number
				int xx=Integer.parseInt(number);	//��Ĥ@�Ӫťդ��e���F���ܼƦrxx
				sum +=xx;	//��xx��J����
				if(xx>max)max=xx;	//���xx�M�̤j��
				if(xx<min)min=xx;	//���xx�M�̤p��
				++bean;		//���l�Ʀh1
				x=x.substring(space);	//Ū�X�Ĥ@�Ӫťդ��᪺�F��
				x=x.trim();
			}
			int xx=Integer.parseInt(x);	//��Ĥ@�Ӫťդ��e���F���ܼƦrxx
			sum +=xx;	//��xx��J����
			if(xx>max)max=xx;	//���xx�M�̤j��
			if(xx<min)min=xx;	//���xx�M�̤p��
			++bean;		//���l�Ʀh1
			avg=(double)(sum)/bean;
			System.out.println("The Sum is "+sum+", the max is "+max+", the min is "+min+", there are "+bean+" numbers, and the average is "+avg+".");
			
			
			System.out.println();
			sum=0;max=Integer.MIN_VALUE;min=Integer.MAX_VALUE;bean=0;
			System.out.println("Enter something:");			
			x=scan.nextLine(); 
			x=x.toLowerCase();
			q = x.indexOf("quit");
			System.out.println(x);
		}

	}

}
