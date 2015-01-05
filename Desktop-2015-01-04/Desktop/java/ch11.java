import java.util.Scanner;
public class ch11
{
	public static void main (String args[])
	{
		Scanner gir = new Scanner(System.in);
		
		double a, b, c, d, e;
		
		System.out.print("Karesi al�nacak say� : ");
		a = gir.nextDouble();
		System.out.print("K�p� al�nacak say� : ");
		b = gir.nextDouble();
		 
		 c = Math.pow(a,2);
		 d = Math.pow(b,3);
		 e = a+b;
		 
		 System.out.printf("KARE = %f\nKUP = %f\nTOPLAM = %f", c, d, e);
	 
	}
}