import java.util.Scanner;
public class Vowels
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char vowel = sc.next().charAt(0);
		String character;

		switch (vowel)
		{	
			case 'A':
				character = "Vowel";
				break;
			case 'E':
				character = "Vowel";
				break;
			case 'I':
				character = "Vowel";
				break;
			case 'O':
				character = "Vowel";
				break;
			case 'U':
				character = "Vowel";
				break;
			
			default:
				character= "Not a vowel";
				break;
		}
		System.out.print("It is "+ character);
		
	}
}