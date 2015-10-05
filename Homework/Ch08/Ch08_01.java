package Ch08;

public class Ch08_01 {
	static void subroutine(String[] ar){
		int sum=0;	
			for(int i=0;i<ar.length;i++){
				try{
					sum += Integer.parseInt(ar[i]);
				}catch(NumberFormatException e){
					System.out.println(ar[i]+" is not a number");
				}finally{
				}
			}
		
		System.out.println("sum="+sum);
	}

	public static void main(String[] args) {

		subroutine(args);
	}

}
