
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12345;
		
		System.out.printf("%d\n", ~a+1);
		//a���� 2�� ���� ���ϱ�
		
		System.out.println();
		
		a = 10;
		System.out.printf("%d �� ���� 1ȸ ����Ʈ�ϸ� %d �̴�.\n", a, a<<1);
		System.out.printf("%d �� ���� 2ȸ ����Ʈ�ϸ� %d �̴�.\n", a, a<<2);
		System.out.printf("%d �� ���� 3ȸ ����Ʈ�ϸ� %d �̴�.\n", a, a<<3);
		//���� ����Ʈ ��� ���ϱ�
		
		System.out.println();
		
		a = 10;
		System.out.printf("%d �� ������ 1ȸ ����Ʈ�ϸ� %d �̴�.\n", a, a>>1);
		System.out.printf("%d �� ������ 2ȸ ����Ʈ�ϸ� %d �̴�.\n", a, a>>2);
		System.out.printf("%d �� ������ 3ȸ ����Ʈ�ϸ� %d �̴�.\n", a, a>>3);
		System.out.printf("%d �� ������ 4ȸ ����Ʈ�ϸ� %d �̴�.\n", a, a>>4);
		//������ ����Ʈ ��� ���ϱ�
	}

}
