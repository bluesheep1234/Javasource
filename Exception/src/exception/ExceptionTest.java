package exception;


/*Exception �� Error (����-> �ذ� ����-��ǻ�� �ٿ��)
 * 
 * Exception(����)
 * ������ ���� - �ڵ��� �� ��Ÿ��. ��Ŭ�������� �ٷ� �˷��� 
 * ��Ÿ�� ���� - ���� �� �� ��Ÿ�� ���ܻ���
 * 
 */




public class ExceptionTest {

	public static void main(String[] args) {
		
		
		//�������� ���ܡ�
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
		
			//e.printStackTrace();
			//������� ��� �߻��ߴ��� �˷��ܡ�
			System.out.println("�Է� ���� Ȯ�����ּ���");
			
		}
	}

}