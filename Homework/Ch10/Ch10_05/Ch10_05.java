package Ch10.Ch10_05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ch10_05 {

	public static void main(String[] args) {
		Cat cat1 = new Cat("cat1");
		Cat cat2 = new Cat("cat2");
		Dog dog1 = new Dog("dog1");
		Dog dog2 = new Dog("dog2");
		File dir = new File("c:/data");
		
		if(! dir.isDirectory()){
			dir.mkdirs();
		}
		File file = new File(dir,"Object.dat");
		try (
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		){
			System.out.println("開始寫入");
			oos.writeObject(cat1);
			oos.writeObject(cat2);
			oos.writeObject(dog1);
			oos.writeObject(dog2);
			System.out.println("寫入完畢");
		} catch (FileNotFoundException e) {
			System.out.println("This file has not found.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
