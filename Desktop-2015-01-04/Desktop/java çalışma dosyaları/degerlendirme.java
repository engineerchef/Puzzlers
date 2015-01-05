import java.util.Scanner;

public class degerlendirme
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.print("Birinci sayiyi giriniz : ");
		x = input.nextInt();
		
		System.out.print("Ikinci sayiyi giriniz : ");
		y = input.nextInt();
		
		if(x==y)
			System.out.printf("%d, %d'ye esittir.\n", x, y);
		if(x!=y)
			System.out.printf("%d, %d'ye esit degildir.\n", x, y);
		if(x>y)
			System.out.printf("%d, %d'den buyuktur.\n", x, y);
		if(x<y)
			System.out.printf("%d, %d'den kucuktur.\n");
		if(x>=y)
			System.out.printf("%d, %d'den büyük ya da esittir.\n", x, y);
		if(x<=y)
			System.out.printf("%d, %d'den kucuk ya da esittir.\n", x, y);
	}
}
