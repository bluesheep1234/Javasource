import java.util.Scanner;

public class Ex_08_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int [] inputs = new int [4];
		int total = 0, i;
		
		for (i = 0; i <=3; i++ ) {
			System.out.printf("%d번째 숫자를 입력하세요. ", i+1);
			inputs[i] = s.nextInt();
		}
		total = inputs[0]+inputs[1]+inputs[2]+inputs[3];
		
		System.out.printf("합계 : %d", total);
	}

}
