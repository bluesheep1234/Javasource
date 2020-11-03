import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int a, b;
		char operator;
		
		while (true) {
			System.out.printf("계산할 첫번째 수를 입력하세요. : ");
			a = s.nextInt();
		
			System.out.printf("계산할 두번째 수를 입력하세요. : ");
			b = s.nextInt();
		
			System.out.printf("계산할 연산자를 입력하세요.(!입력 시 프로그램 종료) : ");
			operator = (char)System.in.read();
		
		if (operator =='!') { 
			System.out.printf("프로그램을 종료합니다\n."); break; //switch문 위로 올려보자
		}
			
		switch (operator) {
			case '+' :
			System.out.printf("%d + %d = %d 입니다\n", a, b, a+b); break;					
			case '-' :
			System.out.printf("%d - %d = %d 입니다\n", a, b, a-b); break;	
			case '*' :
			System.out.printf("%d * %d = %d 입니다\n", a, b, a*b); break;
			case '/' :
			System.out.printf("%d / %d = %d 입니다\n", a, b, a/b); break;
			case '%' :
			System.out.printf("%d % %d = %d 입니다\n", a, b, a%b); break;	
			default : 
				System.out.printf("연산자를 잘못 입력했습니다.\n"); break;
		}
			
		
		}

	}

}
