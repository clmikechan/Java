package Ch09;

import java.util.*;

public class Ch09_04 {

	public static void main(String[] args) {
		String [] names = {"�i�g��","�����","�B����","���l�l","�����","������","�B���R","���l�l","�����","�����"};
		System.out.print("���Ƨ�: ");
		for(String s:names){
			System.out.print(s+"\t");
		}
		System.out.println();
		Arrays.sort(names);
		System.out.print("�Ƨ�: ");
		for(String s:names){
			System.out.print(s+"\t");
		}
	}

}
