import java.util.Scanner;

public class Ex_05_Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int a,b;
		char c;
		
		System.out.printf("ù��° ���� �Է����ּ��� : ");
		a = s.nextInt();
		
		System.out.printf("����� �����ڸ� �Է��ϼ��� : ");
		c = s.next().charAt(0);
		
		System.out.printf("�ι�° ���� �Է����ּ��� : ");
		b = s.nextInt();
		
		if ( c == '+') 
			System.out.printf("%d  %c  %d = %d \n" , a, c, b, a+b);
		
		if  ( c == '-')
			System.out.printf("%d  %c  %d = %d \n" , a, c, b, a-b);	
		
		if  ( c == '*')
			System.out.printf("%d  %c  %d = %d \n" , a, c, b, a*b);
		
		if  ( c == '/') 
			System.out.printf("%d  %c  %d = %d \n" , a, c, b, a/b);
		
		if  ( c == '%') 
			System.out.printf("%d  %c  %d = %d \n" , a, c, b, a%b);
		
	}

}
