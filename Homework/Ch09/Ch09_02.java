package Ch09;

import java.util.*;

public class Ch09_02 {

	public static void main(String[] args) {
		String [] names = {"�i�g��","�����","�B����","���l�l","�����","������","�B���R","���l�l","�����","�����"};
		System.out.println(Arrays.toString(names));
		Set<String> set = new HashSet<>();
		for(String s : names){
			set.add(s);
		}
		System.out.println(set.toString());
	}

}
