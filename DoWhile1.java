import java.util.Random;
import java.util.Scanner;

public class DoWhile1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Random random = new Random();
		
		boolean guessCorrect;
		int ans1;
		int num1;
		int guess=0;


		ans1=	random.nextInt(9)+1;

		guessCorrect = false;
		System.out.println("Guess of a number between 1-10: ");	
		Scanner input = new Scanner(System.in);

		do
		{
			num1=input.nextInt();

			if (num1 == ans1)
			{
				guessCorrect = true;     
				System.out.println("Good Job, you guessed it!");
			}
			else
			{
				if(num1>ans1)
				{
					System.out.println("You guessed too high, try agian.");
				}
				else if(num1<ans1)
				{
					System.out.println("you guessed too low, try agian");
				}
				guess++;
			}
		}while (guess < 3); 

	}
}


