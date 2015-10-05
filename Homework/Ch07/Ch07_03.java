package Ch07;

abstract class Human{
	int weight=50;
	abstract void smile();
}

	abstract class OrdinaryPeople extends Human{
}

class HappyMary extends OrdinaryPeople{
		void smile(){
		System.out.println("HA");
		}
}

public class Ch07_03 {

	public static void main(String[] args) {
		HappyMary hm = new HappyMary();
		hm.smile();
	}
}
