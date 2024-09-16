package Bank;

import java.awt.event.*;
import java.util.Random;
import java.awt.*;

import javax.swing.*;

public class SignupThree extends JFrame implements ActionListener{

	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4;
	JButton b1,b2;
	String formno;
	
	public SignupThree(String formno) {
		this.formno = formno;
		
		setTitle("New Account Application Form-Page-3");
		
		setLayout(null);
		l1=new JLabel("Page-3: Account Details");
		l1.setFont(new Font("Arial",Font.BOLD,25));
		l1.setBounds(280,40,400,40);
		add(l1);
		
		l2=new JLabel("Account Type: ");
		l2.setFont(new Font("Raleway",Font.BOLD,18));
		l2.setBounds(100,140,200,30);
		add(l2);
		
		r1=new JRadioButton("Saving Account");
		r1.setFont(new Font("raleway",Font.BOLD,16));
		r1.setBackground(Color.white);
		r1.setBounds(100,180,150,30);
		add(r1);
		
		r2=new JRadioButton("Fixed Deposit Account");
		r2.setFont(new Font("raleway",Font.BOLD,16));
		r2.setBackground(Color.white);
		r2.setBounds(350,180,250,30);
		add(r2);
		
		r3=new JRadioButton("Current Account");
		r3.setFont(new Font("raleway",Font.BOLD,16));
		r3.setBackground(Color.white);
		r3.setBounds(100,220,150,30);
		add(r3);
		
		r4=new JRadioButton("Recurring Deposit Account");
		r4.setFont(new Font("raleway",Font.BOLD,16));
		r4.setBackground(Color.white);
		r4.setBounds(350,220,250,30);
		add(r4);
		
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);
		bg1.add(r4);
		
		

		l3=new JLabel("Card Number");
		l3.setFont(new Font("Raleway",Font.BOLD,18));
		l3.setBounds(100,300,200,30);
		add(l3);
		

		l4=new JLabel("XXXX-XXXX-XXXX-9876");
		l4.setFont(new Font("Raleway",Font.BOLD,18));
		l4.setBounds(350,300,250,30);
		add(l4);
		

		l5=new JLabel("[Yout 16-digit card Number] ");
		l5.setFont(new Font("Raleway",Font.BOLD,12));
		l5.setBounds(100,330,300,30);
		add(l5);
		
		l6=new JLabel("It Would be visible on ATM CARD");
		l6.setFont(new Font("Raleway",Font.BOLD,18));
		l6.setBounds(350,330,500,20);
		add(l6);
		
		l7=new JLabel("PIN Number");
		l7.setFont(new Font("Raleway",Font.BOLD,18));
		l7.setBounds(100,370,200,30);
		add(l7);
		
		l8=new JLabel("XXXX");
		l8.setFont(new Font("Raleway",Font.BOLD,18));
		l8.setBounds(350,370,200,30);
		add(l8);
		
		l9=new JLabel("[Your 4-digit password]");
		l9.setFont(new Font("Raleway",Font.BOLD,12));
		l9.setBounds(100,400,200,20);
		add(l9);
		
		l10=new JLabel("Service Required By You: ");
		l10.setFont(new Font("Raleway",Font.BOLD,18));
		l10.setBounds(100,450,350,30);
		add(l10);
		
		c1 = new JCheckBox("ATM card");
		c1.setBackground(Color.white);
		c1.setFont(new Font("Arial",Font.BOLD,16));
		c1.setBounds(100,500,200,30);
		add(c1);
		
		c2 = new JCheckBox("Internet Banking");
		c2.setBackground(Color.white);
		c2.setFont(new Font("Arial",Font.BOLD,16));
		c2.setBounds(350,500,200,30);
		add(c2);
		
		c3 = new JCheckBox("Mobile Banking");
		c3.setBackground(Color.white);
		c3.setFont(new Font("Arial",Font.BOLD,16));
		c3.setBounds(100,550,200,30);
		add(c3);
		
		c4 = new JCheckBox("E-mail Alerts");
		c4.setBackground(Color.white);
		c4.setFont(new Font("Arial",Font.BOLD,16));
		c4.setBounds(350,550,200,30);
		add(c4);
		
		
		b1 = new JButton("Submit");
		b1.setFont(new Font("Ariel",Font.BOLD,15));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(250,620,100,30);
		add(b1);
		
		b2 = new JButton("cancel");
		b2.setFont(new Font("Ariel",Font.BOLD,15));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(420,620,100,30);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
		setSize(850,750);
		setLocation(350,120);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignupThree("");

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String atype = null;
		if(r1.isSelected()) {
			atype = "Saving account";
		}
		else if(r2.isSelected()) {
			atype = "Fixed Deposit Account";
		}
		else if(r3.isSelected()) {
			atype = "Current Account";
		}
		else if(r4.isSelected()) {
			atype = "Recurring Deposit Account";
		}
		
		Random random = new Random();
		long num1 = (random.nextLong()%90000000L)+504093600000000L;
		String cardNum = ""+Math.abs(num1);
		
		long num2 = (random.nextLong()%9000L)+1000L;
		String pinNum = ""+Math.abs(num2);
		
		String facility  = "";
		if(c1.isSelected()) {
			facility = facility+"ATM Card";
		}
		if(c2.isSelected()) {
			facility = facility+"Internet Banking";
		}
		if(c3.isSelected()) {
			facility = facility+"Mobile Banking";
		}
		if(c4.isSelected()) {
			facility = facility+"Email Alerts";
		}
		
		
		try {
			if(ae.getSource()==b1) {
				if(atype.equals("")) {
					JOptionPane.showMessageDialog(null,"Please Select the Account Type");
				}
				else {
					ConnectionFactory con = new ConnectionFactory();
					String query1 = "insert into Signupthree values('"+formno+"','"+atype+"','"+cardNum+"','"+pinNum+"','"+facility+"')";
					String query2 = "insert into Login values('"+formno+"','"+cardNum+"','"+pinNum+"')";
					con.stmt.executeUpdate(query1);
					con.stmt.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null, "Card Number : "+cardNum +"\n PIN : "+pinNum);
					
				}
			}
			else if(ae.getSource()==b2) {
				System.exit(0);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}

}
