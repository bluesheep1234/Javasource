import java.util.Scanner;

public class Ex_05_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number;
		
		System.out.printf("1 ~ 4 �߿� �����ϼ��� : ");
		number = s.nextInt();
		
		switch (number) {
		case 1 : 
			System.out.printf("1�� �����߽��ϴ�. \n");
			break;
		
		
		case 2 : 
			System.out.printf("2�� �����߽��ϴ�. \n");
			break;
		
		
		case 3 : 
			System.out.printf("3�� �����߽��ϴ�. \n");
			break;
		
		
		case 4 : 
			System.out.printf("4�� �����߽��ϴ�. \n");
			break;
			
		default : 
			System.out.printf("�߸��� ���� �Է��߽��ϴ�.");
		}
	}

}
