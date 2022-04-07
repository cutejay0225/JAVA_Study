package java2_6;
import java.io.*; // import 선언

public class java2_6 { // 새로 정의할 클래스 이름
	public static void main(String[] srgs) throws IOException{	//main 메소드
		String name;
		String num;
		String tscore;	
		// 변수 선언 (이름, 학번, 토플점수)
		
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		// 버퍼리더 클래스 객체 생성
		System.out.print("이름, 학번, 토플점수를 입력하세요!:");
		// 키보드 입력 메시지
		name = inbr.readLine();
		num = inbr.readLine();
		tscore = inbr.readLine();
		// 키보드로 입력한 자료를 문자열로 읽어서 변수에 저장
		System.out.println("나의 이름은" + name + "입니다.");
		System.out.println("학번은" + num + "입니다.");
		System.out.println("그리고 토플 점수는" + tscore + "입니다.");
		// 결과를 모니터에 출력(이름, 학번, 토플점수)
	}

}
