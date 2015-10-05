package Ch10.Ch10_05;

public class Cat extends Mammal {
	String name;
	public Cat(String name){
		this.name = name;
	}
	public void smile(){
		System.out.println("Cat=> "+ name + ":)");
	}
	public void meao(){
		System.out.println("Cat=>" + name + "meaomeao");
	}
}
