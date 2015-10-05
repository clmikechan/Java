package Ch07;
import java.util.*;

class StaticCodeBlock{
	static String season;

	static {
		Calendar d =Calendar.getInstance();
		int month =d.get(Calendar.MONTH );
		if(month==11)StaticCodeBlock.season="冬天";
		else if(month >=8)StaticCodeBlock.season="秋天";
		else if(month >=5)StaticCodeBlock.season="夏天";
		else if(month >=2)StaticCodeBlock.season="春天";
		else{StaticCodeBlock.season="冬天";}
	}
}		


public class Ch07_02 {
	public static void main(String[] args) {

		System.out.println(StaticCodeBlock.season);
	}
}
