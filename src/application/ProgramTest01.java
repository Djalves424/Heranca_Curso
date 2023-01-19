package application;

import entities.Account;
import entities.BusunessAccount;
import entities.SavingsAccount;

public class ProgramTest01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusunessAccount bacc = new BusunessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusunessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusunessAccount acc4 = (BusunessAccount) acc2;
		acc4.loan(100.0);
		
		// BusunessAccount acc5 = (BusunessAccount)acc3;
		if (acc3 instanceof BusunessAccount) {
			BusunessAccount acc5 = (BusunessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}
}
