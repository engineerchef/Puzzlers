import java.util.Scanner;

public class ch12
{
	public static void main (String[] args)
		{
			Scanner s = new Scanner(System.in);
			
			int a, b;
			
			System.out.print("Say� Karsilastirma Yapar...\n");
			System.out.print("Birinci say�y� giriniz : ");
			a = s.nextInt();
			System.out.print("�kinci sayiyi giriniz : ");
			b = s.nextInt();
			
			if(a!=b)
				System.out.printf("%d say�s� %d say�s�ndan farkl�d�r ve ",a,b);

				
					if(a<b)
					System.out.printf("%d say�s� %d say�s�ndan kucuktur.",a,b);
					else if(a>b)
						System.out.printf("%d say�s� %d say�s�ndan kucuktur.",b,a);
						else if(a==b)
							System.out.printf("%d say�s� %d say�s�na esittir.",a,b);
					
							
		}
}