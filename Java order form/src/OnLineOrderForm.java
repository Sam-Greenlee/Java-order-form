//Programmer: Samuel Greenlee
//Program: Java05 Program Assignment
//Description: This creates an application
//	that allows it's user to submit an
//	on-line order
//Date Created On: 4/16/2020

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OnLineOrderForm extends JFrame {

	//This is the instance variable that is your JPanel
	private JPanel contentPane;
	
	//These are your Text fields
	private JTextField lastNameField;
	private JTextField firstNameField;
	private JTextField emailAddressField;
	private JTextField creditCardNumberField;
	
	//This is the array for the amount of items the user wants
	//which are held in JComboBoxes
	Byte[] items = {1,2,3,4,5,6,7,8,9,10,
			11,12,13,14,15,16,17,18,19,20};
	
	//This is the array for the expiration month
	Byte[] month = {5,6,7,8,9,10,11,12};
	
	//This is the array for the expiration year
	Integer[] year = {2020,2021,2022,2023,2024,2025,2026};
	
	//This instantiates the business class
	Business customer = new Business();
	
	//This adds the desired button to the form. That being what credit card you have
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	//These are your check boxes
	private JCheckBox chckbxSweatshirt;
	private JCheckBox chckbxTShirt;
	private JCheckBox chckbxBallCap;
	private JCheckBox chckbxCoffeeMug;
	
	//These are your radio buttons
	private JRadioButton rdbtnAmericanExpress;
	private JRadioButton rdbtnDiscover;
	private JRadioButton rdbtnMasterCard;
	private JRadioButton rdbtnVisa;
	
	//These are your combo boxes
	private JComboBox comboBoxSweatshirt;
	private JComboBox comboBoxTShirt;
	private JComboBox comboBoxBallCap;
	private JComboBox comboBoxCoffeMug;
	private JComboBox comboBoxExpirationMonth;
	private JComboBox comboBoxExpirationYear;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OnLineOrderForm frame = new OnLineOrderForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OnLineOrderForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Last Name:");
		lblNewLabel.setBounds(10, 66, 82, 50);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		lastNameField = new JTextField();
		lastNameField.setBounds(102, 84, 96, 19);
		contentPane.add(lastNameField);
		lastNameField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name: ");
		lblNewLabel_1.setBounds(208, 72, 94, 39);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1);
		
		firstNameField = new JTextField();
		firstNameField.setBounds(312, 84, 96, 19);
		firstNameField.setText("");
		contentPane.add(firstNameField);
		firstNameField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email Address:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(418, 72, 103, 39);
		contentPane.add(lblNewLabel_2);
		
		emailAddressField = new JTextField();
		emailAddressField.setBounds(531, 84, 96, 19);
		contentPane.add(emailAddressField);
		emailAddressField.setColumns(10);
		
		chckbxSweatshirt = new JCheckBox("Sweatshirt(39.95)");
		chckbxSweatshirt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxSweatshirt.setBounds(10, 122, 137, 21);
		contentPane.add(chckbxSweatshirt);
		
		chckbxTShirt= new JCheckBox("T-Shirt(12.95)");
		chckbxTShirt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxTShirt.setBounds(10, 145, 137, 21);
		contentPane.add(chckbxTShirt);
		
		chckbxBallCap = new JCheckBox("Ball Cap(16.95)");
		chckbxBallCap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxBallCap.setBounds(10, 168, 137, 21);
		contentPane.add(chckbxBallCap);
		
		chckbxCoffeeMug = new JCheckBox("Coffee Mug(7.95)");
		chckbxCoffeeMug.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxCoffeeMug.setBounds(10, 191, 137, 21);
		contentPane.add(chckbxCoffeeMug);
		
		comboBoxSweatshirt = new JComboBox(items);
		comboBoxSweatshirt.setBounds(147, 124, 137, 21);
		contentPane.add(comboBoxSweatshirt);
		
		comboBoxTShirt = new JComboBox(items);
		comboBoxTShirt.setBounds(147, 147, 137, 21);
		contentPane.add(comboBoxTShirt);
		
		comboBoxBallCap = new JComboBox(items);
		comboBoxBallCap.setBounds(147, 172, 137, 21);
		contentPane.add(comboBoxBallCap);
		
		comboBoxCoffeMug = new JComboBox(items);
		comboBoxCoffeMug.setBounds(147, 195, 137, 21);
		contentPane.add(comboBoxCoffeMug);
		
		rdbtnAmericanExpress = new JRadioButton("American Express", true);
		buttonGroup.add(rdbtnAmericanExpress);
		rdbtnAmericanExpress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnAmericanExpress.setBounds(312, 124, 143, 21);
		contentPane.add(rdbtnAmericanExpress);
		
		rdbtnDiscover = new JRadioButton("Discover");
		buttonGroup.add(rdbtnDiscover);
		rdbtnDiscover.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnDiscover.setBounds(312, 147, 143, 21);
		contentPane.add(rdbtnDiscover);
		
		rdbtnMasterCard = new JRadioButton("Master Card");
		buttonGroup.add(rdbtnMasterCard);
		rdbtnMasterCard.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnMasterCard.setBounds(312, 170, 143, 21);
		contentPane.add(rdbtnMasterCard);
		
		rdbtnVisa = new JRadioButton("VISA");
		buttonGroup.add(rdbtnVisa);
		rdbtnVisa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnVisa.setBounds(312, 195, 143, 21);
		contentPane.add(rdbtnVisa);
		
		JLabel lblNewLabel_3 = new JLabel("Credit Card Number");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 253, 137, 13);
		contentPane.add(lblNewLabel_3);
		
		creditCardNumberField = new JTextField();
		creditCardNumberField.setBounds(157, 252, 145, 19);
		contentPane.add(creditCardNumberField);
		creditCardNumberField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Expiration Month:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(312, 253, 135, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Expiration Year:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(445, 253, 122, 13);
		contentPane.add(lblNewLabel_4_1);
		
		comboBoxExpirationMonth = new JComboBox(month);
		comboBoxExpirationMonth.setBounds(312, 292, 103, 21);
		contentPane.add(comboBoxExpirationMonth);
		
		comboBoxExpirationYear = new JComboBox(year);
		comboBoxExpirationYear.setBounds(445, 292, 103, 21);
		contentPane.add(comboBoxExpirationYear);
		
		//This is the creation of your submit button, as well as the call for the data validation method
		JButton btnSubmitButton = new JButton("Submit Order");
		btnSubmitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				boolean errorCheck = isValidData();
			    
			    if(errorCheck)
			     calculate(customer);
			}
		});
		btnSubmitButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSubmitButton.setBounds(48, 334, 164, 68);
		contentPane.add(btnSubmitButton);
		}
		
		//This is the method that checks for data validation
		public boolean isValidData()
		{
			return SwingValidator.isPresent(lastNameField, "Last Name")
					&& SwingValidator.isPresent(firstNameField, "First Name")
					&& SwingValidator.isPresent(emailAddressField, "Email Address")
					&& SwingValidator.isLong(creditCardNumberField, "Credit Card Number")
					&& SwingValidator.isWithinRangeLong(creditCardNumberField, 1111111111111111L,
							9999999999999999L, "Credit Card Number");	  
		}
		
		//This whole method calculates and displays all what is needed for the desired output
		public void calculate(Business customer)
		  {
			//This configures the data that was entered
			customer.setLastName(lastNameField.getText());
			customer.setFirstName(firstNameField.getText());
			customer.setEmailAddress(emailAddressField.getText());
			customer.setCreditCardNumber(Long.parseLong(creditCardNumberField.getText()));
			
			//This Initializes the necessary variables for the following calculations
			float total = 0F;
			float sweatshirtPrice = 0F;
			float tShirtPrice = 0F;
			float ballCapPrice = 0F;
			float coffeeMugPrice = 0F;
			String formatedTotal = "";
			
			//This series of if statements calculates the total of the desired amount of items the customer wants
			if(chckbxSweatshirt.isSelected())
			{
				sweatshirtPrice = (byte)comboBoxSweatshirt.getSelectedItem() * 39.95F;
				
				total += sweatshirtPrice;
				
			}
			if(chckbxTShirt.isSelected())
			{
				tShirtPrice = (byte)comboBoxTShirt.getSelectedItem() * 12.95F;
				
			}	total += tShirtPrice;
			if(chckbxBallCap.isSelected())
			{
				ballCapPrice = (byte)comboBoxBallCap.getSelectedItem() * 16.95F;
				
				total += ballCapPrice;
			}
			if(chckbxCoffeeMug.isSelected())
			{
				coffeeMugPrice = (byte)comboBoxCoffeMug.getSelectedItem() * 7.95F;
				
				total += coffeeMugPrice;
			}
			
			//This if statement calculates the shipping
			if(total < 50.00F)
			{
				total += 7.97F;
			}
			
			//This determines what credit card the user has chosen.
			//It then will add the choice to a variable
			
			//Variable used to store desired credit card type
			String creditCardType = "";
			
			if(rdbtnAmericanExpress.isSelected())
			{
				creditCardType = "American Express";
			}
			else if(rdbtnDiscover.isSelected())
			{
				creditCardType = "Discover";
			}
			else if(rdbtnMasterCard.isSelected())
			{
				creditCardType = "Master Card";
			}
			else
			{
				creditCardType = "Visa";
			}
			
			//This formats the total price for the user to see later in the dialog box
			formatedTotal = SwingValidator.formatRoundDollar(total);
			
			//This is the dialog box that will display when you submit a successfully created order
			JOptionPane.showMessageDialog(this,
					"Last Name: " + customer.getLastName()
					+ "\nFirst Name: " + customer.getFirstName()
					+ "\nEmail Address: " + customer.getEmailAddress()
					+ "\nCredit Card Number: " + customer.getCreditCardNumber()
					+ "\n" + formatedTotal + " will be charged to your " + creditCardType
					+ "\nWhen it arrives, we will notify you by Email",
					"Thank you for placing an order", JOptionPane.INFORMATION_MESSAGE);
		  }
}
