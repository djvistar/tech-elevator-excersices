package com.techelevator;

public class SavingsAccount extends BankAccount {
	
	
public SavingsAccount(String accountHolderName, String accountNumber) {
		
	super(accountHolderName, accountNumber );
	}
	
	
	
public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		
		super(accountHolderName, accountNumber,balance );
		
	}

//if balance > 150 accept withdraw
// if if balance < 150 add fee $2
//if withdraw >balance ,withdrawal declined 

public int withdraw(int amountToWithdraw) {
	

//	if (getBalance() < 150) {
//
//		super.withdraw(+2);
//	} 
//	else {
//		
//		if (super.getBalance() < 150 && super.getBalance() >= 0	&&
//				amountToWithdraw <= super.getBalance()){
//			
//			super.withdraw(amountToWithdraw + 2);
//		} 
//	
//
//	}
//	return super.getBalance();
//}

	   
	        // only perform transaction of positive $ and room for fee
        if (getBalance() - amountToWithdraw >= 2) {
	            super.withdraw(amountToWithdraw);
	            // Assess $2 fee if it goes below $150
	            if (getBalance() < 150) {
                super.withdraw(2);
	            }
	        }
	        return getBalance();
	    }


}
