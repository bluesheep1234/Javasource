import java.util.Scanner;

public class Ex_07_Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;
		int i, basu;
		int total =0 ;
		
		
		
			System.out.printf("합계의 시작값 ==> ");
			a = s.nextInt();
			
			System.out.printf("합계의 끝값 ==> ");
			b = s.nextInt();
		
			System.out.printf("배수 ==> ");
			basu = s.nextInt();
			
			i = a;
			while (i <= b) {
				if (i % basu == 0)
					total = total + i;
				
				i++;
			}
			
			System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d\n", a, b, basu, total);
	}

}
