package Ch07;
import java.util.*;

class StaticCodeBlock{
	static String season;

	static {
		Calendar d =Calendar.getInstance();
		int month =d.get(Calendar.MONTH );
		if(month==11)StaticCodeBlock.season="�V��";
		else if(month >=8)StaticCodeBlock.season="���";
		else if(month >=5)StaticCodeBlock.season="�L��";
		else if(month >=2)StaticCodeBlock.season="�K��";
		else{StaticCodeBlock.season="�V��";}
	}
}		


public class Ch07_02 {
	public static void main(String[] args) {

		System.out.println(StaticCodeBlock.season);
	}
}
