package Ch03;

public class Ch03_02 {

	public static void main(String[] args) {
		int time=256559;  //�`�@��256559��
		int day=time/(60*60*24);  //�`�@���h�֤�
		int hour=(time%(60*60*24))/(60*60);  //�����@�Ѽ��ٳѦh�֤p��
		int minute=(time%(60*60))/60;  //�����@�p�ɼ��٦��h�֤���
		int second=time%60;  //�����@�������٦��h�֬�
		
		
		System.out.println(time+"��۷��"+day+"��"+hour+"�p��"+minute+"�����S"+second+"��");
	}

}
