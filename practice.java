import java.io.*;
public class practice {
public static void main(String[] args) throws IOException{
int stu[]={0,0,0,0,0};//������ ������ �迭 ����
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader inbr = new BufferedReader(isr);
	System.out.print("�⼮������ �Է��ϼ���(100������).");
	stu[0] = Integer.parseInt(inbr.readLine());//�Է¹��� ������ �Ҵ�
	if(stu[0]>100){
		System.out.println("�⼮ ������ 100���� �ʰ��Ҽ� �����ϴ�. �ٽ� �Է����ּ���.");
		stu[0] = Integer.parseInt(inbr.readLine());
	}
	System.out.print("���������� �Է��ϼ���(100������).");
	stu[1] = Integer.parseInt(inbr.readLine());//�Է¹��� ������ �Ҵ�
	if(stu[1]>100){
		System.out.println("���� ������ 100���� �ʰ��Ҽ� �����ϴ�. �ٽ� �Է����ּ���.");
		stu[1] = Integer.parseInt(inbr.readLine());
	}
	System.out.print("�߰� ������ �Է��ϼ���(100������).");
	stu[2] = Integer.parseInt(inbr.readLine());//�Է¹��� ������ �Ҵ�
	if(stu[2]>100){
		System.out.println("�߰� ������ 100���� �ʰ��Ҽ� �����ϴ�. �ٽ� �Է����ּ���.");
		stu[2] = Integer.parseInt(inbr.readLine());
	}
	System.out.print("�⸻������ �Է��ϼ���(100������).");
	stu[3] = Integer.parseInt(inbr.readLine());//�Է¹��� ������ �Ҵ�
	if(stu[3]>100){
		System.out.println("�⸻ ������ 100���� �ʰ��Ҽ� �����ϴ�.�ٽ� �Է����ּ���.");
		stu[3] = Integer.parseInt(inbr.readLine());
	}
	stu[4]=(stu[0]*2/10+stu[1]*2/10+stu[2]*3/10+stu[3]*3/10);
	//4���� ������ �迭 [4]�� �������� �ջ��ϱ�
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
