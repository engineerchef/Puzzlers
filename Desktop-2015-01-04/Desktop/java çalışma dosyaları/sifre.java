//ED�TED BY TOLGA DURAN
package components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;


public class sifre extends JPanel implements ActionListener 
{
    private static String OK = "ok";
    private static String HELP = "help";

    private JFrame controllingFrame;
    private JPasswordField passwordField;

    public void PasswordDemo(JFrame f) {
        controllingFrame = f;

        passwordField = new JPasswordField(10);
        passwordField.setActionCommand(OK);
        passwordField.addActionListener(this);

        JLabel label = new JLabel("Enter the password: ");
        label.setLabelFor(passwordField);

        JComponent buttonPane = createButtonPanel();

        JPanel textPane = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        textPane.add(label);
        textPane.add(passwordField);

        add(textPane);
        add(buttonPane);
    }

    protected JComponent createButtonPanel() {
        JPanel p = new JPanel(new GridLayout(0,1));
        JButton okButton = new JButton("OK");
        JButton helpButton = new JButton("Help");

        okButton.setActionCommand(OK);
        helpButton.setActionCommand(HELP);
        okButton.addActionListener(this);
        helpButton.addActionListener(this);

        p.add(okButton);
        p.add(helpButton);

        return p;
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (OK.equals(cmd)) { 
            char[] input = passwordField.getPassword();
            if (isPasswordCorrect(input)) {
                JOptionPane.showMessageDialog(controllingFrame,
                    "Success! You typed the right password.");
            } else {
                JOptionPane.showMessageDialog(controllingFrame,
                    "Invalid password. Try again.",
                    "Error Message",
                    JOptionPane.ERROR_MESSAGE);
            }

                        Arrays.fill(input, '0');

            passwordField.selectAll();
            resetFocus();
        } else { 
		              JOptionPane.showMessageDialog(controllingFrame,
                "You can get the password by searching this example's\n"
              + "source code for the string \"correctPassword\".\n"
              + "Or look at the section How to Use Password Fields in\n"
              + "the components section of The Java Tutorial.");
        }
    }

      private static boolean isPasswordCorrect(char[] input) {
        boolean isCorrect = true;
        char[] correctPassword = { '1', '2', '3', '4', '5', '6', '7' };

        if (input.length != correctPassword.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals (input, correctPassword);
        }

               Arrays.fill(correctPassword,'0');

        return isCorrect;
    }

   
    protected void resetFocus() {
        passwordField.requestFocusInWindow();
    }

    
    private static void createAndShowGUI() {
        
        JFrame frame = new JFrame("PasswordDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        final PasswordDemo newContentPane = new PasswordDemo(frame);
        newContentPane.setOpaque(true); 
        frame.setContentPane(newContentPane);

       
        frame.addWindowListener(new WindowAdapter() {
            public void windowActivated(WindowEvent e) {
                newContentPane.resetFocus();
            }
        });

        
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                
				UIManager.put("swing.boldMetal", Boolean.FALSE);
		createAndShowGUI();
            }
        });
    }
}
