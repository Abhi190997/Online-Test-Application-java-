package testapp;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class startTest implements ActionListener{
    Test t = new Test();
    JFrame frame2;
    Container c;
    Font f;
    
    JLabel l;
    JButton next,result;
    JRadioButton[] rb = new JRadioButton[5];
    ButtonGroup bg;
    int current = 0,count = 0;
    
    //call to Myframe which extends jFrames 
    startTest(){
    	frame2 = new JFrame("Online Test Program");
    	MyFrame2();
 
    }
    
    //Setting up frames or adding components to frame
    public void MyFrame2() {
    	frame2 = new JFrame("Online Test Program");
		frame2.setVisible(true);
		frame2.setBounds(550,275,750,525);
		frame2.setLayout(null); 
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = frame2.getContentPane();
		f = new Font("Arial",Font.ITALIC,18);
		
		l = new JLabel();
		l.setBounds(50,50,700,30);
		l.setFont(f);
		c.add(l);
		
		bg = new ButtonGroup();
		for(int i=0; i<5; i++) {
			rb[i] = new JRadioButton();
			c.add(rb[i]);
			bg.add(rb[i]);
		}
		
		set();
		
		rb[0].setBounds(60,110,300,20);
		rb[0].setFont(f);
		
		rb[1].setBounds(60,160,300,20);
		rb[1].setFont(f);

		rb[2].setBounds(60,210,300,20);
		rb[2].setFont(f);

		rb[3].setBounds(60,260,300,20);
		rb[3].setFont(f);

		//Button used to select next question
		next = new JButton("Next");
		next.setBounds(300,350,105,40);
		c.add(next);
		next.addActionListener(this);
		
		//Button used to display result
		result = new JButton("Result");
		result.setBounds(300,350,105,40);
		result.setVisible(false);
		result.addActionListener(this);
		c.add(result);
		
		
		
   
	}
    void set() {
    	 rb[4].setSelected(true); 
		 if(current == 0) {
			 l.setText("Que1. Which class is availabel for all class automatically ?");
			 rb[0].setText("Swing");rb[1].setText("Object");rb[2].setText("Applet");rb[3].setText("ActionEvent");
		 }
		 if(current == 1) {
			 l.setText("Que2. Which one among these is not function  of Object class ?");
			 rb[0].setText("toString");rb[1].setText("Finalize");rb[2].setText("getDocumentBase");rb[3].setText("equal");
		 }
		 if(current == 2) {
			 l.setText("Que3. What is the range of byte data type in Java?");
			 rb[0].setText("-128 to 127");rb[1].setText("-32768 to 32767");rb[2].setText("-2147483648 to 2147483647");rb[3].setText("None");
		 }
		 if(current == 3) {
			 l.setText("Que4. Which of these literals can be contained in float data type variable ?");
			 rb[0].setText("-1.7e+308");rb[1].setText("-3.4e+038");rb[2].setText("+1.7e+308");rb[3].setText("-3.4e+050");
		 }
		 if(current == 4) {
			 l.setText("Que5. What is the base of BigDecimal data type ?");
			 rb[0].setText("Base 2");rb[1].setText("Base 8");rb[2].setText("Base 10");rb[3].setText("Base e");
		 }
		 if(current == 5) {
			 l.setText("Que6. Which of these are selection statements in Java ?");
			 rb[0].setText("break");rb[1].setText("for()");rb[2].setText("continue");rb[3].setText("if()");
		 }
		 if(current == 6) {
			 l.setText("Que7. Generics does not work with??");
			 rb[0].setText("Set");rb[1].setText("List");rb[2].setText("Tree");rb[3].setText("Array");
		 }
		 if(current == 7) {
			 l.setText("Que8. How to copy contents of array? ?");
			 rb[0].setText("System.arrayCopy()");rb[1].setText("Array.copy()");rb[2].setText("Arrays.copy()");rb[3].setText("Collection.copy()");
		 }
		 if(current == 8) {
			 l.setText("Que9. Which of these selection statements test only for equality? ?");
			 rb[0].setText("if");rb[1].setText("Switch");rb[2].setText("if & Switch");rb[3].setText("none");
		 }
		 if(current == 9) {
			 l.setText("Que10. Which of these is not a bitwise operator? ?");
			 rb[0].setText("&");rb[1].setText("&=");rb[2].setText("|=");rb[3].setText("<=");
		 }
		 
	}
    //Adding functionality to your buttons
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource() == next)  
        {  
            if(check())  
                count = count+1;  
            current++;  
            set();    
            if(current==9)  
            {  
                next.setVisible(false); 
                result.setVisible(true);
            }  
        }  
      
        if(e.getSource() == result)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            JOptionPane.showMessageDialog(null,"correct ans="+count);
            System.exit(0);
        }  
    } 
    
    //check fuction used to store answer of each question
	boolean check() {
		if(current == 0)
			return(rb[1].isSelected());
		if(current == 1)
			return(rb[1].isSelected());
		if(current == 2)
			return(rb[0].isSelected());
		if(current == 3)
			return(rb[1].isSelected());
		if(current == 4)
			return(rb[2].isSelected());
		if(current == 5)
			return(rb[3].isSelected());
		if(current == 6)
			return(rb[3].isSelected());
		if(current == 7)
			return(rb[0].isSelected());
		if(current == 8)
			return(rb[1].isSelected());
		if(current == 9)
			return(rb[3].isSelected());
		
		return false;
	} 
   
}

