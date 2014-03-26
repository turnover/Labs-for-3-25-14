import java.util.Scanner;

public class RPSC1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		
		int num1;
		int computerNum;
		computerNum = 0 + (int) (Math.random()*2);
		
		System.out.println("Play Rock, Paper, Scissors.");
		System.out.println("0=Rock, 1=Paper, 2=Scissors.Please enter your choice: ");
		num1 = input.nextInt();
		
		{
			if ( computerNum==0 && num1==0)
			{
				System.out.println("We both chose rock. We tie.");
			}
			else if ( computerNum==0 && num1==1)
			{
				System.out.println("I chose rock, and you chose paper. You Win.");
			}
			else if ( computerNum==0 && num1==2)
			{
				System.out.println("I chose rock, and you chose scissors. You Lose.");
			}
			else if ( computerNum==1 && num1==0)
			{
				System.out.println("I chose paper, and you chose rock. You Lose.");
			}
			else if ( computerNum==1 && num1==1)
			{
				System.out.println("We both chose paper. We tie.");
			}
			else if ( computerNum==1 && num1==2)
			{
				System.out.println("I chose paper, and you chose scissors. You Win.");
			}
			else if ( computerNum==2 && num1==0)
			{
				System.out.println("I chose scissors, and you chose rock. You Win.");
			}
			else if ( computerNum==2 && num1==1)
			{
				System.out.println("I chose scissors, and you chose paper. You Lose.");
			}
			else if ( computerNum==2 && num1==2)
			{
				System.out.println("We both chose scissors. We tie.");
			}
		}
	}

}
