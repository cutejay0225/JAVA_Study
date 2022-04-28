import java.io.*;
public class practice {
public static void main(String[] args) throws IOException{
int stu[]={0,0,0,0,0};//점수를 저장한 배열 선언
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader inbr = new BufferedReader(isr);
	System.out.print("출석점수를 입력하세요(100점만점).");
	stu[0] = Integer.parseInt(inbr.readLine());//입력받은 정수값 할당
	if(stu[0]>100){
		System.out.println("출석 점수는 100점을 초과할수 없습니다. 다시 입력해주세요.");
		stu[0] = Integer.parseInt(inbr.readLine());
	}
	System.out.print("과제점수를 입력하세요(100점만점).");
	stu[1] = Integer.parseInt(inbr.readLine());//입력받은 정수값 할당
	if(stu[1]>100){
		System.out.println("과제 점수는 100점을 초과할수 없습니다. 다시 입력해주세요.");
		stu[1] = Integer.parseInt(inbr.readLine());
	}
	System.out.print("중간 점수를 입력하세요(100점만점).");
	stu[2] = Integer.parseInt(inbr.readLine());//입력받은 정수값 할당
	if(stu[2]>100){
		System.out.println("중간 점수는 100점을 초과할수 없습니다. 다시 입력해주세요.");
		stu[2] = Integer.parseInt(inbr.readLine());
	}
	System.out.print("기말점수를 입력하세요(100점만점).");
	stu[3] = Integer.parseInt(inbr.readLine());//입력받은 정수값 할당
	if(stu[3]>100){
		System.out.println("기말 점수는 100점을 초과할수 없습니다.다시 입력해주세요.");
		stu[3] = Integer.parseInt(inbr.readLine());
	}
	stu[4]=(stu[0]*2/10+stu[1]*2/10+stu[2]*3/10+stu[3]*3/10);
	//4가지 점수를 배열 [4]에 총점으로 합산하기
	switch(stu[4]/10) {
		case 10:
		case 9:
			System.out.println("A"); 
		break;
		case 8:
		case 7:
			System.out.println("B");
		break;
		case 6:
		case 5:
			System.out.println("C");
		case 4:
		case 3:
			System.out.println("D");
		default:
			System.out.println("F");
	}
	}
}
