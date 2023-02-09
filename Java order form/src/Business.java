//Programmer: Samuel Greenlee
//Program: Java05 Program Assignment
//Description: This creates an application
//	that allows it's user to submit an
//	on-line order
//Date Created On: 4/16/2020

public class Business
{
	//These are the instance variables
	private String lastName;
	private String firstName;
	private String emailAddress;
	private long creditCardNumber;
	
	//This is the constructor that sets each instance variable
	public Business()
	{		
		lastName = "";
		firstName = "";
		emailAddress = "";
		creditCardNumber = 0L;
	}

	//This is the Constructor that accepts four arguments, and assigns those values into class variables
	public Business(String lastName, String firstName, String emailAddress, int creditCardNumber)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.emailAddress = emailAddress;
		this.creditCardNumber = creditCardNumber;
	}

	//These are the get and set methods
	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getEmailAddress()
	{
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}

	public long getCreditCardNumber()
	{
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber)
	{
		this.creditCardNumber = creditCardNumber;
	}
}
