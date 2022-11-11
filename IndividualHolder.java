package com.example.accounts;

public class IndividualHolder extends AccountHolder implements Util {

	private String name;
	private String ssn;
	
	public IndividualHolder(int iD, String address, String name, String ssn) {
		super(iD, address);
		this.name = name;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = convertNameUpperCase(name);
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	

	@Override
	public String toString() {
		return "IndividualHolder [name=" + name + ", ssn=" + ssn + ", address=" + address + ", getName()=" + getName()
				+ ", getSsn()=" + getSsn() + "]";
	}

	@Override
	public String convertNameUpperCase(String name) {
		return name.toUpperCase();
	}
	
}
