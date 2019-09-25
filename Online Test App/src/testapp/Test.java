
package testapp;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Test implements ActionListener{
	  
	JFrame frame1,frame2;
	JButton start,exit;
	JLabel label1,label2;
	Container c;
	Font f;
	public void MyFrame1() {
		frame1 = new JFrame("Online Test Program");
		frame1.setVisible(true);
		frame1.setResizable(false);
		frame1.setBounds(650,300,600,400);
		frame1.setLayout(null);
		
		c = frame1.getContentPane();
		c.setLayout(null);
		
		f = new Font("Arial",Font.ITALIC,24);
				
		label1 = new JLabel();
		label1.setText("!!Welcome!!");
		label1.setBounds(230,70,300,30);
		label1.setFont(f);
		c.add(label1);
		
		
		label2 = new JLabel();
		label2.setText("** Wanna! Test Your Skill **");
		label2.setBounds(128,120,350,30);
		label2.setFont(f);
		c.add(label2);
		
		start = new JButton("Start");
		start.setBounds(150,200,100,40);
		start.addActionListener(this);
		c.add(start);
		
		exit = new JButton("Exit");
		exit.setBounds(350,200,100,40);
		exit.addActionListener(this);
		c.add(exit);
		
		
	} 
  
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == exit) {
			System.exit(0);
		}
		if(e.getSource() == start) {
			frame1.setVisible(false);
			startTest ts = new startTest();
		}
		
		
	}
	
	public static void main(String[] args) {
		Test t  = new Test();
		t.MyFrame1();
	}

	
}