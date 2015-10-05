package Ch09;

import java.util.*;

public class Ch09_03 {

	public static void main(String[] args) {
		double[] array = {98,12.345,97.85,12};
		ArrayList<Double> ad = new ArrayList<>();
		for(double s : array){
			ad.add(s);
		}
		System.out.println("¥¼±Æ§Ç"+ad.toString());
		Collections.sort(ad);
		System.out.println("±Æ§Ç"+ad.toString());
	}

}
