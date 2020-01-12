/*
 * 
 * Simple calculator
 * 
 */

package calculator1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
                //create a object of class
                Calculator1 c = new Calculator1();
                
                //create a text file
                l = new JTextField(16);
                
                l.setEditable(false);
                //number buttons and operators
                JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,ba,bs,bd,bm,be,beq,beq1;
                
                //create number buttons
                b0 = new JButton("0");
                b1 = new JButton("1");
                b2 = new JButton("2");
                b3 = new JButton("3");
                b4 = new JButton("4");
                b5 = new JButton("5");
                b6 = new JButton("6");
                b7 = new JButton("7");
                b8 = new JButton("8");
                b9 = new JButton("9");
                
                //equals button
                beq1 = new JButton("=");
                
                //operator buttons
                ba = new JButton("+");
                bs = new JButton("-");
                bd = new JButton("/");
                bm = new JButton("*");
                beq = new JButton("C");
                
                //create . button
                be = new JButton(".");
                
                //create panel
                JPanel p = new JPanel();
                
                
                //add action list.
                bm.addActionListener(c);
                bd.addActionListener(c);
                bs.addActionListener(c);
                ba.addActionListener(c);
                b9.addActionListener(c);
                b8.addActionListener(c);
                b7.addActionListener(c);
                b6.addActionListener(c);
                b5.addActionListener(c);
                b4.addActionListener(c);
                b3.addActionListener(c);
                b2.addActionListener(c);
                b1.addActionListener(c);
                b0.addActionListener(c);
                be.addActionListener(c);
                beq.addActionListener(c);
                beq1.addActionListener(c);
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
