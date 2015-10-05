package Ch10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ch10_03 {

	public static void main(String[] args) {
		double num = 17.625;
		File file = new File("C:/data/Data.txt");
		try (	
			FileOutputStream fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			){
			System.out.println("開始寫入");
			dos.writeDouble(num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("寫入完成");
		try(
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis))
		{
			System.out.println(dis.readDouble());
		}catch (FileNotFoundException e){
			System.out.println("This file has not found.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
