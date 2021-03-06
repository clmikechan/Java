package Ch10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ch10_04 {

	public static void main(String[] args) {
		int num = 0;
		File file = new File("C:/data/Data.txt");
		try (	
			FileOutputStream fos = new FileOutputStream(file, true);
			DataOutputStream dos = new DataOutputStream(fos);
			){
			System.out.println("開始寫入");
			for(int i = 1 ; i<=10;i++){
				num=(int)(Math.random()*1000)+1;
				dos.writeInt(num);
				System.out.println(num);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("寫入完成");
		try(
			FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis))
			
				
		{	while(true)
			System.out.println(dis.readInt()+" ");
		}catch (FileNotFoundException e){
			System.out.println("This file has not found.");
		}catch (EOFException e){
			System.out.println("沒有別的整數了。");
		} catch (IOException e) {
			e.printStackTrace();
		}System.out.println("最前面的兩個數字1076994048和0是上一題輸入的double數17.625轉碼而來的。");
	}

}
