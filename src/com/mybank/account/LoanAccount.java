package com.mybank.account;

public class LoanAccount extends AbstractAccount {
	private double limit;
	
	public LoanAccount(String customer, String accountName, double balance, String accountNumber, double limit) {
		super(customer, accountName, balance, accountNumber);
		// TODO Auto-generated constructor stub
		this.setLimit(limit);
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		if(limit < 0.0) {
			throw new IllegalArgumentException("Limit cannnot be less than zero");
		}
		this.limit = limit;
	}
	
	@Override
	public void setBalance(double balance) {
		if(balance > 0.0) {
			throw new IllegalArgumentException("Balance cannnot be less than zero");
		}
		super.setBalance(balance);
	}
}
