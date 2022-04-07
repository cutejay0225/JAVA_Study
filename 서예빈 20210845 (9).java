package java2_5;
import java.lang.Math; //Math 클래스의 파이(PI) 사용
import java.util.*; //Scanner 사용

//클래스 이름
public class java2_5 { 
	//메인 메소드
	public static void main(String[] srgs) { 
			
		int r;  // 변수 선언 (반지름)
		double circler;
		
		//Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		//키보드 입력 메시지 (원의 반지름 정수 입력)
		System.out.print("원의 반지름을 정수로 입력하시오: ");
		
		r = scanner.nextInt(); //정수형이라 nextInt 사용
		// circler = 2*pai*r
		circler = 2 * Math.PI*r;
		
		//결과를 모니터에 출력(원의 반지름, 원의 원둘레)
		System.out.println("원의 반지름: " + r );
		System.out.printf("원의 원둘레: " + circler );
		
	}

}
