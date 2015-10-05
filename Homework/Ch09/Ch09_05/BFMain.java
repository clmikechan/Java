package Ch09.Ch09_05;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class BFMain{

	public static void main(String[] args) {
		BoyFriend bf1 =  new BoyFriend("溫小彬", 50000, 168);
        BoyFriend bf2 =  new BoyFriend("劉幼傑", 65000, 170);
        BoyFriend bf3 =  new BoyFriend("王丹丹", 75000, 160);
        BoyFriend bf4 =  new BoyFriend("周星星", 50000, 165);
        BoyFriend bf5 =  new BoyFriend("趙初明", 50000, 170);
        List<BoyFriend> c = new ArrayList<>();
        c.add(bf1);
        c.add(bf2);
        c.add(bf3);
        c.add(bf4);
        c.add(bf5);
        BoyFriend boyFriend = new BoyFriend();
        Collections.sort(c,boyFriend);
        System.out.println("好酒沉甕底，越好的男人放越下面。");
        for(BoyFriend bf: c){
      	  System.out.println(bf);
        }

	}

}
