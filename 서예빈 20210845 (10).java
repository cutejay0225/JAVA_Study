package java2_6;
import java.io.*; // import ����

public class java2_6 { // ���� ������ Ŭ���� �̸�
	public static void main(String[] srgs) throws IOException{	//main �޼ҵ�
		String name;
		String num;
		String tscore;	
		// ���� ���� (�̸�, �й�, ��������)
		
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		// ���۸��� Ŭ���� ��ü ����
		System.out.print("�̸�, �й�, ���������� �Է��ϼ���!:");
		// Ű���� �Է� �޽���
		name = inbr.readLine();
		num = inbr.readLine();
		tscore = inbr.readLine();
		// Ű����� �Է��� �ڷḦ ���ڿ��� �о ������ ����
		System.out.println("���� �̸���" + name + "�Դϴ�.");
		System.out.println("�й���" + num + "�Դϴ�.");
		System.out.println("�׸��� ���� ������" + tscore + "�Դϴ�.");
		// ����� ����Ϳ� ���(�̸�, �й�, ��������)
	}

}
