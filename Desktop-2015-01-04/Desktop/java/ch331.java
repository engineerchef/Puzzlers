import java.util.Scanner;

public class ch331
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		ch33 c33 = new ch33();
		
		System.out.printf("Birincil kurs adý : %s\n\n", c33.alKurs());
		System.out.print("Kurs adýný giriniz : ");
		String ad = s.nextLine(); //Burada kurs adýnýn girilmesi için bir "string karakter" tanýmlamasý yapýlýo...
		c33.yapKurs(ad);
		System.out.println(); //Burada fazladan 1 satýrlýk boþluk verilio...
		
		c33.goster();
		
	}
}