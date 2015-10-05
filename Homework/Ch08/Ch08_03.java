package Ch08;
import java.io.IOException;
import java.util.Scanner;

public class Ch08_03 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		String s = null;
		System.out.println("�п�J���ơA��Jquit����");
		while(scanner.hasNextLine()){
			s=scanner.next();
			if(s.trim().equalsIgnoreCase("quit")) break;
			try{
				int score=Integer.parseInt(s);
				if(score>100||score<0){
					throw new ScoreException(score);
				}
				System.out.println("�o�O�@�ӦX�k����:"+score);
			}catch(NumberFormatException e){
				System.out.println("�榡���~:s="+s);
			}catch(ScoreException se){
				System.out.println("�o���O�@�ӦX�k����:"+ se.score+"��]="+se.getErrorMessage());
			}			
		}//end of while
		System.out.println("�{������");
		scanner.close();
	}
}


	class ScoreException extends Exception{
		int score;
		private String errorMessage;
		ScoreException(int s){
			score = s;
			setErrorMessage();
		}
		private void setErrorMessage(){
			if(score<0)
				errorMessage="���� < 0 ";
			else if(score>100)
				errorMessage="���� > 100";
		}
		String getErrorMessage(){
			return errorMessage;
		}
	}


