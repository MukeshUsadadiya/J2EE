//4. strclient

import java.rmi.*;
import java.rmi.registry.*;
class strclient 
{
	public static void main(String args[])
	{
		try
		{
			System.out.print("Enter Name ::");
			String nm = System.console().readLine();
	
			System.out.println("Client Start...");
			Registry r1 = LocateRegistry.getRegistry("localhost",8383);
			str s = (str) r1.lookup("strservices");

			System.out.println("Press 1 :: To Reverse String...");
			System.out.println("Press 2 :: To Palindrom String...");
			System.out.println("Press 3 :: To Exit...");
	
			System.out.println("Enter Your Choice ::");
			int ch = Integer.parseInt(System.console().readLine());
			switch(ch)
			{
				case 1:
					String ans = s.add(nm);
					System.out.println("str is :" + ans);
					break;
				case 2:
					String ans1 = s.add(nm);
					System.out.println("str is :" + ans1);
					
					if(nm.equals(ans1))
					{	
						System.out.println("Yes String is Palindrom");
					}
					else
					{	
						System.out.println("No String is Not Palindrom");
					}
					break;
				case 3:
					System.out.println("Thanks For Visit....");
					break;
				default:	
					System.out.println("Wrong Choice");
					break;
			}
		}
		catch(Exception e)
		{
			System.out.println("Error ::"+e);
		}
	}
}