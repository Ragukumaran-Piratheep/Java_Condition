import java.util.Scanner;
public class Salary
{
	public static void main(String [] args)
	{
		double currentSalary;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		System.out.print("1=Excellent 2=Good and 3=Poor");
		System.out.print("Enter the performance rating: ");
		double rating = scan.nextDouble();
		
		
		if (rating ==1)
		{
			double raise = currentSalary*6/100;
			System.out.println ("Amount of your raise: $"+ raise);
			System.out.println ("Your new salary: $"+ (currentSalary + raise));
			
		} else if (rating ==2)
		{
			double raise = currentSalary*4/100;
			System.out.println ("Amount of your raise: $"+ raise);
			System.out.println ("Your new salary: $"+ (currentSalary + raise));
			
		} else if (rating ==3)
		{
			double raise = currentSalary*1.5/100;
			System.out.println ("Amount of your raise: $"+ raise);
			System.out.println ("Your new salary: $"+ (currentSalary + raise));
		}
		
		
	}
}
