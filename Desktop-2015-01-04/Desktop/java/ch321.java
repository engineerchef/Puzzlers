import java.util.Scanner;

public class ch321
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		ch32 c32 = new ch32();
		
		int a,b,c;
		
		System.out.print("Birinci sayý : ");
		a = s.nextInt();
		System.out.print("Ýkinci sayý : ");
		b = s.nextInt();
		
		c = a + b ;
		
		c32.ver(c);
		
	}
}