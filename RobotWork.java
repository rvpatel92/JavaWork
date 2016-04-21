/* Ravi Patel
 * Problem:  Write a program simulating a robot that takes in a string of characters 
 * consisting of N S E W and X. N is North, S is South,  E is East, W is West, and X will undo the last action. 
 * The goal is to get the x,y coordinates when the robot executes the string.
 * Hint: You can use Java stack
 */

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class RobotWork
{
	public static void main(String[] args) 
	{
		Boolean choice = true;
		//allows the program to be used more than once if the user wants to test another string
		while (choice == true)
		{
			//allows the program to take in user input
			Scanner in = new Scanner(System.in);
			
			//creates a stack that allows string values
			Stack<String> st = new Stack<String>();
			
			// asks the user the string they want with direction help
			System.out.print("What directions would you like: \n(N - North)\n(S - South)\n(E - East)\n(W - West)\n(X - Undo)");
			System.out.println();
			System.out.println();
			System.out.print("Insert here: ");
			//initialize input to user's input, and takes either lowercase or uppercase
			String input = in.nextLine().toUpperCase();
			
			//traverse through the new value to determine the string letters.
			//(?<!^) removes the first empty space in the newValue array.
			String[] newValue = input.split("(?<!^)");
			
			//going through however long the newValue array length is
			for(int i = 0; i < newValue.length; i++)
			{
				//Assign a new variable to the value at i in the newValue array
				String test = newValue[i];
				//If test at the i value equals to either N, S, E, W
				if (test.equals("N") || test.equals("S") || test.equals("E") || test.equals("W"))
				{
					//pushes the value into the stack
					st.push(test);			
				}
				//If the test value equals X
				else if (test.equals("X"))
				{
					try{ 
						//removes the last value
						st.pop();
					} catch (EmptyStackException e)
					{
						//catches the exception when x is the first value
					}
				}
				else
				{
					//tells the user, you entered a wrong direction, also ignores that characters and continues throughout the array.
					System.out.println(test + " is not a listed correct direction!\n Don't worry, it will on be included");
				}
			}
			//for x coordinate
			int x = 0;
			//for y coordinate
			int y = 0;
				
			//traversing through the stack
			for (int i = st.size(); i > 0; i--)
			{
				//pop the element
				String test = st.pop();
				//goes through the condition to see which test value equals to the directoin
				if (test.equals("N"))
				{
					//if N, add to y direction
					y = y + 1;
				}
				else if (test.equals("S"))
				{
					//if S, subtract to y direction
					y  = y - 1;
				}
				else if (test.equals("E"))
				{
					//if E, add to the X direction
					x  = x + 1;
				}
				else if (test.equals("W"))
				{
					//if W, subtract to the X direction
					x = x - 1;
				}
			}
			System.out.println();
			//prints out the coordinate that corresponds to the user input's string.
			System.out.println("The direction of your (x,y) coordinate is: (" + x + "," + y + ").");
			System.out.println();
			//Ask the user if he/she would like to add another direction or not?
			System.out.print("Would you like to enter another direction? (Enter 'yes' or 'no') ");
			//Response is sent to lowercase
			String output = in.nextLine().toLowerCase();
			//if output equals to yes
			if (output.equals("yes"))
			{
				choice = true;
			}
			//anything other than yes, return false, and print out have a great day.
			else
			{
				choice = false;
				System.out.println("Have a great day");
			}
		}
		//exits the program.
		System.exit(0);
	}
}
