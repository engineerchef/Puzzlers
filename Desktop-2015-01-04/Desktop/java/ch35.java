import javax.swing.*;

public class ch35
{
	public static void main(String args[])
	{
		String giris = JOptionPane.showInputDialog("giri� : ");
		String sonuc = String.format("sonu� ==> %s", giris);
		
		JOptionPane.showMessageDialog(null,sonuc);
	}
}