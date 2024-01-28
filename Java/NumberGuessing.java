import java.util.Scanner;
import java.util.Random;

class Game
{
	int number;
	int attempt=0;
	int maxAttempt;
	
	Game()
	{
		Random  r = new Random();
		number = r.nextInt(100);
		
		maxAttempt = 5;
	}
	
	void playGame()
	{
		Scanner sc = new Scanner(System.in);
		
		while(attempt < maxAttempt)
		{
			attempt++;
			System.out.println("Guess Number");
			int guess = sc.nextInt();
			
			if(guess == number)
			{
				System.out.println("\nCongratulation you won !!!");
			}
			else if(guess < number)
			{
				System.out.println("too low");
			}
			else
			{
				System.out.println("too high");
			}
			
			if(attempt == maxAttempt)
			{
				System.out.println("\n\nYou did not win !!!!!\n Correct Answer is => "+number);
			}
		}
		sc.close();
	}
	
	public static void main(String[]ar)
	{
		Game g = new Game();
		
		g.playGame();
	}
}