package day41_ArrayList;

public class CapitalOne {
	public static void main(String[] args) {
		BankAccount acc1=new BankAccount();
		acc1.accountHolder="Bill Gates";
		acc1.accountNumber= 12244;
		acc1.deposit(235);
		acc1.withdraw(100);
		acc1.showBalance();
		acc1.charge(50,"Wooden spoon");
		acc1.showBalance();
	}

}
