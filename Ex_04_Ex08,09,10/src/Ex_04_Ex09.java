import java.util.Scanner;

public class Ex_04_Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int result;
		int coin500;
		int coin100;
		int coin10;
		
		System.out.printf(" ## 교환할 돈은 ? ");
		int money = s.nextInt();
		
		coin500 = money/500;
		money = money % 500;
		
		coin100 = money/100;
		money = money % 100;
		
		coin10 = money/10;
		money = money % 10;
		
		
		
		
		
		
		System.out.printf("500원짜리 ==> %d 개 \n", coin500);
		System.out.printf("100원짜리 ==> %d 개 \n", coin100);
		System.out.printf("10원짜리 ==> %d 개 \n", coin10);
		System.out.printf("바꾸지 못한 잔돈 ==> %d 원 \n", money);
		
		
		
		
	}

}
