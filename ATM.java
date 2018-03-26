//Annie Vu
//Feb 8, 2018
//ATM machine
//Using methods and loops to create ATM machine
import java.util.Scanner;

import java.text.DecimalFormat;
public class ATM {
private String type;
private String x;
private int number;
private double balance;
Scanner kb=new Scanner(System.in);
DecimalFormat df=new DecimalFormat("$###,###.00");
public ATM()// no argument constructor
{
	type=null;
	number=0;
	balance=1000;
}
public ATM(String t, int n, double b)//argument constructor
{
	type=t;
	number=n;
	balance=b;
}

public int getAccountNumber()
{
	return number;
}


public String getType(String t)
{
	return type;
	
}	

public void computeTransaction()
{ 

System.out.println("Enter 1 for Deposit or 2 for Withdrawl");
int choice=kb.nextInt();
if (choice==1)
{
	System.out.println("Enter amount to Deposit");
	double amt=kb.nextDouble();
	balance+=amt;
}
else
	{type="withdraw";
	System.out.println("Enter amount to Withdraw");
	double amt=kb.nextDouble();
	balance-=amt;}
}
public String toString()
{  return "Account Number:\t"+number+"\nAccount Type:\t"+type+"\nAccount Balance after Transaction:\t"+df.format(balance);
		
}
}