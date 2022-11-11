package com.example.accounts;

public class Account {

	private AccountHolder accountHolder;
	private double balance = 0.0;
	public Account(AccountHolder accountHolder, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public void deposit(double amt) {
		balance+=amt;
	}
	public void withdraw(double amt) {
		if(balance<amt) {
			System.out.println("Not enough balance");
		}else {
			balance-=amt;
		}	
	}

	public AccountHolder getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(AccountHolder accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
