import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Drwal {
	private static void NoToKlops()
	{
		System.out.println("klops");
		System.exit(0);
	}

	private static void printDrwal(char[][] Board)
	{
		for(int i = 0; i < Board.length; i++)
		{
			for(int j = 0; j < Board[i].length; j++)
				System.out.print(Board[i][j]);
			System.out.println();
		}	
	}
	
	private static void MakeLumberjackFryderyk(char[][] Board, char kolor, int xPossition, int yPossition)
	{
		Board[xPossition][yPossition] = kolor;
		
		if(yPossition-1 >= 0)
			if(Board[xPossition][yPossition-1] == ' ')
				MakeLumberjackFryderyk(Board, kolor, xPossition, yPossition-1);
		
		if(yPossition+1 <= Board[xPossition].length-1)
			if(Board[xPossition][yPossition+1] == ' ')
				MakeLumberjackFryderyk(Board, kolor, xPossition, yPossition+1);
		
		if(xPossition+1 <= Board.length-1)
			if(Board[xPossition+1][yPossition] == ' ')
				MakeLumberjackFryderyk(Board, kolor, xPossition+1, yPossition);
		
		if(xPossition-1 >= 0)
			if(Board[xPossition-1][yPossition] == ' ')
				MakeLumberjackFryderyk(Board, kolor, xPossition-1, yPossition);
		return;
	}
	
	public static void main(String[] args)
	{
		try
		{
			//Checking Condition
			if(args.length != 5)
				NoToKlops();

			int xStart = Integer.parseInt(args[0]);
			int yStart = Integer.parseInt(args[1]);
			
			int szerokosc = Integer.parseInt(args[3]);
			
			int wysokosc = Integer.parseInt(args[4]);
			
			int xMax = 50;
			int yMax = 50;

			if(xStart-- > szerokosc || yStart-- > wysokosc)
				NoToKlops();

			if(szerokosc > xMax || wysokosc > yMax)
				NoToKlops();

			char kolor = args[2].charAt(0);
			
			//Getting Drwal
			char[][] Board = new char[szerokosc--][wysokosc--];
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));  

			for(int i = 0; i <= szerokosc; i++)
			{
				String value = reader.readLine();
				if(value != null)
				{
					char[] temp = value.toCharArray();
					for(int j = 0; j <= wysokosc; j++)
						if(j < temp.length)
							Board[i][j] = temp[j];
						else
							Board[i][j] = ' ';
				}
				else
				{
					for(int j = 0; j <= wysokosc; j++)
						Board[i][j] = ' ';
				}
			}
			if(Board[xStart][yStart] == ' ')
				MakeLumberjackFryderyk(Board, kolor, xStart, yStart);

			printDrwal(Board);
			System.exit(0);
		}
		catch(Exception e)
		{
			NoToKlops();
		}
	}
}