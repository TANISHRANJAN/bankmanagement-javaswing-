package Bank;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener{
	
	//Instance Variable
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField tfName,tfFatherName ,tfEmail,tfAddress,tfCity,tfPin,tfState;
	JRadioButton rbnMale,rbnFemale,rbnMarried,rbnUnmarried,rbnOthers;
	JButton btnNext;
	
	JDateChooser dateChooser;
	
	//JDate
	
	Random r = new Random();
	long randNum = r.nextLong()%9000+100;
	String number = ""+Math.abs(randNum);
	
	
	public Signup() {
		
		setTitle("New Account Application Form");
		setLayout(null);
		
		l1=new JLabel("Application Form: "+number);
		l1.setFont(new Font("Raleway",Font.BOLD,40));
		l1.setBounds(170,20,600,40);
		add(l1);
		
		l2=new JLabel("Personal Details");
		l2.setFont(new Font("Arial",Font.BOLD,25));
		l2.setBounds(250,80,600,30);
		add(l2);
		
		l3=new JLabel("Name:");
		l3.setFont(new Font("Arial",Font.BOLD,22));
		l3.setBounds(100,130,200,30);
		add(l3);
		
		tfName = new JTextField(15);
		tfName.setFont(new Font("Arial" , Font.BOLD,15));
		tfName.setBounds(305,130,300,30);
		add(tfName);
		
		l4=new JLabel("Father Name: ");
		l4.setFont(new Font("Arial",Font.BOLD,22));
		l4.setBounds(100,180,200,30);
		add(l4);
		
		tfFatherName = new JTextField(15);
		tfFatherName.setFont(new Font("Arial" , Font.BOLD,15));
		tfFatherName.setBounds(305,180,300,30);
		add(tfFatherName );
		
		l5=new JLabel("Date of Birth :");
		l5.setFont(new Font("Arial",Font.BOLD,22));
		l5.setBounds(100,230,200,30);
		add(l5);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(305,230,200,30);
		add(dateChooser);
		
		l6=new JLabel("Gender:");
		l6.setFont(new Font("Arial",Font.BOLD,22));
		l6.setBounds(100,280,200,30);
		add(l6);
		
		rbnMale = new JRadioButton("Male");
		rbnMale.setFont(new  Font("Tahoma",Font.BOLD,14));
		rbnMale.setBackground(Color.white);
		rbnMale.setBounds(305,280,100,30);
		add(rbnMale);
		
		rbnFemale = new JRadioButton("Female");
		rbnFemale.setFont(new  Font("Tahoma",Font.BOLD,14));
		rbnFemale.setBackground(Color.white);
		rbnFemale.setBounds(410,280,100,30);
		add(rbnFemale);
		
		ButtonGroup bgGender = new ButtonGroup();
		bgGender.add(rbnMale);
		bgGender.add(rbnFemale);
		
		l7=new JLabel("Email Address: ");
		l7.setFont(new Font("Arial",Font.BOLD,22));
		l7.setBounds(100,330,200,30);
		add(l7);

		tfEmail = new JTextField(15);
		tfEmail.setFont(new Font("Arial" , Font.BOLD,15));
		tfEmail.setBounds(305,330,300,30);
		add(tfEmail);
		
		l8=new JLabel("Marital Status: ");
		l8.setFont(new Font("Arial",Font.BOLD,22));
		l8.setBounds(100,370,200,30);
		add(l8);
		
		rbnMarried = new JRadioButton("Married");
		rbnMarried.setFont(new  Font("Tahoma",Font.BOLD,14));
		rbnMarried.setBackground(Color.white);
		rbnMarried.setBounds(305,370,100,30);
		add(rbnMarried);
		
		rbnUnmarried = new JRadioButton("Unmarried");
		rbnUnmarried.setFont(new  Font("Tahoma",Font.BOLD,14));
		rbnUnmarried.setBackground(Color.white);
		rbnUnmarried.setBounds(410,370,120,30);
		add(rbnUnmarried);
		
		rbnOthers = new JRadioButton("Others");
		rbnOthers.setFont(new  Font("Tahoma",Font.BOLD,14));
		rbnOthers.setBackground(Color.white);
		rbnOthers.setBounds(540,370,100,30);
		add(rbnOthers);
		
		ButtonGroup bgStatus = new ButtonGroup();
		bgStatus.add(rbnMarried);
		bgStatus.add(rbnUnmarried);
		bgStatus.add(rbnOthers);
		
		l9=new JLabel("Address: ");
		l9.setFont(new Font("Arial",Font.BOLD,22));
		l9.setBounds(100,410,200,30);
		add(l9);
		
		tfAddress = new JTextField(15);
		tfAddress.setFont(new Font("Arial" , Font.BOLD,15));
		tfAddress.setBounds(305,410,300,30);
		add(tfAddress);
		
		l10=new JLabel("City: ");
		l10.setFont(new Font("Arial",Font.BOLD,22));
		l10.setBounds(100,460,200,30);
		add(l10);
		
		tfCity = new JTextField(15);
		tfCity.setFont(new Font("Arial" , Font.BOLD,15));
		tfCity.setBounds(305,460,300,30);
		add(tfCity);
		
		l11=new JLabel("Pin Code: ");
		l11.setFont(new Font("Arial",Font.BOLD,22));
		l11.setBounds(100,510,200,30);
		add(l11);
		
		tfPin = new JTextField(15);
		tfPin.setFont(new Font("Arial" , Font.BOLD,15));
		tfPin.setBounds(305,510,300,30);
		add(tfPin);
		
		l12=new JLabel("State: ");
		l12.setFont(new Font("Arial",Font.BOLD,22));
		l12.setBounds(100,560,200,30);
		add(l12);
		
		tfState = new JTextField(15);
		tfState.setFont(new Font("Arial" , Font.BOLD,15));
		tfState.setBounds(305,560,300,30);
		add(tfState);
		
		btnNext= new JButton("Next");
		btnNext.setFont(new Font("Arial" , Font.BOLD,15));
		btnNext.setBackground(Color.black);
		btnNext.setForeground(Color.white);
		btnNext.setBounds(600,600,80,30);
		add(btnNext);
		btnNext.addActionListener(this);
		
		
		
		l13=new JLabel("Date: ");
		l13.setFont(new Font("Arial",Font.BOLD,22));
		l13.setBounds(100,610,200,30);
		add(l13);
		
		l14=new JLabel("Month: ");
		l14.setFont(new Font("Arial",Font.BOLD,22));
		l14.setBounds(100,660,200,30);
		add(l14);
		
		l15=new JLabel("Year: ");
		l15.setFont(new Font("Arial",Font.BOLD,22));
		l15.setBounds(100,720,200,30);
		add(l15);
		
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setSize(800,700);
		setLocation(400,100);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Signup obj = new Signup();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String formNum = number;
		String name = tfName.getText();
		String fname = tfFatherName.getText();
		String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if(rbnMale.isSelected()) {
			gender = "Male";
		}
		else if(rbnFemale.isSelected()) {
			gender = "Female";
		}
		String email  = tfEmail.getText();
		String maritalStatus = null;
		if(rbnMarried.isSelected()) {
			maritalStatus = "Married";
		}
		else if(rbnUnmarried.isSelected()) {
			maritalStatus  = "Unmarried";
		}
		else if(rbnOthers.isSelected()) {
			maritalStatus = "Others";
		}
		String address = tfAddress.getText();
		String city = tfCity.getText();
		String pincode = tfPin.getText();
		String state = tfState.getText();
		
		try {
			if(tfName.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Please enter name : ");
			}
			else {
				ConnectionFactory cf = new ConnectionFactory();
				String query = "insert into signup values('"+formNum +"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritalStatus+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
				cf.stmt.executeUpdate(query);
				
				//JOptionPane.showMessageDialog(null, "Congrats");
				
				//first signup page is hidden
				
				setVisible(false);
				new SignupTwo(formNum).setVisible(true);
			}
			
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		
	}

}
