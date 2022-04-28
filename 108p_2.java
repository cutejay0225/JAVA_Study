import java.util.*;
public class practice {
public static void main(String[] args) {
	 	int a; int b;
	 	Scanner scan = new Scanner(System.in);
	 	System.out.print("첫번째 정수를 입력하세요! : ");
	 	a = scan.nextInt();
	 	System.out.print("두번째 정수를 입력하세요! : ");
	 	b = scan.nextInt();
	 	if(a>b) {
	 		System.out.println("큰 값은" + a + "입니다.");
	 	}
	 	else
	 	{
	 		System.out.println("큰 값은" + b + "입니다.");
	 	}
	}
}
