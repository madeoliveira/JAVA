package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 1000.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 1000.0, 0.01);
		Account acc6 = new SavingsAccount(1006, "Marcio", 1000.0,0.01);
		Account acc7 = new Account(1007, "Sirlei",1000.0);
		
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		acc.withdraw(200.0);
		acc2.withdraw(200.0);
		acc3.withdraw(200.0);
		
		acc6.withdraw(50.0);
		acc7.withdraw(50.0);
		
		
		System.out.println(acc.getBalance());
		System.out.println(acc3.getBalance());
		System.out.println(acc2.getBalance());
		System.out.println(acc6.getBalance());
		System.out.println(acc7.getBalance());
	}
}