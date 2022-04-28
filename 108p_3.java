import java.util.*;
public class practice {
public static void main(String[] args) {
		int a; int b;
		Scanner scanner= new Scanner(System.in);
		
		while(true)
		{
			
			System.out.println("첫번째 정수를 입력하세요: ");
			a = scanner.nextInt();
			System.out.println("두번째 정수를 입력하세요: ");
			b = scanner.nextInt();
			System.out.println("a*b=" + a*b);
			
			
			if(a*b>500)
				System.out.println("두 수의 곱이 500을 초과하였습니다.");
				break;
		}
	}
}
