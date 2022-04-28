import java.util.*;
public class practice {
public static void main(String[] args) {
	int price=0,number=0,total=0; int sale=0;
	Scanner scan = new Scanner(System.in);
	System.out.print("상품의 가격을 입력하세요: ");
	price = scan.nextInt(); //정수값 할당
	System.out.print("상품의 개수를 입력하세요: ");
	number = scan.nextInt(); //정수값 할당
	total=(price*number); //상품의 가격*수량
	
	if(total>=1000000) {
		total=(int)(total*0.6);
		sale = 40;
	}
	else if(total>=500000){
		total = (int)(total*0.7);
		sale = 30;
	}
	else
	{
		sale = 0;
	}
	System.out.println("상품가격: "+price+"원, 구입수량: "+number+"개, "
			+ "총 계:" + total +"원, 할인율: "+sale+"%");
}
}

