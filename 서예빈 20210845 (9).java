package java2_5;
import java.lang.Math; //Math Ŭ������ ����(PI) ���
import java.util.*; //Scanner ���

//Ŭ���� �̸�
public class java2_5 { 
	//���� �޼ҵ�
	public static void main(String[] srgs) { 
			
		int r;  // ���� ���� (������)
		double circler;
		
		//Scanner ��ü ����
		Scanner scanner = new Scanner(System.in);
		
		//Ű���� �Է� �޽��� (���� ������ ���� �Է�)
		System.out.print("���� �������� ������ �Է��Ͻÿ�: ");
		
		r = scanner.nextInt(); //�������̶� nextInt ���
		// circler = 2*pai*r
		circler = 2 * Math.PI*r;
		
		//����� ����Ϳ� ���(���� ������, ���� ���ѷ�)
		System.out.println("���� ������: " + r );
		System.out.printf("���� ���ѷ�: " + circler );
		
	}

}
