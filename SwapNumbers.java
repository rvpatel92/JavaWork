import java.util.Scanner;

public class SwapNumbers 
{
	public static void main(String[] args)
	{
		//Takes in user input
		Scanner in = new Scanner(System.in);
		//asks for first input
		System.out.print("Enter in first number: ");
		//initialize firstNumber to user input
		int firstNumber = in.nextInt();
		//ask for second input
		System.out.print("Enter in second number: ");
		//initialize secondNumber for user input
		int secondNumber = in.nextInt();
		//displays numbers before swapped
		System.out.println("\nFirst Number: " + firstNumber + " Second Number: " + secondNumber);
		//calls method to swap
		swapNumbers(firstNumber, secondNumber);
	}
											//5				//10
	public static void swapNumbers(int firstNumber, int secondNumber)
	{
		//first, adds the 2 numbers together
		firstNumber = firstNumber + secondNumber;
		//second, subtract new firstnumber to secondnumber to assign secondnumber with firstnumber original value.
		secondNumber = firstNumber - secondNumber; 
		//last, subtract firstnumber to swapped firstnumber to assign the firstnumber, secondnumber original value.
		firstNumber = firstNumber - secondNumber; 
		//display results
		System.out.println("\nAfter swap without third variable: First Number: " + firstNumber + " Second Number: " + secondNumber);
	}
}
