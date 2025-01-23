import java.util.Scanner;
public class IfElse
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your gpa: ");
		float gpa = sc.nextFloat();
		
		if ( gpa >= 3.5 && gpa <=4)
		{
			System.out.print("Congratulations-You made the Dean;s list");
		}
		else 
		{
			System.out.print("Sorry yiu didn't make the Dean's list");
		}
	}
}