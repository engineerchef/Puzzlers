import java.util.Scanner;

public class ch1
{
public static void main (String[] args)
{
	Scanner s = new Scanner(System.in);
	int a, b, c;
	System.out.print("Birinci sayý: ");
	a=s.nextInt();
	System.out.print("Ýkinci sayý: ");
	b=s.nextInt();
	c=a+b;
	System.out.printf("Sonuç = %d",c);
}
}