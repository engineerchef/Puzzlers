import java.util.Random;

public class Round
{
	public static void main(String[] args)
		{
			Random rnd = new Random();
			
			System.out.println("Sayýyý giriniz: ");
			int i = rnd.nextInt();
			
			if (Math.round((double) i) != i)
				System.out.println("Ground Round");
		}
}