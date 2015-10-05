package Ch03;

public class Ch03_02 {

	public static void main(String[] args) {
		int time=256559;  //總共有256559秒
		int day=time/(60*60*24);  //總共有多少天
		int hour=(time%(60*60*24))/(60*60);  //不足一天數還剩多少小時
		int minute=(time%(60*60))/60;  //不足一小時數還有多少分鐘
		int second=time%60;  //不足一分鐘數還有多少秒
		
		
		System.out.println(time+"秒相當於"+day+"天"+hour+"小時"+minute+"分鐘又"+second+"秒");
	}

}
