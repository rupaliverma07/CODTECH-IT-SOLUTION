import java.util.Scanner;

class Tic_Tac_Toe
{
	char board[][];
	char currentPlayer;
	int movesCount;
	
	Tic_Tac_Toe()
	{
		board = new char[3][3];
		currentPlayer = 'X';
		movesCount = 0;
		initializeBoard();
	}
	
	 void initializeBoard()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j] = ' ';
			}
		}
	}
	
	boolean isValidMove(int row,int col)
	{
		return board[row][col]==' ' && row>=0 && row<3 && col>=0 && col<3;
	}
	
	void makeMove(int row,int col)
	{
		board[row][col]= currentPlayer;
		movesCount++;
	
	}
	boolean checkWinner()
	{
		for(int i=0;i<3;i++)
		{
			if(board[i][0] !=' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
			{	return true; }
		}
		for(int j=0;j<3;j++)
		{
			if(board[0][j] !=' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j])
			{	return true; }
		}
		if(board[0][0] !=' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
		{	return true; }
		if(board[0][2] !=' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
		{	return true; }
		
		return false;
	}
	
	public void displayBoard()
	{
		System.out.println("-------------");
		for(int i=0;i<3;i++)
		{
			System.out.print("|");
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+board[i][j]+" |");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}
	boolean boardFull()
	{
		return movesCount == 9;
	}
	
	void playGame()
	{
		boolean won = false;
		Scanner sc = new Scanner(System.in);
		
		while( !won && !boardFull())
		{
			displayBoard();
			System.out.println("Player "+currentPlayer+" Enter Your Move(Row and Column) :- ");
			int row = sc.nextInt();
			int col = sc.nextInt();
			
			if(isValidMove(row,col))
			{
				makeMove(row,col);
				won = checkWinner();
				currentPlayer = (currentPlayer == 'X') ? '0' : 'X';
			}
			else
			{
				System.out.println("Invalid Move !!!");
			}
		}
		
		displayBoard();
		if(won)
		{
			System.out.println("\n "+(currentPlayer=='X' ? '0' : 'X' )+" win");
		}
		else
		{
			System.out.println("It's a Draw");
		}
		sc.close();
	}
	
	public static void main(String[]args)
	{
		Tic_Tac_Toe t = new Tic_Tac_Toe();
		t.playGame();
		
		
	}
}