import java.util.Scanner;

public class ch331
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		ch33 c33 = new ch33();
		
		System.out.printf("Birincil kurs ad� : %s\n\n", c33.alKurs());
		System.out.print("Kurs ad�n� giriniz : ");
		String ad = s.nextLine(); //Burada kurs ad�n�n girilmesi i�in bir "string karakter" tan�mlamas� yap�l�o...
		c33.yapKurs(ad);
		System.out.println(); //Burada fazladan 1 sat�rl�k bo�luk verilio...
		
		c33.goster();
		
	}
}