import java.util.Scanner;

public class Ex_08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int [] inputs = new int [4];
		
		System.out.printf("1��° ���ڸ� �Է��ϼ��� : ");
		inputs[0] = s.nextInt();
		System.out.printf("2��° ���ڸ� �Է��ϼ��� : ");
		inputs[1] = s.nextInt();
		System.out.printf("3��° ���ڸ� �Է��ϼ��� : ");
		inputs[2] = s.nextInt();
		System.out.printf("4��° ���ڸ� �Է��ϼ��� : ");
		inputs[3] = s.nextInt();
		
		System.out.printf("�հ� : %d", inputs[0]+inputs[1]+inputs[2]+inputs[3]);
	}

}
