import java.util.Scanner;

public class WhileGuess1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		
		int num1;
		int compNum;
		int guess=0;
		boolean guessCorrect;
		compNum = 0 + (int) (Math.random()*10);
		
		guessCorrect = false;
		
		System.out.println("Guess of a number between 0-10: ");
		num1 = input.nextInt();
		
		while (guess < 3)
		{
			if (num1==compNum)
			{
				guessCorrect = true;
				System.out.println("Correct.");
			}
			else
			{
				if (num1>compNum)
				{
					System.out.println("Your guess is too high.");
				}
				else if (num1<compNum)
				{
					System.out.println("Your guess is too low.");
				}
				guess++;
			}
		 }
	}

}
