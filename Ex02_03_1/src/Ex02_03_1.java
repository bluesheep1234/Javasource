import java.util.Scanner;

public class Ex02_03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("ù��° ����� ���� �Է��ϼ��� ==>");
		int a = s.nextInt();
		
		System.out.print("�ι�° ����� ���� �Է��ϼ��� ==>");
		int b = s.nextInt();
		
		System.out.print("����° ����� ���� �Է��ϼ��� ==>");
		int c = s.nextInt();
		
		System.out.print("�׹�° ����� ���� �Է��ϼ��� ==>");
		int d = s.nextInt();
		
		result = a + b + c + d;
		
		System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + result);
		//a+b+c+d�� ��//
		
	}

}
