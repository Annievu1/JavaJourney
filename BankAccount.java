
public class BankAccount {
private double balance;

public void setBalance(double b)
{
	balance=b;
}
public double getBalance()
{
	return balance;
}
public void deposit(double d)
{
	balance+=d;
}
public void withdraw(double w)
{
	balance-=w;
}
public String toString(){
	return "Your final balance is: "+balance;
}
public BankAccount()
{
	balance=0.0;
}
public BankAccount(double b)
{
	balance=b;
}
}