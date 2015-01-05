import java.util.Scanner;

public class ch342
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		ch341 c341 = new ch341(50.00);
		ch341 c342 = new ch341(-7.80);
		double depozito;
		
		System.out.printf("c341'in hesabý  = $%.2f TL\n", c341.alHesap());
		System.out.printf("c342'nin hesabý = $%.3f TL\n", c342.alHesap());
						
		System.out.print("\nc341 için depozito miktarýný giriniz: ");
		depozito = s.nextDouble();
		System.out.printf("\nc341 hesabýna eklenen miktar : %.2f\n\n", depozito);
		c341.kredi(depozito);
		
		System.out.printf("c341 hesabý: %.2f TL\n", c341.alHesap());
		System.out.printf("c342 hesabý: %.2f TL\n\n", c342.alHesap());
		
		System.out.print("\nc342 için depozito miktarýný giriniz: ");
		depozito = s.nextDouble();
		System.out.printf("\nc342 hesabýna eklenen miktar : %.2f\n\n", depozito);
		c342.kredi(depozito);
		
		System.out.printf("c341'deki miktar : %.2f TL\n", c341.alHesap());
		System.out.printf("c342'deki miktar : %.2f TL\n", c342.alHesap());
		
	}
}