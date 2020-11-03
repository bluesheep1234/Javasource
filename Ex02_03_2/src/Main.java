import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		int oper;
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Ã¹¹øÂ° °ªÀ» ÀÔ·ÂÇØ ÁÖ¼¼¿ä. ==> ");
		a = s.nextInt();
		
		System.out.print("<1>µ¡¼À <2>»¬¼À <3>°ö¼À <4>³ª´°¼À ==>");
		oper = s.nextInt();
		
		System.out.print("µÎ¹øÂ° °ªÀ» ÀÔ·ÂÇØ ÁÖ¼¼¿ä. ==> ");
		b = s.nextInt();
		
		String op;
		
		if(oper == 1) {
			result = a + b;
			op = " + ";
		}
			
		else if(oper == 2) {
			result = a - b;
			op = " - ";
		}
		
		else if(oper == 3) {
			result = a * b;
			op = " * ";
		}
		
		else  {
			result = a / b;
			op = " / ";
		}
		
		System.out.println(a + op + b + " = " + result);
		}
				
	}

