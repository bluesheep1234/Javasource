import java.util.Scanner;
import java.io.IOException;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		
	
		Scanner s =new Scanner(System.in);
	
		System.out.print("ù��° ���� �Է����ּ���. ==>");
		int first = s.nextInt();
		
		System.out.print("+ - * / % ==>");
		char operator = (char)System.in.read();
		
		System.out.print("�ι�° ���� �Է����ּ���. ==>");
		int second = s.nextInt();
		
		int result;
		boolean b = true;
		String op;
		if(operator == '+') {
				result = first + second;
				op = "+";
		}
				else if(operator == '-') {
				result = first - second;
				op = "-";						
				}		
				else if(operator == '*') {
					result = first * second;
					op = "*";						
					}		
				
				else if(operator == '/') {
					if(second == 0)
							{System.out.println("0���� ���� �� �����ϴ�.");
					
					result = 0;	
					b = false;
							}

							else
								result = first / second;
							op = "/";
						}
						else {
							if(second == 0) {
								System.out.println("0���� ������ ������ ���� �ȳ��ɴϴ�.");
								result = 0;
								b = false;
							}
							else
								result = first % second;
							op = "%";
						}
						if(b == true) {
							System.out.println(first + op + second + " = " + result);
						}
	}
}				