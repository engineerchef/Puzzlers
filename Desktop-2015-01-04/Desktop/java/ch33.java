public class ch33
{
	private String kurs;
	
	public void yapKurs(String isim)
	{
		kurs = isim;
	}
	
	public String alKurs()
	{
		return kurs;
	}
	
	public void goster()
	{
		System.out.printf("\"%s\" kursuna giriþ!!!\n", alKurs());
	}
}