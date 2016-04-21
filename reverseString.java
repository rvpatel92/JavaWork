import java.util.Scanner;

public class reverseString 
{

	public static void main(String[] args) 
	{
		//allow user input
		Scanner in = new Scanner(System.in);
		//question to user
		System.out.println("What string would you like to return: ");
		//read input and initialize it
		String input = in.nextLine();
		//use the method and return the value and store it into answer
		String answer = rString(input);
		//print it out
		System.out.println(answer);
	}
	
	public static String rString(String answer)
	{
		//empty string
		String newReverse = "";
		
		//start at the last value of the string passed, and iterate it backwards
		for (int i = answer.length() - 1; i >= 0; i--)
		{
			//add the char letter to the empty string
			newReverse = newReverse + answer.charAt(i);
		}
		//return reverse string
		return newReverse;
	}

}
