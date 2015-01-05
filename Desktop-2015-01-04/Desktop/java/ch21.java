//1 den ba�layarak girilen say� de�erine kadar olan say�lar�n karesini ve k�p�n� al�r...

import java.util.Scanner;

public class ch21
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		int a, b, c, d;

		System.out.print("Bir Say�y� Giriniz : ");
		a = s.nextInt();
		System.out.print("\nSay�\tKaresi\tKubu\n");
		System.out.print("____\t______\t____\n\n");
				
		for(b=1; b<=a; b++)
		{
			c = b*b;
			d = b*b*b;
			System.out.printf("%d\t\t%d\t\t%d\n",b, c, d);
		}
		
	}
}