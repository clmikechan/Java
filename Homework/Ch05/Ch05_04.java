package Ch05;

import java.util.Arrays;

public class Ch05_04 {

	public static void main(String[] args) {
		String[] ca={"snoopy","micky","lucky","kitty","derby"}, a={"a","e","i","o","u"};
		int n[]= new int[5];
		String s=Arrays.toString(ca);
		int sum=0;
		for (int i=0;i<a.length;i++){
			s=Arrays.toString(ca);
			
		while(s.indexOf(a[i]) !=-1){
		s=s.substring(s.indexOf(a[i])+1);
		n[i]++;
		}
		}
		for(int j : n){
			sum += n[j];
		}
		System.out.println("The total numbers of vowel is "+sum+".");
	}

}
