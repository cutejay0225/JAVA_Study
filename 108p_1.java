import java.util.*;
public class practice {
public static void main(String[] args) {
	 
		 int intval;
		 int count=0;
		 int total=0;
		 Scanner scan = new Scanner(System.in);
		 System.out.print("정수를 입력하세요! : ");
		 intval = scan.nextInt();
		 for(int i=0; i<= intval; i=i+5)
		 {
			 count = intval/5 + 1;
			 total += i;
	     }
		 
		 System.out.println("정수 입력 값 : " + intval);
		 System.out.println("5의 배수의 갯수 : " + (count-1));
		 System.out.println("5의 배수의 합 : " + total);
}
}
