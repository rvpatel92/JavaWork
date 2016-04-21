import java.util.Scanner;

public class ComputeFactorial 
{
	public static void main(String[] args) 
	{
		//Use of scanner (user input)
		Scanner in = new Scanner(System.in);
		//Ask what number
		System.out.print("What number would you like to find the factorial of: ");
		//initialize number with user input
		int number = in.nextInt();
		//default variable
		int answer = 1;
		//loop to multiply the input value until it decreases to 1
		for (int i = number; i >= 1; i--)
		{
			//multiplies and assigns back to answer
			answer = answer * i;
		}
		//prints out answer
		System.out.println(answer + " is the answer to the factorial.");
	}
}
