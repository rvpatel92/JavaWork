import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		//allows for us to take in user input
		Scanner in = new Scanner(System.in);
		//ask question
		System.out.print("What number would you like to find the fibonacci of: ");
		//initialize number with user input
		int number = in.nextInt();
		//calls method and assigns it to answer
		int answer = fibonacciSequence(number);
		//prints out answer
		System.out.println("The answer is " + answer);
	}
	
	public static int fibonacciSequence(int number)
	{
		//if number is 0, return 0
		if (number == 0)
		{
			return 0;
		}
		//if number is 1, return 1
		else if (number == 1)
		{
			return 1;
		}
		/* return the value til it reaches down to either a 0 or a 1, this method uses
		 * recursion.
		 * For example:  Fibonacci(3) = Fibonacci(2) + Fibonacci(1)
		 * the second term would equal to 1 because of the if statement,
		 * Fibonacci(2) = Fibonacci(1) + Fibonacci(0)
		 * the first term would equal to 1
		 * therefore it would return 2 as the answer 
		 */
		else
		{
			return (fibonacciSequence(number - 1) + fibonacciSequence(number - 2));
		}
	}

}
