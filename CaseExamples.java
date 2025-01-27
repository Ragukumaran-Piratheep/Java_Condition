import java.util.Scanner;
public class CaseExamples
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		String output;
		
		switch(size)
		{
			case 29:
				output = "Small";
				break;
			case 42:
				output = "Medium";
				break;
			case 44:
				output = "Large";
				break;
			case 48:
				output = "Extra Large";
				break;
			default:
				output = "Unknown";
				break;
		}
		System.out.print("Size: "+output);
	}
}
//in here double and float are not worked.
