package Ch03;

public class Ch03_06 {

	public static void main(String[] args) {
		int l=10;  //邊長及內接圓直徑皆為10
		double as=l*l;  //正方形面積
		double ar=(l/2)*(l/2)*Math.PI;  //內接圓面積
		System.out.println("邊長為10的正方形之面積與其內接圓之面積的差值為"+(as-ar));  //顯示差值
	}

}
