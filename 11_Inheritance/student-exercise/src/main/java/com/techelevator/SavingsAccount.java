package com.techelevator;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount() {
		super();
		
		}
	
	
public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		
		super(accountHolderName, accountNumber,balance );
		
	}

//if balance > 150 accept withdraw
// if if balance < 150 add fee $2
//if withdraw >balance ,withdrawal declined 

public int withdraw(int amountToWithdraw) {
	

//	if (super.getBalance() > 150) {
//
//		super.withdraw(amountToWithdraw);
//
//	} else {
		
		if (super.getBalance() < 150 && super.getBalance() >= 0) {
			
			super.withdraw(amountToWithdraw + 2);
			
		} else {
			if (amountToWithdraw > super.getBalance()) {
				
				return super.getBalance();
			}
		}

	
	
	return super.getBalance();
}





}
