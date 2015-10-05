package Ch05;

public class Ch05_05 {

	public static void main(String[] args) {
		int [][] test={
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75}
		};
		int suma,sumb;
		for(int i=0; i <test.length; i++){
			suma=0;
			for(int j=0;j<test[i].length;j++){
				suma += test[i][j];
			}
			System.out.println("The sum of row No."+ (i+1) +" is "+suma+".");
		}
		
		for(int k=0; k <test[0].length; k++){
			sumb=0;
			for(int l=0;l<test.length;l++){
				sumb += test[l][k];
			}
			System.out.println("The sum of column No."+ (k+1) +" is "+sumb+".");
		}
	}

}
