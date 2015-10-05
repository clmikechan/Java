package Ch10;

import java.io.File;
import java.io.FileInputStream;

public class Ch10_01 {
	public static void main(String[] args) {
		File file = new File("c:/data/Sample.txt");
		String name = file.getName();
		System.out.println(name+" 的大小是 "+file.length()+" bites.");
	}
}
