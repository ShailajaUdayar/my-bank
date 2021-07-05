package com.mybank.account;

public class SavingsAccount extends AbstractAccount{

	public SavingsAccount(String customer, String accountName, double balance,
			String accountNumber) {
		super(customer, accountName, balance, accountNumber);
		
	}
	
	@Override
	public Double deposit(double amount) throws IllegalArgumentException {
		
		checkAmountIsGreaterThanZeroElseThrow(amount);
		return super.deposit(amount);
//		if(amount >  0.0) {
//			return super.deposit(amount);
//			 
//		} else {
//			IllegalArgumentException  e = new IllegalArgumentException("Invalid Amount to deposit: "+amount);
//			throw e;
			
//			System.out.println("Invalid amount to deposit: " +amount);
//			return null;
		}
	
	
//	@Override
//	
	public Double withdraw(double amount) {
		throw new UnsupportedOperationException("Cannot withdraw from a savings account");		
	}
	
//	
	@Override
	public Double transfer(AbstractAccount toAccount, double amount) throws InsufficientFundsException{
		checkAmountIsGreaterThanZeroElseThrow(amount);
		
		//validate we have the funds
		checkForSufficientFundsElseThrow(amount);
			
				return super.transfer(toAccount, amount);
			
		} 

}

