import java.util.Scanner;

public class Ex_07_Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;
		int i, basu;
		int total =0 ;
		
		
		
			System.out.printf("�հ��� ���۰� ==> ");
			a = s.nextInt();
			
			System.out.printf("�հ��� ���� ==> ");
			b = s.nextInt();
		
			System.out.printf("��� ==> ");
			basu = s.nextInt();
			
			i = a;
			while (i <= b) {
				if (i % basu == 0)
					total = total + i;
				
				i++;
			}
			
			System.out.printf("%d���� %d������ %d����� �հ� ==> %d\n", a, b, basu, total);
	}

}
