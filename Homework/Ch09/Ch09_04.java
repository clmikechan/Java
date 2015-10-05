package Ch09;

import java.util.*;

public class Ch09_04 {

	public static void main(String[] args) {
		String [] names = {"±i§g¶®","¼ï¬ü³·","¼B³·²ú","¶À±l±l","¼ï¬ü³·","¶À¬üµØ","¼B³·ÄR","¶À±l±l","¼ï¬ü³·","¼ï¬ü³·"};
		System.out.print("¥¼±Æ§Ç: ");
		for(String s:names){
			System.out.print(s+"\t");
		}
		System.out.println();
		Arrays.sort(names);
		System.out.print("±Æ§Ç: ");
		for(String s:names){
			System.out.print(s+"\t");
		}
	}

}
