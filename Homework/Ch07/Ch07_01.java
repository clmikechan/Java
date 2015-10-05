package Ch07;

public class Ch07_01 {
static{System.out.println("靜態區塊A，最先執行");}

	Ch07_01(){System.out.println("建構子，靜態區塊執行完後才執行main，被new才執行");}
	static{System.out.println("靜態區塊B，其次");}
	public static void main(String[] args) {
		Ch07_01 con = new Ch07_01();
		System.out.println("HaHaHa");
	}
	static {System.out.println("靜態區塊C，第三順位執行");}
}
