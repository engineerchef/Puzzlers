import java.util.Scanner;

public class ch1
{
public static void main (String[] args)
{
	Scanner s = new Scanner(System.in);
	int a, b, c;
	System.out.print("Birinci say�: ");
	a=s.nextInt();
	System.out.print("�kinci say�: ");
	b=s.nextInt();
	c=a+b;
	System.out.printf("Sonu� = %d",c);
}
}