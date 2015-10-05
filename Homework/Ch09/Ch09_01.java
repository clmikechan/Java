package Ch09;

import java.math.*;
import java.util.*;

public class Ch09_01 {

	public static void main(String[] args) {
		ArrayList<Object> v = new ArrayList();
		v.add(0,new Integer(100));
		v.add(0,new Double(3.14));
		v.add(0,new Long(21L));
		v.add(0,(short) 100);
		v.add(0,new Double(5.1));
		v.add(0,new String("Kitty"));
		v.add(0,new Integer(200));
		v.add(0,new Object());
		v.add(0,new String("Snoopy"));
		v.add(0,new BigInteger("1000"));

		for(Object o : v){
			System.out.println(o);
		}
		Iterator<Object> it = v.iterator();
		while(it.hasNext()){
			Object o = it.next();
			if( o instanceof Number){
			}else{
				it.remove();
			}
		}
		
		System.out.println("---¶A¶∏¿À≈Á---");
		
		for(Object o : v){
			System.out.println(o);
		}
	}

}
