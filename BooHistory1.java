import java.util.Random;
import java.util.Scanner;

public class BooHistory1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Random random = new Random();
		
		boolean guessCorrect;
		int ans1;
		int num1;
		int guess=1;


		ans1 = random.nextInt(9)+1;

		guessCorrect = false;
		System.out.println("Guess of a number between 1-10: ");	
		Scanner input = new Scanner(System.in);

		do
		{
			num1=input.nextInt();
			if (num1 == ans1)
			{
				guessCorrect = true;     
				System.out.println("Correct.");
				break;
			}
			else
			{
				if(num1>ans1 && guess<3)
				{
					System.out.printf("Your guess is too high. You have guessed %stime(s)!\n",guess);
				}
				else if(num1<ans1 && guess<3)
				{
					System.out.printf("Your guess is too low. You have guessed %s time(s) !\n",guess);
				}
				else
					{
					System.out.println("Your out of guesses.");
					}

				guess++;
			}
		}while(guessCorrect=false || guess<4);


	}

}
	


