import java.util.Scanner;

public class Ex_05_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number;
		
		System.out.printf("1 ~ 4 중에 선택하세요 : ");
		number = s.nextInt();
		
		switch (number) {
		case 1 : 
			System.out.printf("1을 선택했습니다. \n");
			break;
		
		
		case 2 : 
			System.out.printf("2를 선택했습니다. \n");
			break;
		
		
		case 3 : 
			System.out.printf("3을 선택했습니다. \n");
			break;
		
		
		case 4 : 
			System.out.printf("4를 선택했습니다. \n");
			break;
			
		default : 
			System.out.printf("잘못된 것을 입력했습니다.");
		}
	}

}
