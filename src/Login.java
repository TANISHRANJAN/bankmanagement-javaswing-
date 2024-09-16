package Bank;
import javax.swing.*;//for classes that start with J
import java.awt.*;//for color , font class etc
import java.awt.event.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener{
	//Instance Variable
	JLabel lblWelcome,lblCardNumber,lblPinNumber;
	JTextField tfCardNumber;
	JPasswordField pfPinNumber;
	JButton btnLogin,btnClear,btnSignup;
	//constructor
	public Login() {
		setTitle("Bank Management System");
		//to disable the default layout of frame
		setLayout(null);
		
		
		lblWelcome=new JLabel("Welcome to Bank System");
		lblWelcome.setFont(new Font("Ariel",Font.BOLD,35));
		lblWelcome.setBounds(200,40,530,40);//location of label x-axis , y-axis , layout width and height
		add(lblWelcome);
		
		lblCardNumber=new JLabel("Enter Card No.:");
		lblCardNumber.setFont(new Font("Tahoma",Font.BOLD,25));
		lblCardNumber.setBounds(120,150,400,30);//location of label x-axis , y-axis , layout width and height
		add(lblCardNumber);
		
		tfCardNumber = new JTextField(20);
		tfCardNumber.setBounds(350,150,230,30);
		tfCardNumber.setFont(new Font("Tahoma",Font.BOLD,15));
		add(tfCardNumber);
		
		lblPinNumber=new JLabel("Enter PIN No.:");
		lblPinNumber.setFont(new Font("Tahoma",Font.BOLD,25));
		lblPinNumber.setBounds(120,250,400,30);//location of label x-axis , y-axis , layout width and height
		add(lblPinNumber);
		
		pfPinNumber = new JPasswordField(20);
		pfPinNumber.setBounds(350,250,230,30);
		pfPinNumber.setFont(new Font("Tahoma",Font.BOLD,15));
		add(pfPinNumber);
		
		btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.black);
		btnLogin.setForeground(Color.white);
		
		btnClear = new JButton("Clear");
		btnClear.setBackground(Color.black);
		btnClear.setForeground(Color.white);
		
		btnSignup = new JButton("Sign Up");
		btnSignup.setBackground(Color.black);
		btnSignup.setForeground(Color.white);
		
		btnLogin.setFont(new Font("Tahoma",Font.BOLD,15));
		btnLogin.setBounds(300,300,100,40);
		add(btnLogin);
		
		btnClear.setFont(new Font("Tahoma",Font.BOLD,15));
		btnClear.setBounds(400,300,100,40);
		add(btnClear);
		
		btnSignup.setFont(new Font("Tahoma",Font.BOLD,15));
		btnSignup.setBounds(500,300,100,40);
		add(btnSignup);
		
		//for Listener package
		btnLogin.addActionListener(this);
		btnClear.addActionListener(this);
		btnSignup.addActionListener(this);
		
		
		getContentPane().setBackground(Color.white);//changing the background color
		setVisible(true);//shows the title in the frame
		setSize(800,500);//length and height in pixels
		setLocation(400,200);//shows the pop up window in the desired location of the screen
	}

	public static void main(String[] args) {
		// Creating login class object
		Login obj = new Login();

	}

	//this method is automatically called upon button
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		try {
			if(ae.getSource()==btnLogin) {
				//for login purpose
				ConnectionFactory cf = new ConnectionFactory();
				String cardNum = tfCardNumber.getText();
				String pin = pfPinNumber.getText();
				
				String query = "Select * from Login where cardnumber = '"+cardNum+"' and pin = '"+pin+"'";
				ResultSet rs = cf.stmt.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					new Transactions(pin).setVisible(true);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Either card number or pin is wrong");
				}
			}
			else if(ae.getSource()==btnClear) {
				//for clear button
				tfCardNumber.setText("");
				pfPinNumber.setText("");
			}
			else if(ae.getSource()==btnSignup) {
				//for sign up purpose
				this.setVisible(false);
				new Signup();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
