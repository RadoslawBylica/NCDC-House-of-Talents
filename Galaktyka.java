public class Galaktyka {
	private static void NoToKlops()
	{
		System.out.println("klops");
		System.exit(0);
	}
	
	public static void main(String[] args)
	{
		try
		{
			//Checking Condition
			if(args.length != 1)
				NoToKlops();
			if(args[0].length() > 6 || args[0].length() < 2)
				NoToKlops();
			int GalaxySize = Integer.parseInt(args[0].substring(0,args[0].length()-1));
			if(GalaxySize < 1 || GalaxySize > 10000)
				NoToKlops();
			String GalaxyDirection = args[0].substring(args[0].length()-1,args[0].length());
			if(!GalaxyDirection.equals("N") && !GalaxyDirection.equals("E") && !GalaxyDirection.equals("S") && !GalaxyDirection.equals("W"))
				NoToKlops();
			
			//GenerateGalaxy
			char[][] Galaxy;
			int X;
			int Y;
			int PossitionX;
			int PossitionY;
			int Counter;
			int SpaceCounter;
			
			switch(GalaxyDirection)
			{
				case "N":
					X = GalaxySize + 2;
					Y = GalaxySize + 3;
					
					Counter = GalaxySize + 1;
					SpaceCounter = 0;
					
					Galaxy = new char[X][Y];
					
					for(int x = 0; x < X; x++)
						for(int y = 0; y < Y; y++)
							Galaxy[x][y] = '*';
						
					PossitionX = 0;
					PossitionY = Y - 2;
					
					while(Counter > 0)
					{
						//GoToDown
						for(int i = 0; i < Counter; i++, PossitionX++)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX -= 1;
						PossitionY -= 1;
						Counter--;
						
						//GoToLeft
						for(int i = 0; i < Counter; i++, PossitionY--)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX -= 1;
						PossitionY += 1;
						Counter--;
						
						//GoToUp
						for(int i = 0; i < Counter; i++, PossitionX--)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX += 1;
						PossitionY += 1;
						Counter--;
						
						//GoToRight
						for(int i = 0; i < Counter; i++, PossitionY++)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX += 1;
						PossitionY -= 1;
						Counter--;
					}
					//System.out.println(java.util.Arrays.deepToString(Galaxy).replace("], ", "\n").replace("[[", "").replace("]]", "").replace("[", "").replace(", ", ""));
					System.out.println(SpaceCounter);
				break;
				
				case "E":
					X = GalaxySize + 3;
					Y = GalaxySize + 2;
					
					Counter = GalaxySize + 1;
					SpaceCounter = 0;
					
					Galaxy = new char[X][Y];
					
					for(int x = 0; x < X; x++)
						for(int y = 0; y < Y; y++)
							Galaxy[x][y] = '*';
						
					PossitionX = X - 2;
					PossitionY = Y - 1;
					
					while(Counter > 0)
					{
						//GoToLeft
						for(int i = 0; i < Counter; i++, PossitionY--)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX -= 1;
						PossitionY += 1;
						Counter--;
						
						//GoToUp
						for(int i = 0; i < Counter; i++, PossitionX--)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX += 1;
						PossitionY += 1;
						Counter--;
						
						//GoToRight
						for(int i = 0; i < Counter; i++, PossitionY++)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX += 1;
						PossitionY -= 1;
						Counter--;
						
						//GoToDown
						for(int i = 0; i < Counter; i++, PossitionX++)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX -= 1;
						PossitionY -= 1;
						Counter--;
						
					}
					System.out.println(java.util.Arrays.deepToString(Galaxy).replace("], ", "\n").replace("[[", "").replace("]]", "").replace("[", "").replace(", ", ""));
					System.out.println(SpaceCounter);
				break;
				
				case "S":
					X = GalaxySize + 2;
					Y = GalaxySize + 3;
					
					Counter = GalaxySize + 1;
					SpaceCounter = 0;
					
					Galaxy = new char[X][Y];
					
					for(int x = 0; x < X; x++)
						for(int y = 0; y < Y; y++)
							Galaxy[x][y] = '*';
						
					PossitionX = X - 1;
					PossitionY = 1;
					
					while(Counter > 0)
					{
						//GoToUp
						for(int i = 0; i < Counter; i++, PossitionX--)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX += 1;
						PossitionY += 1;
						Counter--;
						
						//GoToRight
						for(int i = 0; i < Counter; i++, PossitionY++)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX += 1;
						PossitionY -= 1;
						Counter--;
						
						//GoToDown
						for(int i = 0; i < Counter; i++, PossitionX++)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX -= 1;
						PossitionY -= 1;
						Counter--;
						
						//GoToLeft
						for(int i = 0; i < Counter; i++, PossitionY--)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX -= 1;
						PossitionY += 1;
						Counter--;
					}
					System.out.println(java.util.Arrays.deepToString(Galaxy).replace("], ", "\n").replace("[[", "").replace("]]", "").replace("[", "").replace(", ", ""));
					System.out.println(SpaceCounter);
				break;
				
				case "W":
					X = GalaxySize + 3;
					Y = GalaxySize + 2;
					
					Counter = GalaxySize + 1;
					SpaceCounter = 0;
					
					Galaxy = new char[X][Y];
					
					for(int x = 0; x < X; x++)
						for(int y = 0; y < Y; y++)
							Galaxy[x][y] = '*';
						
					PossitionX = 1;
					PossitionY = 0;
					
					while(Counter > 0)
					{
						//GoToRight
						for(int i = 0; i < Counter; i++, PossitionY++)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX += 1;
						PossitionY -= 1;
						Counter--;
						
						//GoToDown
						for(int i = 0; i < Counter; i++, PossitionX++)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX -= 1;
						PossitionY -= 1;
						Counter--;
						
						//GoToLeft
						for(int i = 0; i < Counter; i++, PossitionY--)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX -= 1;
						PossitionY += 1;
						Counter--;
						
						//GoToUp
						for(int i = 0; i < Counter; i++, PossitionX--)
						{
							Galaxy[PossitionX][PossitionY] = ' ';
							SpaceCounter++;
						}
						PossitionX += 1;
						PossitionY += 1;
						Counter--;
					}
					System.out.println(java.util.Arrays.deepToString(Galaxy).replace("], ", "\n").replace("[[", "").replace("]]", "").replace("[", "").replace(", ", ""));
					System.out.println(SpaceCounter);
				break;
			}
			
			System.exit(0);
		}
		catch(Exception e)
		{
			NoToKlops();
		}
	}
}