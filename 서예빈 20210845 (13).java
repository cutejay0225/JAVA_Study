package java2_9;
import java.util.*;
public class java2_9 {
	public static void main(String[] srgs) {
		int a;
		int b;
		int c;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("상품 가격을 입력하세요: ");
		a = scanner.nextInt();
		System.out.print("할인률을 입력하세요: ");
		b = scanner.nextInt();
		c = (a - (a*1/100*b));
		System.out.println("상품가격: " + a);
		System.out.println("할인율: " + b + "%");
		System.out.println("세일가격: " + c);
		
	}

}
