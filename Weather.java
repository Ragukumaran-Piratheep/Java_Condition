import java.util.Scanner;
public class Weather
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the curent temperature: ");
		double temp = sc.nextDouble();

		if (temp >= 80)
		{  
			System.out.print("This time for Swimming");
		}
		else if(temp >= 60 && temp < 80){
			System.out.print("This time for tennis");
	}
		else if(temp >= 40 && temp < 60){
			System.out.print("this time for golf");
}
		else {
			System.out.print("This time for skiing");
}
	}
}