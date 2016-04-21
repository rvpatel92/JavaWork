
public class changeOutput 
{

	public static void main(String[] args) 
	{
		//start at 1 to 100, increment by 1
		for(int i = 1; i <= 100; i++)
		{
			// if i is a multiple of 7 and 4
			if ((i % 7 == 0) && (i % 4 == 0))
			{
				//print FooBoo
				System.out.println("FooBoo");
			}
			//if i is a multiple of 4
			else if (i % 4 == 0)
			{
				//print Boo
				System.out.println("Boo");
			}
			//if i is a multiple of 7
			else if (i % 7 == 0)
			{
				//print Foo
				System.out.println("Foo");
			}
			else
			{
				//print the numbers which is i
				System.out.println(i);
			}
		}
	}

}
