package java2_7;
import java.util.*; // import 선언

public class java2_7 { // 사용자 정의 메서드
	public static void main(String[] srgs) {
		int a;
		int b;	
		// 변수 선언
		Scanner scanner = new Scanner(System.in);	
		// 스캐너 객체 생성
		System.out.print("두개의 정수를 입력하시오: ");	
		// 키보드 입력 메시지
		a = scanner.nextInt();
		b = scanner.nextInt();	
		// 키보드로 입력한 2개의 자료 정수로 읽어서 변수에 저장
		
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
		System.out.println("a % b = " + (a%b));
		// 결과를 모니터에 출력
		
	}
	

}
