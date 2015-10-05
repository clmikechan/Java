package Ch09.Ch09_05;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class BoyFriend implements Comparator<BoyFriend>{
	String name;
	int annualSalary;
	double height;

	public BoyFriend(String name, int annualSalary, double height) {
		super();
		this.name = name;
		this.annualSalary = annualSalary;
		this.height = height;
	}
	public BoyFriend(){}
	public String toString() {
		return name + "  ¦~Á~:" + annualSalary + " ¨­°ª:" + height;
	}

	@Override
	public int compare(BoyFriend o1, BoyFriend o2) {
		if (o1.annualSalary-o2.annualSalary != 0){
			return o1.annualSalary-o2.annualSalary;
		}else {
			return (int)(o1.height-o2.height);
		}
	}

	
}
