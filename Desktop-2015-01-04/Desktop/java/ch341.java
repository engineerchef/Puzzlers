public class ch341
{
	public double hesap;
	
	public ch341 (double ilkHesap)
	{
		if(ilkHesap>0.0)
			hesap = ilkHesap;
	}
	
	public void kredi(double miktar)
	{
		hesap = hesap + miktar;
	}
	
	public double alHesap()
	{
		return hesap;
	}
}