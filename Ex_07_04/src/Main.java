import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int a, b;
		char operator;
		
		while (true) {
			System.out.printf("����� ù��° ���� �Է��ϼ���. : ");
			a = s.nextInt();
		
			System.out.printf("����� �ι�° ���� �Է��ϼ���. : ");
			b = s.nextInt();
		
			System.out.printf("����� �����ڸ� �Է��ϼ���.(!�Է� �� ���α׷� ����) : ");
			operator = (char)System.in.read();
		
		if (operator =='!') { 
			System.out.printf("���α׷��� �����մϴ�\n."); break; //switch�� ���� �÷�����
		}
			
		switch (operator) {
			case '+' :
			System.out.printf("%d + %d = %d �Դϴ�\n", a, b, a+b); break;					
			case '-' :
			System.out.printf("%d - %d = %d �Դϴ�\n", a, b, a-b); break;	
			case '*' :
			System.out.printf("%d * %d = %d �Դϴ�\n", a, b, a*b); break;
			case '/' :
			System.out.printf("%d / %d = %d �Դϴ�\n", a, b, a/b); break;
			case '%' :
			System.out.printf("%d % %d = %d �Դϴ�\n", a, b, a%b); break;	
			default : 
				System.out.printf("�����ڸ� �߸� �Է��߽��ϴ�.\n"); break;
		}
			
		
		}

	}

}
