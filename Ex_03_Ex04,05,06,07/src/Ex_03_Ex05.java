import java.util.Scanner;

public class Ex_03_Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, number = 0;
		String str;
		Scanner s = new Scanner(System.in);
		System.out.printf("�Է����� ���� <1>10 <2>16 <3>8 : ");
		first = s.nextInt();
		
		System.out.printf("�� �Է� : ");
		
		
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
		
		
		System.out.printf("10���� ==> %d\n", number);
		System.out.printf("16���� ==> %x\n", number);
		System.out.printf("8���� ==> %o\n", number);
		}
	}		
	


