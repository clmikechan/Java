package Ch10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ch10_02 {

	public static void main(String[] args) {
		long sumBites = 0L, sumChar = 0L,sumLine = 0L;
			File file = new File("c:/data/Sample.txt");
			String name = file.getName();
			
			System.out.print(name+" 含有 ");
			try (
				FileInputStream fir = new FileInputStream(file);
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(new FileReader(file));
				)
				{
				while(fir.read() != -1){
					sumBites++;
				}
				System.out.print(sumBites+"個位元組，");
				
				while(fr.read() != -1){
					sumChar++;

				}
				System.out.print(sumChar+" 個字元，");
				
				while (br.readLine() != null) {
					sumLine++;
				}
				System.out.println(sumLine+" 列資料。");
			} catch (FileNotFoundException e) {
				System.out.print("This file has not found.");
			}catch (IOException e){
				e.printStackTrace();
			}
	}
}
