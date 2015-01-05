import java.util.Scanner;

public class sayiKareKup1
{
	public static void main (String args[])
	{
		Scanner input = new Scanner (System.in);
		
		int x;
		int y;
		int sayac;
		int kare;
		int kup;
		
		System.out.print("******************************************\n");
		System.out.print("*GÝRÝLEN SAYININ KARESÝ VE KÜPÜNÜ ALIR!!!*\n");
		System.out.print("******************************************\n\n");
		
		System.out.print("Birinci sayiyi giriniz : ");
		x = input.nextInt();
		
		System.out.print("Ikinci sayiyi giriniz : ");
		y = input.nextInt();
		
		System.out.print("SAYI\tKARESI\t\tKUBU\n");
		System.out.print("----\t------\t\t----\n");
		
		for (sayac=x; sayac<=y; sayac++)
		{
			x = sayac;
			kare = sayac * sayac;
			kup = sayac * sayac * sayac;
			System.out.printf("%d\t\t%d\t\t\t%d\n", x, kare, kup);
		}
	}
}