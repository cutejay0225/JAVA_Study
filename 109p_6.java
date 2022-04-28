public class practice {
public static void main(String[] args) {
	int[][] kukudan = new int[9][9]; //구구단 값 저장을 위한 배열 생성
	
	for(int i = 0; i<8; i++) {//단수 (행)반복
		for(int j = 0; j<9; j++) {//곱하기(열) 반복
			kukudan[i][j] = (i+1)*(j+1);//배열에 값 저장
			System.out.print((i+1)+"x"+(j+1)+"="+kukudan[i][j]+"\t");
			
		}
		System.out.println();
		}
	}
}
