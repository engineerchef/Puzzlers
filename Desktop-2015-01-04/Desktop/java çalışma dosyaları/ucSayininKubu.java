import java.util.Scanner;

public class ucSayininKubu
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int sonuc;

		System.out.print("Birinci sayiyi giriniz : ");
		x = input.nextInt();
		System.out.print("Ikinci sayiyi giriniz : ");
		y = input.nextInt();
		System.out.print("Ucuncu sayiyi giriniz : ");
		z = input.nextInt();

		sonuc = x * x * x + y * y * y + z * z * z;		
				
		System.out.printf("SONUC = %d", sonuc);
		
	}
}