import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
			
		int [] inputs = new int [4];
		int total = 0, i;
			
		for (i = 0; i <=inputs.length; i++ ) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ���. ", i);
			inputs[i] = s.nextInt();
		}
		for(i = 0; i <= inputs.length; ++i)
			total += inputs[i];
			
		System.out.printf("�հ� : %d", total);
	}

}
