
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int result;
		
		result = a++;
		System.out.printf("a++ ==> %d\n", a);
		
		result = a--;
		System.out.printf("a-- ==> %d\n", a);
		
		result = a += 5;
		System.out.printf("a+= ==> %d\n", a);
		
		result = a -= 5;
		System.out.printf("a-= ==> %d\n", a);
		
		result = a *= 5;
		System.out.printf("a*= ==> %d\n", a);
		
		result = a /= 5;
		System.out.printf("a/= ==> %d\n", a);
		
		result = a %= 5;
		System.out.printf("a%%= ==> %d\n", a);
	
	}

}
