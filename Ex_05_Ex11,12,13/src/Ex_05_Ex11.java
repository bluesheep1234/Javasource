import java.util.Scanner;

public class Ex_05_Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int a,b;
		char c;
		
		System.out.printf("첫번째 수를 입력해주세요 : ");
		a = s.nextInt();
		
		System.out.printf("계산할 연산자를 입력하세요 : ");
		c = s.next().charAt(0);
		
		System.out.printf("두번째 수를 입력해주세요 : ");
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
