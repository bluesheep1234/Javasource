import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 계산할 값을 입력하세요. ==>");
		a = s.nextInt();
		
		System.out.print("두번째 게산할 값을 입력하세요. ==>");
		b = s.nextInt();
		
		
		
		
		result = a + b;
		System.out.println(a + " + " + b + " = " +result);
		//a와b의 합계//
		
		result = a - b;
		System.out.println(a + " - " + b + " = " + result);
		//a와b의 차//
		
		result = a * b;
		System.out.println(a + " * " + b + " = " + result);
		//a와b의곱//
		
		result = a / b;
		System.out.println(a + " / " + b + " = " + result);
		//a나누기b//
	}

}
