
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12345;
		
		System.out.printf("%d\n", ~a+1);
		//a값의 2의 보수 구하기
		
		System.out.println();
		
		a = 10;
		System.out.printf("%d 를 왼쪽 1회 시프트하면 %d 이다.\n", a, a<<1);
		System.out.printf("%d 를 왼쪽 2회 시프트하면 %d 이다.\n", a, a<<2);
		System.out.printf("%d 를 왼쪽 3회 시프트하면 %d 이다.\n", a, a<<3);
		//왼쪽 시프트 결과 구하기
		
		System.out.println();
		
		a = 10;
		System.out.printf("%d 를 오른쪽 1회 시프트하면 %d 이다.\n", a, a>>1);
		System.out.printf("%d 를 오른쪽 2회 시프트하면 %d 이다.\n", a, a>>2);
		System.out.printf("%d 를 오른쪽 3회 시프트하면 %d 이다.\n", a, a>>3);
		System.out.printf("%d 를 오른쪽 4회 시프트하면 %d 이다.\n", a, a>>4);
		//오른쪽 시프트 결과 구하기
	}

}
