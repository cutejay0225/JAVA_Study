package java2_9;
import java.util.*;
public class java2_9 {
	public static void main(String[] srgs) {
		int a;
		int b;
		int c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ǰ ������ �Է��ϼ���: ");
		a = scanner.nextInt();
		System.out.print("���η��� �Է��ϼ���: ");
		b = scanner.nextInt();
		c = (a - (a*1/100*b));
		System.out.println("��ǰ����: " + a);
		System.out.println("������: " + b + "%");
		System.out.println("���ϰ���: " + c);
		
	}

}
