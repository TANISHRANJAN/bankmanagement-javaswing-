package Bank;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class SignupTwo extends JFrame implements ActionListener{
	
	//Instance Variable
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField tfPan ,tfAadhar;
	JRadioButton rbnCitizenYes,rbnCitizenNo,rbnAccountYes,rbnAccountNo;
	JComboBox jcbReligion, jcbCategory , jcbIncome , jcbEducation , jcbOccupation;
	
	JButton btnNext;
	
	
	
	
	
	String formno = "";
	
	
	public SignupTwo(String formno) {
		
		this.formno = formno;
		
		setTitle("New Account Application Form- Page 2");
		setLayout(null);
		
		
		
		l2=new JLabel("Additional Details of Customer");
		l2.setFont(new Font("Arial",Font.BOLD,25));
		l2.setBounds(250,80,600,30);
		add(l2);
		
		l3=new JLabel("Religion:");
		l3.setFont(new Font("Arial",Font.BOLD,22));
		l3.setBounds(100,130,200,30);
		add(l3);
		
		String[] religion = {"Hindu","Muslim","Sikh", "Christian" , "Jain" , "Others"};
		jcbReligion  = new JComboBox(religion);
		jcbReligion.setBackground(Color.white);
		jcbReligion.setFont(new Font("Arial" , Font.BOLD,15));
		jcbReligion.setBounds(350,130,300,30);
		add(jcbReligion);
		
		l4=new JLabel("Category: ");
		l4.setFont(new Font("Arial",Font.BOLD,22));
		l4.setBounds(100,180,200,30);
		add(l4);
		
		String category[] = {"General","OBC","SC","ST","Others"};
		jcbCategory = new JComboBox(category);
		jcbCategory.setFont(new Font("Arial" , Font.BOLD,15));
		jcbCategory.setBounds(350,180,300,30);
		add(jcbCategory);
		
		l5=new JLabel("Income: ");
		l5.setFont(new Font("Arial",Font.BOLD,22));
		l5.setBounds(100,230,200,30);
		add(l5);
		
		String income[] = {"Null" , "<1,50,000" , "<5,00,000" , ">5,00,000"};
		jcbIncome = new JComboBox(income);
		jcbIncome.setBackground(Color.white);
		jcbIncome.setBounds(350,230,200,30);
		add(jcbIncome);
		
		l6=new JLabel("Educational ");
		l6.setFont(new Font("Arial",Font.BOLD,22));
		l6.setBounds(100,280,200,30);
		add(l6);
		
		l7=new JLabel("Qualification: ");
		l7.setFont(new Font("Arial",Font.BOLD,22));
		l7.setBounds(100,311,200,30);
		add(l7);

		String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctorate"};
		jcbEducation = new JComboBox(education);
		jcbEducation.setBackground(Color.white);
		jcbEducation.setFont(new Font("Raleway",Font.BOLD,14));
		jcbEducation.setBounds(350,300,300,30);
		add(jcbEducation);
		
		l8=new JLabel("Occupation: ");
		l8.setFont(new Font("Arial",Font.BOLD,22));
		l8.setBounds(100,370,200,30);
		add(l8);
		
		String occupation[] = {"Salaried","Self-Employed","Business","Student"};
		jcbOccupation = new JComboBox(occupation);
		jcbOccupation.setBackground(Color.white);
		jcbOccupation.setFont(new Font("Raleway",Font.BOLD,14));
		jcbOccupation.setBounds(350,370,200,30);
		add(jcbOccupation);
		
		
		l9=new JLabel("PAN Number: ");
		l9.setFont(new Font("Arial",Font.BOLD,22));
		l9.setBounds(100,410,200,30);
		add(l9);
		
		tfPan = new JTextField(15);
		tfPan.setFont(new Font("Arial" , Font.BOLD,15));
		tfPan.setBounds(350,410,300,30);
		add(tfPan);
		
		l10=new JLabel("Aadhar Number: ");
		l10.setFont(new Font("Arial",Font.BOLD,22));
		l10.setBounds(100,460,200,30);
		add(l10);
		
		tfAadhar = new JTextField(15);
		tfAadhar.setFont(new Font("Arial" , Font.BOLD,15));
		tfAadhar.setBounds(350,460,300,30);
		add(tfAadhar);
		
		l11=new JLabel("Senior Citizen: ");
		l11.setFont(new Font("Arial",Font.BOLD,22));
		l11.setBounds(100,510,200,30);
		add(l11);
		
		rbnCitizenYes = new JRadioButton("YES");
		rbnCitizenYes.setFont(new  Font("Tahoma",Font.BOLD,14));
		rbnCitizenYes.setBackground(Color.white);
		rbnCitizenYes.setBounds(350,510,100,30);
		add(rbnCitizenYes);
		
		rbnCitizenNo = new JRadioButton("NO");
		rbnCitizenNo.setFont(new  Font("Tahoma",Font.BOLD,14));
		rbnCitizenNo.setBackground(Color.white);
		rbnCitizenNo.setBounds(450,510,100,30);
		add(rbnCitizenNo);
		
		ButtonGroup bgGender = new ButtonGroup();
		bgGender.add(rbnCitizenYes);
		bgGender.add(rbnCitizenNo);
		
		l12=new JLabel("Exsisting Account: ");
		l12.setFont(new Font("Arial",Font.BOLD,22));
		l12.setBounds(100,560,400,30);
		add(l12);
		
		rbnAccountYes = new JRadioButton("YES");
		rbnAccountYes.setFont(new  Font("Tahoma",Font.BOLD,14));
		rbnAccountYes.setBackground(Color.white);
		rbnAccountYes.setBounds(350,560,100,30);
		add(rbnAccountYes);
		
		rbnAccountNo = new JRadioButton("NO");
		rbnAccountNo.setFont(new  Font("Tahoma",Font.BOLD,14));
		rbnAccountNo.setBackground(Color.white);
		rbnAccountNo.setBounds(450,560,100,30);
		add(rbnAccountNo);
		
		
		
		ButtonGroup bgStatus = new ButtonGroup();
		bgStatus.add(rbnAccountYes);
		bgStatus.add(rbnAccountNo);
		
		
		
		
		btnNext= new JButton("Next");
		btnNext.setFont(new Font("Arial" , Font.BOLD,15));
		btnNext.setBackground(Color.black);
		btnNext.setForeground(Color.white);
		btnNext.setBounds(600,600,80,30);
		add(btnNext);
		btnNext.addActionListener(this);
		
		
		
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setSize(800,700);
		setLocation(400,100);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SignupTwo obj = new SignupTwo("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String religion = (String) jcbReligion.getSelectedItem();
		String category = (String)jcbCategory.getSelectedItem();
		String income = (String)jcbIncome.getSelectedItem();
		String education = (String)jcbEducation.getSelectedItem();
		String occupation = (String)jcbOccupation.getSelectedItem();
		String pan = tfPan.getText();
		String aadhar = tfAadhar.getText();
		String scitizen = "";
		if(rbnCitizenYes.isSelected()) {
			scitizen = "Yes";
		}
		else if(rbnCitizenNo.isSelected()) {
			scitizen = "No";
		}
		
		String eaccount = "";
		if(rbnAccountYes.isSelected()) {
			eaccount = "Yes";
		}
		else if(rbnAccountNo.isSelected()) {
			eaccount = "No";
		}
		
		
		try {
			ConnectionFactory cf  = new ConnectionFactory();
			String query =  "insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
			cf.stmt.executeUpdate(query);
			JOptionPane.showMessageDialog(null, "Congrats");
			
			new SignupThree(formno).setVisible(true);
			setVisible(false);
		}
		catch(Exception ex) {
			ex.printStackTrace(); 
		}
		
		
		
	}

}
