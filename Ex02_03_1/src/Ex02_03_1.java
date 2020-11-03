import java.util.Scanner;

public class Ex02_03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 계산할 값을 입력하세요 ==>");
		int a = s.nextInt();
		
		System.out.print("두번째 계산할 값을 입력하세요 ==>");
		int b = s.nextInt();
		
		System.out.print("세번째 계산할 값을 입력하세요 ==>");
		int c = s.nextInt();
		
		System.out.print("네번째 계산할 값을 입력하세요 ==>");
		int d = s.nextInt();
		
		result = a + b + c + d;
		
		System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + result);
		//a+b+c+d의 값//
		
	}

}
