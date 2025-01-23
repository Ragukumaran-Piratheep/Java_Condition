import java.util.Scanner;
public class Statement
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the prevoius balance: ");
		double previousBalance = sc.nextDouble();
		
		System.out.print("Enter the additinal charges: ");
		double additionalCharge = sc.nextDouble();
		double totalNewBalance;
		double interest;
		
		if (previousBalance == 0)
		{
			totalNewBalance = additionalCharge;
			
		} else 
		{
			interest = (previousBalance + additionalCharge)*0.02;
			totalNewBalance = 
		}
	}
}