
public class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);	// 클래스변수
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card(); // 객체 생성
		c1.kind = "Heart";
		c1.number = 7; // 객체 사용
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" +  c1.width + ", "+ c1.height + ")");
		System.out.println("c1의 width 와 height 를 각각 50, 80으로 변경합니다.");
		
		c1.width = 50;
		c1.height = 80;
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" +  c1.width + ", "+ c1.height + ")");
		
	}

}
class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
