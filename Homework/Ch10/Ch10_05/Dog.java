package Ch10.Ch10_05;

public class Dog extends Mammal {
	String name;
	public Dog(String name){
		this.name = name;
	}
	public void smile(){
		System.out.println("Dog=> " + name + ":)");
	}
	public void bark(){
		System.out.println("Dog=>" + name + "wannwann");
	}
}
