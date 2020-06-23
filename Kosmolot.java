public class Kosmolot {
	private static void NoToKlops()
	{
		System.out.println("klops");
		System.exit(0);
	}
	
	public static void PrintRocket(String[] Rocket)
	{
		for(int i = 0; i < Rocket.length; i++)
			System.out.println(Rocket[i]);
	}
	
	public static void main(String[] args)
	{
		try
		{
			//Checking Condition
			if(args.length != 2)
				NoToKlops();
			String Armor = args[1];
			if(!Armor.equals("Y") && !Armor.equals("N"))
				NoToKlops();
			int RocketSize = Integer.parseInt(args[0]);
			if(RocketSize < 1  || RocketSize > 75)
				NoToKlops();
			
			//ChangeRocketType
			String[] Rocket;
			int RocketMainBody = RocketSize-1;
			switch(Armor)
			{
				case "Y":
					//RocketInitialize
					Rocket = new String[(RocketSize-1)*2 + 1];
					for(int i = 0; i < Rocket.length; i++)
						for(int j = 0, Condition = (RocketSize * RocketSize); j < Condition; j++)
							Rocket[i] = " ";
				
					//CreatingRocketMainBody
					for(int i = 0, Condition = (RocketSize * RocketSize)-2; i < Condition; i++)
						Rocket[RocketMainBody] += "*";
					Rocket[RocketMainBody] += ">";
					//CreatingRocketArms
					for(int i = 1; i < RocketSize; i++)
					{
						for(int z = RocketSize-i; z < RocketSize; z++)
						{
							Rocket[RocketMainBody-i] += " ";
							Rocket[RocketMainBody+i] += " ";
						}
						for(int j = 1, Condition = (RocketSize * RocketSize) - i; j < Condition; j++)
						{
							if(j%RocketSize == 1)
							{
								Rocket[RocketMainBody-i] += "\\";
								Rocket[RocketMainBody+i] += "/";
							}
							if(j%RocketSize == 2)
							{
								int z = i;
								for(; z < RocketSize - 1; z++)
								{
									Rocket[RocketMainBody-i] += "*";
									Rocket[RocketMainBody+i] += "*";
								}
							}
							if(j%RocketSize == 0)
							{
								int z = RocketSize - i;
								for(; z < RocketSize; z++)
								{
									Rocket[RocketMainBody-i] += " ";
									Rocket[RocketMainBody+i] += " ";
								}
							}
						}
						for(int z = Rocket[RocketMainBody-i].length() - 1; z < RocketSize * RocketSize; z++)
						{
							Rocket[RocketMainBody-i] += " ";
							Rocket[RocketMainBody+i] += " ";
						}
						
						StringBuilder Temp;
						Temp = new StringBuilder(Rocket[RocketMainBody-i]);
						Temp = Temp.reverse();
						Temp.setCharAt(0,'>');
						Rocket[RocketMainBody-i] = Temp.toString();
						
						Temp = new StringBuilder(Rocket[RocketMainBody+i]);
						Temp = Temp.reverse();
						Temp.setCharAt(0,'>');
						Rocket[RocketMainBody+i] = Temp.toString();
					}
					StringBuilder Temp = new StringBuilder(Rocket[RocketMainBody]);
					Temp.setCharAt(0,'>');
					Rocket[RocketMainBody] = Temp.toString();
					PrintRocket(Rocket);
					System.exit(0);
				break;
					
				case "N":
					//RocketInitialize
					Rocket = new String[(RocketSize-1)*2 + 1];
					for(int i = 0; i < Rocket.length; i++)
						for(int j = 0, Condition = (RocketSize * RocketSize); j < Condition; j++)
							Rocket[i] = "";
					
					//CreatingRocketMainBody
					for(int i = 0, Condition = RocketSize * RocketSize; i < Condition; i++)
						Rocket[RocketMainBody] += "*";
					//CreatingRocketArms
					for(int i = 1; i < RocketSize; i++)
					{
						for(int j = 0, Condition = RocketSize * RocketSize; j < Condition; j+=RocketSize)
						{
							for(int z = 0; z < RocketSize-i; z++)
							{
								Rocket[RocketMainBody-i] += "*";
								Rocket[RocketMainBody+i] += "*";
							}
							for(int z = RocketSize-i; z < RocketSize; z++)
							{
								Rocket[RocketMainBody-i] += " ";
								Rocket[RocketMainBody+i] += " ";
							}
						}	
					}
					PrintRocket(Rocket);
					System.exit(0);
				break;
			}
		}
		catch(Exception e)
		{
			NoToKlops();
		}
	}
}