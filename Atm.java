package atm;

import java.util.Scanner;

public class Atm {
	public static void main(String []arges)
	{
		int pin=1234;
		int takeamount=0;
		int addamount=0;
		int balance=10000;
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your Password");
		int pass=s1.nextInt();
		System.out.println("Enter your name");
		String name=s1.next();
		int opt=0;
		
		if(pass==pin)
		{
			System.out.println("Welcome "+name);
			
			while(opt<=4)
			{
			System.out.println("press 1 to know your account balace");
			System.out.println("press 2 to add your account balance ");
			System.out.println("press 3 to take amound from your account balance");
			System.out.println("press 4 to get recipt");
			
			opt=s1.nextInt();
			switch(opt)
			{
			case 1:
			    System.out.println("your account balance: "+balance);
			    break;
			case 2:
				System.out.println("how mush money you want add in your account");
				addamount=s1.nextInt();
				balance=balance+addamount;
				System.out.println("added your ammount successfully");
				break;
			case 3:
				System.out.println("how mach money you want take from your account");
				int take=s1.nextInt();
				if(balance>=take)
				{
					takeamount=take;
					balance=balance-takeamount;
					System.out.println("get your ammount :)");
					break;
				}
				else
				{
					System.out.println("sory "+name+",your bank money is not enough to takeamount");
					break;
				}
			case 4:
			{
				System.out.println("take ammount:"+takeamount);
				System.out.println("add ammount:"+addamount);
				System.out.println("account balance:"+balance);
				System.out.println("thank you :)");
				break;
				
			}
			
			default :
			{
				System.out.println("We Don,t have feture to your number");
			}
			
			}
			}
			
			
		}
		else
		{
			System.out.println("Sorry "+name+",your password is incorrect");
		}
	}

}
