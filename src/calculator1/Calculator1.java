/*
 * 
 * Simple calculator
 * 
 */

package calculator1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

class Calculator1 extends JFrame implements ActionListener{
    //create a frame 
    static JFrame f;
    //create text field
    static JTextField l; 
    //operator and operands
    String s0, s1, s2;
   
    //def. constructor
    Calculator1() 
	{ 
		s0 = s1 = s2 = ""; 
	} 
    //main 
    public static void main(String[] args) {
      
        // create a frame 
		f = new JFrame("calculator"); 

        try { 
			// set look and feel 
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
		} 
		catch (Exception e) { 
			System.err.println(e.getMessage()); 
		} 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
