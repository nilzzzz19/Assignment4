package com.example.accounts;

import java.util.Random;

public class AccountHolder {

	protected static int ID;
	protected String address;
	public AccountHolder(int iD, String address) {
		super();
		ID = iD;
		this.address = address;
	}
	
	public static int getNextID() {
		Random random = new Random();
	    return random.ints(1, 1000001) //returns an IntStream of random nos bw min and max(exclusive)
	      .findFirst()
	      .getAsInt();  
	}
	
}
