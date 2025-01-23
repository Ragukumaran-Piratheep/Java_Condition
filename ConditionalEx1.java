import java.util.Scanner;
public class ConditionalEx1
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Marks: ");
		int marks = sc.nextInt();
		
		if (marks > 50)
		{
			System.out.print("You passed the examination!");
		}
		else{
			System.out.print("Sorry! You failed the examination.");
		}
	}
}