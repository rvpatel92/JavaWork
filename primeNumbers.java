import java.util.Scanner;

public class primeNumbers 
{

	public static void main(String[] args) 
	{
		//Take in user input
		Scanner in = new Scanner(System.in);
		//Ask user
		System.out.print("What numebr would you like to check to see if its prime: ");
		//use input and assign it to number
		int number = in.nextInt();
		//Print out result
		System.out.println(primeNumber(number));
	}
	
	public static String primeNumber(int number)
	{
		//initialize a variable to empty string
		String answer = "";
		//increment starting from 2 to number, by 1
		for (int i = 2; i <= number; i++)
		{
			// if i is equal to number, than we know number is prime
			if (i == number)
			{
				answer = (number + " is prime.");
			}
			// there are 2 cases:
			if (number % i == 0)
			{
				// 1st case:  if i is a multiple of number, than break out of loop
				// 2nd case:  if i is equal to number, than break out of loop
				break;
			}
		}
		// if answer is a empty string, meaning it is not prime
		if (answer == "")
		{
			// answer is equal to not prime
			answer = (number + " is not prime");
		}
		//return answer
		return answer;
	}

}
