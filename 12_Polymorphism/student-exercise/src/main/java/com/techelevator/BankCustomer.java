package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {

	
	private String name;
    private String address;
    private String phoneNumber;
	private List<Accountable> accounts = new ArrayList<Accountable>(); ;
	
	
	
	
	
	
	
	//getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<Accountable> getAccounts() {
		return accounts;
	}
	
	
	
	
	
	public void addAccount(Accountable newAccount) {
		//List<Accountable> accounts = new ArrayList<Accountable>();
		
		accounts.add(newAccount);
		
		

	}
	
	public boolean isVip() {
		
		 int totalBalance = 0;

         for (Accountable account : accounts)
         {
             totalBalance += getBalance();
         }

         if (totalBalance >= 25000)
         {
             return true;
         }
         return false;
     }
	
	
	
	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
