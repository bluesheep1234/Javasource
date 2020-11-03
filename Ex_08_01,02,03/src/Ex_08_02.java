import java.util.Scanner;

public class Ex_08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int [] inputs = new int [4];
		
		System.out.printf("1번째 숫자를 입력하세요 : ");
		inputs[0] = s.nextInt();
		System.out.printf("2번째 숫자를 입력하세요 : ");
		inputs[1] = s.nextInt();
		System.out.printf("3번째 숫자를 입력하세요 : ");
		inputs[2] = s.nextInt();
		System.out.printf("4번째 숫자를 입력하세요 : ");
		inputs[3] = s.nextInt();
		
		System.out.printf("합계 : %d", inputs[0]+inputs[1]+inputs[2]+inputs[3]);
	}

}
