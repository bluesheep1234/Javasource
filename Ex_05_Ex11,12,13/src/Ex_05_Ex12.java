import java.util.Scanner;

public class Ex_05_Ex12 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a, b ;
		char c;
		
		System.out.printf("ù��° ���� �Է��ϼ��� ");
		a = s.nextInt();
		
		System.out.printf("����� �����ڸ� �Է��ϼ��� ");
		c = s.next().charAt(0);
		
		System.out.printf("�ι�° ���� �Է��ϼ��� ");
		b = s.nextInt();
		
		
		if (c == '+')
			System.out.printf("%d %c %d = %d", a, c, b, a+b);
		
		else if (c == '-')
			System.out.printf("d %c %d = %d", a, c, b, a-b);
		
		else if (c == '*')
			System.out.printf("d %c %d = %d", a, c, b, a*b);
		
		else if (c == '/')
			System.out.printf("d %c %d = %d", a, c, b, a/b);
		
		else if (c == '%')
			System.out.printf("d %c %d = %d", a, c, b, a%b);
		
		else
			System.out.printf("�߸� �Է��ϼ̽��ϴ�.");
			
	}
}