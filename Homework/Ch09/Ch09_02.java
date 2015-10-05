package Ch09;

import java.util.*;

public class Ch09_02 {

	public static void main(String[] args) {
		String [] names = {"±i§g¶®","¼ï¬ü³·","¼B³·²ú","¶À±l±l","¼ï¬ü³·","¶À¬üµØ","¼B³·ÄR","¶À±l±l","¼ï¬ü³·","¼ï¬ü³·"};
		System.out.println(Arrays.toString(names));
		Set<String> set = new HashSet<>();
		for(String s : names){
			set.add(s);
		}
		System.out.println(set.toString());
	}

}
