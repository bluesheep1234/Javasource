import java.util.Scanner;

public class Ex_06_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int i;
		int level;
		
		System.out.printf("¸î ´Ü ?");
			level = s.nextInt();
		
			for (i = 1; i <= 9; ++i)
			System.out.printf("%d x %d = %d\n", level, i, level*i);
			
	}

}
