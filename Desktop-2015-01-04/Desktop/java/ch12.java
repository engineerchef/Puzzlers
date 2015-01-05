import java.util.Scanner;

public class ch12
{
	public static void main (String[] args)
		{
			Scanner s = new Scanner(System.in);
			
			int a, b;
			
			System.out.print("Sayý Karsilastirma Yapar...\n");
			System.out.print("Birinci sayýyý giriniz : ");
			a = s.nextInt();
			System.out.print("Ýkinci sayiyi giriniz : ");
			b = s.nextInt();
			
			if(a!=b)
				System.out.printf("%d sayýsý %d sayýsýndan farklýdýr ve ",a,b);

				
					if(a<b)
					System.out.printf("%d sayýsý %d sayýsýndan kucuktur.",a,b);
					else if(a>b)
						System.out.printf("%d sayýsý %d sayýsýndan kucuktur.",b,a);
						else if(a==b)
							System.out.printf("%d sayýsý %d sayýsýna esittir.",a,b);
					
							
		}
}