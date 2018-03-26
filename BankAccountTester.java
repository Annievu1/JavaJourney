
public class BankAccountTester {
public static void main (String[] args){
	BankAccount b1=new BankAccount(10000.0);
	b1.withdraw(234.55);
	System.out.println(b1);
	
	BankAccount b2=new BankAccount();
	b2.setBalance(20000.55);
	System.out.println("Your current balance is: "+b2.getBalance());
	b2.deposit(100.45);
	System.out.println(b2);
}
}
