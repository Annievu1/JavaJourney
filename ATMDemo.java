import java.util.Scanner;

public class ATMDemo 
{
public static void main(String [] args)
{
	
	System.out.println("Welcome to ATM Bank of Chase\nPlease insert your card for the transaction.");
	boolean pass=verifyPassword();
	if (pass)
	{
		System.out.println("You may proceed");
		System.out.println("Press 1 for Checking or 2 for Savings");
		String type=null;
		Scanner kb=new Scanner(System.in);
			int choice=kb.nextInt();
			if(choice==1)
				type="Checking";
			else
				type="Savings";
	
	
		ATM a1=new ATM (type,1234,1000);
		a1.computeTransaction();
		System.out.print(a1);
		System.out.print("\nDo you want to make another transaction? Press 1 to continue and 2 to end.");
		Scanner k = new Scanner(System.in);
		int choices=k.nextInt();
		
		if(choices==1)
			{	
				
				a1.computeTransaction();
				System.out.print(a1);
			}
		else
					{System.out.println("Goodbye!");}
	}
	
	else
		System.out.println("You can't procced");
	}
	
	
{}
private static boolean verifyPassword()
{Scanner kb=new Scanner(System.in);
System.out.println("Enter in password:");
	int pw=kb.nextInt();
	if (pw==1234)
		{return true;}
	else
		{return false;}
}}
/*Welcome to ATM Bank of Chase
Please insert your card for the transaction.
Enter in password:
1234
You may proceed
Press 1 for Checking or 2 for Savings
1
Enter 1 for Deposit or 2 for Withdrawl
2
Enter amount to Withdraw
11
Account Number:	1234
Account Type:	withdraw
Account Balance after Transaction:	$989.00
Do you want to make another transaction? Press 1 to continue and 2 to end.*/