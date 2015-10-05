package Ch04;

public class Ch04_07 {
	public static void main(String[] args){
		String s="Hello, World, 大家好";	//定義被指定之字串
		int i=0;	//指定while迴圈之初始執
		while(i<s.length()){
			System.out.println(s.charAt(i)+"  "+(int)(s.charAt(i)));	//列應所指定之資料
			i++;	//while迴圈之條件修正
		}
	}
}
