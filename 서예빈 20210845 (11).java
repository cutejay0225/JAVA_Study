package java2_7;
import java.util.*; // import ����

public class java2_7 { // ����� ���� �޼���
	public static void main(String[] srgs) {
		int a;
		int b;	
		// ���� ����
		Scanner scanner = new Scanner(System.in);	
		// ��ĳ�� ��ü ����
		System.out.print("�ΰ��� ������ �Է��Ͻÿ�: ");	
		// Ű���� �Է� �޽���
		a = scanner.nextInt();
		b = scanner.nextInt();	
		// Ű����� �Է��� 2���� �ڷ� ������ �о ������ ����
		
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
		System.out.println("a % b = " + (a%b));
		// ����� ����Ϳ� ���
		
	}
	

}
