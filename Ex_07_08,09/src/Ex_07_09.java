
public class Ex_07_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int total = 0;
			int i;
			
			for (i = 1; 1 <=100; i++) {
				total = total + i;
				
				if (total >= 1000)
					break;
			}
			
			System.out.printf("1~1000�� �տ��� ���ʷ� 1000�� �Ѵ� ��ġ��? : %d\n", i);
	}

}
