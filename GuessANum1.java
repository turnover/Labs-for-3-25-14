import java.util.Scanner;

public class GuessANum1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		
		int num1;
		boolean guess;
		int compNum;
		compNum = 0 + (int) (Math.random()*10);
		
		guess = false;
		
		System.out.println("Guess of a number between 0-10: ");
		num1 = input.nextInt();
		
		if (compNum==num1)
		{
			guess=true;
		}
		if (guess==true)
		{
			System.out.println("Correct.");
		}
		else
		{
			if(compNum>num1)
			{
				System.out.println("Your guess is too high.");
			}
			else
			{
				System.out.println("Your guess is too low.");
			}
		}
		
		System.out.println("Please try again.");
		
	}

}
