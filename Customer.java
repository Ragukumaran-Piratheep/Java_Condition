public class Customer
{
	private int customerID;
	private int passportNO;
	private String customerName;
	private String address;
	private int emailID;

	
	public (int customerID,int passportNO,String customerName,String address)
	{
		this.customerID = customerID;
		this.passportNO = passportNO;
		this.customerName = customerName;
		this.address = address;
		this.emailID = emailID;
	}
	public int getCustomerID()
	{
		return this.customerID;
	}
	public int setCustomerID()
	{
		this.customerID = customerID;
	}
	public int getPassportNO()
	{
		return this.passportNO;
	}
	public int setPassportNO()
	{
		this.passportNO = passportNO;
	}
	public String getCustomerName()
	{
		return this.customerName;
	}
	public String setCustomerName()
	{
		this.customerName = customerName;
	}
	public String getAddress()
	{
		return this.address;
	}
	public String setAddress()
	{
		this.address = address;
	}
	public int getEmailID()
	{
		return this.emailID;
	}
	public int setEmailID()
	{
		this.emailID = emailID;
	}
	public String toString()
	{
	return("["+"customerID:"+this.customerID+"passportNO:"+this.passportNO+"customerName:"+this.customerName+"address:"+this.address+"emailID:"+this.emailID+"]");
	}
	
}