package Ch10;

import java.io.*;

import Ch10.Ch10_05.Mammal;


public class Ch10_06 {

	public static void main(String[] args) {
		File dir = new File("c:/data");
		File file = new File(dir,"Object.dat");
		try(
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		){
			Object obj;
			obj = ois.readObject();
			while(obj instanceof Mammal){
				Mammal mam = (Mammal)obj;
				mam.smile();
				obj = ois.readObject();
			}
		} catch (FileNotFoundException e){
			System.out.println("This file has not found.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(EOFException e){
			System.out.println("沒有別的物件了。");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	}

}
