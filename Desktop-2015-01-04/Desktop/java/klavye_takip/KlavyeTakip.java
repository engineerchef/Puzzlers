package events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KlavyeTakip extends JFrame implements KeyListener, ActionListener
{
    JTextArea displayArea;
    JTextField typingArea;
    static final String newline = System.getProperty("line.separator");
    
    public static void main(String[] args) 
    {

        try 
        	{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        	} 
        	catch (UnsupportedLookAndFeelException ex)
        	{
            	ex.printStackTrace();
        	} 
        	catch (IllegalAccessException ex)
        	{
            	ex.printStackTrace();
        	} 
        	catch (InstantiationException ex)
        	{
            	ex.printStackTrace();
        	} 
        	catch (ClassNotFoundException ex) 
        	{
            	ex.printStackTrace();
        	}

        UIManager.put("swing.boldMetal", Boolean.FALSE);

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        	{
            	public void run()
            	{
                	createAndShowGUI();
            	}
        	});
    }

    private static void createAndShowGUI() {

        KlavyeTakip frame = new KlavyeTakip("Klavye Takip");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addComponentsToPane();

        frame.pack();
        frame.setVisible(true);
    }
    
    private void addComponentsToPane() {
        
        JButton button = new JButton("Temizle...");
        button.addActionListener(this);
        
        typingArea = new JTextField(20);
        typingArea.addKeyListener(this);

        typingArea.setFocusTraversalKeysEnabled(false);
        
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setPreferredSize(new Dimension(375, 125));
        
        getContentPane().add(typingArea, BorderLayout.PAGE_START);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(button, BorderLayout.PAGE_END);
    }
    
    public KlavyeTakip(String name)
    {
        super(name);
    }

    public void keyTyped(KeyEvent e) 
    {
        displayInfo(e, "Tu�lanan : ");
    }

    public void keyPressed(KeyEvent e) 
    {
        displayInfo(e, "Bas�lan : ");
    }

    public void keyReleased(KeyEvent e) 
    {
        displayInfo(e, "Sonu� : ");
    }

    public void actionPerformed(ActionEvent e) 
    {
        displayArea.setText("");
        typingArea.setText("");

        typingArea.requestFocusInWindow();
    }

    private void displayInfo(KeyEvent e, String keyStatus)
    {

        int id = e.getID();
        String keyString;
        if (id == KeyEvent.KEY_TYPED) 
        {
            char c = e.getKeyChar();
            keyString = "Tu� karakteri = '" + c + "'";
        } else
        	{
            	int keyCode = e.getKeyCode();
            	keyString = "Tu� kodu = " + keyCode
                    + " ("
                    + KeyEvent.getKeyText(keyCode)
                    + ")";
        	}
        
        int modifiersEx = e.getModifiersEx();
        String modString = "extended modifiers = " + modifiersEx;
        String tmpString = KeyEvent.getModifiersExText(modifiersEx);
        if (tmpString.length() > 0) 
        {
            modString += " (" + tmpString + ")";
        } else
        	{
            	modString += " (no extended modifiers)";
        	}
        
        String actionString = "�zel karakter var m�? ";
        if (e.isActionKey())
        {
            actionString += "EVET";
        } else
        	{
            actionString += "HAYIR";
        	}
        
        String locationString = "Karakter lokasyonu: ";
        int location = e.getKeyLocation();
        if (location == KeyEvent.KEY_LOCATION_STANDARD)
        	{
            locationString += "standard";
        	} else if (location == KeyEvent.KEY_LOCATION_LEFT) 
        		{
            		locationString += "sol";
        		} else if (location == KeyEvent.KEY_LOCATION_RIGHT)
        			{
            			locationString += "sa�";
        			} else if (location == KeyEvent.KEY_LOCATION_NUMPAD)
        				{
            				locationString += "numpad";
        				} else 
        					{ 
            					locationString += "bilinmiyor...";
       						}
        
        					displayArea.append(keyStatus + newline
                			+ "    " + keyString + newline
                			+ "    " + modString + newline
                			+ "    " + actionString + newline
                			+ "    " + locationString + newline);
        					displayArea.setCaretPosition(displayArea.getDocument().getLength());
    }
}
