package com.example.accounts;

public class AccountTester {

	public static void main(String[] args) {
		
		AccountHolder acc1 = new IndividualHolder(AccountHolder.getNextID(), "LA", "Nilay", "AES1234");
		Account a1 = new Account(acc1, 1000);
		
		System.out.println(a1.getBalance());
		//System.out.println(a1.getAccountHolder());
		a1.withdraw(1000.9); 
		System.out.println(a1.getBalance());
		
		System.out.println(acc1.toString());

	}

}
