
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3; 
		int c = 4;
		
		int result;
		int mok;
		int namugi;
		float result2;
		
		result = a + b - c;
		System.out.printf("%d + %d - %d = %d\n", a, b, c, result);
		
		result = a + b * c;
		System.out.printf("%d + %d * %d = %d\n", a, b, c, result);
		
		result2 = a * b / (float) c;
		System.out.printf("%d * %d / %d = %1.1f\n", a, b, c, result2);
		
		mok = c / b;
		System.out.printf("4 / 3의 몫은 %d\n", mok);
		
		namugi = c % b;
		System.out.printf("4 / 3의 나머지는 %d\n", namugi);
		
	}

}
