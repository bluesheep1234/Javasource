import java.util.Scanner;

public class Ex_03_Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first;
		Scanner s = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 ==> ");
		first = s.nextInt();
		
		System.out.printf("10진수 ==>%d\n", first);
		
		System.out.printf("16진수 ==>%x\n", first);
		
		System.out.printf("8진수 ==>%o\n", first);
	}

}
