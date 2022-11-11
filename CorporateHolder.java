package com.example.accounts;

public class CorporateHolder extends AccountHolder {

	private String contact;

	public CorporateHolder(int iD, String address, String contact) {
		super(iD, address);
		this.contact = contact;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}
