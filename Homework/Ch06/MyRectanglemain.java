package Ch06;

public class MyRectanglemain {

	public static void main(String[] args) {
		System.out.println("第七題");
		MyRectangle R1= new MyRectangle(10,20);
		R1.getArea();
		MyRectangle R2= new MyRectangle();
		R2.setWidth(10);
		R2.setDepth(20);
		R2.getArea();
		System.out.println("");
		System.out.println("第八題");
		System.out.println(R1.equals(R2));
		System.out.println("");
	}

}

class MyRectangle{
	 double width;
	 double depth;
	 void setWidth(double w){
		 this.width=w;
	 }
	 void setDepth(double d){
		 this.depth=d;
	 }
	 double getArea(){
		 double area=width*depth;
		 System.out.println(area);
		 return area;
	 }
	 public MyRectangle(){}
	 public MyRectangle(double width, double depth){
		 this.width=width;
		 this.depth=depth;

	 }
	@Override
	public int hashCode() {
		return (new Double (width).hashCode())^(new Double (depth).hashCode());
	}
	@Override
	public boolean equals(Object obj) {
		if(obj !=null && obj instanceof MyRectangle){
			MyRectangle re = (MyRectangle) obj;
			if(this.width == re.width
				&&this.depth ==re.depth){
				return true;
			}else{
				return false;
			}
		}else{
		return false;
	}
}
}
