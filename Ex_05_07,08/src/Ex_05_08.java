import java.util.Scanner;

public class Ex_05_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a;
		
		System.out.printf("점수를 입력하세요 : ");
		a = s.nextInt();
		
		if (a > 90)
			System.out.printf("A\n");
		
		else if (a > 80)
			System.out.printf("B\n");
		else if (a > 70)
			System.out.printf("C\n");
		else if (a > 60)
			System.out.printf("D\n");
		
		else
			System.out.printf("F");
	}

}
