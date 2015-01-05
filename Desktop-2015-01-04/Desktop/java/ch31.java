import java.util.Scanner;

public class ch31
{
	public void mat()
	{
		Scanner s = new Scanner(System.in);
		double a, b, c;
		
		System.out.print("Birinci say� : ");
		a = s.nextDouble();
		System.out.print("�kinci say� : ");
		b = s.nextDouble();
		
		c = Math.pow(a,b);
		System.out.printf("SONU� : %f", c);
	}
}