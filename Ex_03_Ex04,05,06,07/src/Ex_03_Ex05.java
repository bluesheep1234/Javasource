import java.util.Scanner;

public class Ex_03_Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, number = 0;
		String str;
		Scanner s = new Scanner(System.in);
		System.out.printf("입력진수 결정 <1>10 <2>16 <3>8 : ");
		first = s.nextInt();
		
		System.out.printf("값 입력 : ");
		
		
		if (first == 1) {
			str = s.next();
			number = Integer.parseInt(str, 10);
		}
	    if (first == 2) {
			str = s.next();
			number = Integer.parseInt(str, 16);	
		}
		if (first == 3) {
			str = s.next();
			number = Integer.parseInt(str, 8);	
		}
		
		
		System.out.printf("10진수 ==> %d\n", number);
		System.out.printf("16진수 ==> %x\n", number);
		System.out.printf("8진수 ==> %o\n", number);
		}
	}		
	


