import java.util.Scanner;

public class Ex_04_Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		double result;
			
		System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
		double first = s.nextDouble();
		System.out.printf("두번째 계산할 값을 입력하세요 ==> ");
		double second = s.nextDouble();
		
		
		result = first + second;
		System.out.printf("%5.2f + %5.2f = %5.2f\n", first, second, result);
		result = first - second;
		System.out.printf("%5.2f - %5.2f = %5.2f\n", first, second, result);
		result = first * second;
		System.out.printf("%5.2f * %5.2f = %5.2f\n", first, second, result);
		result = first / second;
		System.out.printf("%5.2f / %5.2f = %5.2f\n", first, second, result);
		result = first % second;
		System.out.printf("%5.2f %% %5.2f = %5.2f\n", first, second, result);
	}

}
