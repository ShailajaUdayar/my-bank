package com.mybank.account;

public class CheckingAccount extends AbstractAccount{

	public CheckingAccount(String customer, String accountName, double balance,
			String accountNumber) {
		super(customer, accountName, balance, accountNumber);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Properties - Customer (Owner) - (Account) Name - Balance - Number
	 */
	
	

//	public String getCustomer() {
//		return customer;
//	}
//
//	public void setCustomer(String customer) {
//		this.customer = customer;
//	}
//
//	public String getAccountName() {
//		return accountName;
//	}
//
//	public void setAccountName(String accountName) {
//		this.accountName = accountName;
//	}
//
//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//
//	public String getAccountNumber() {
//		return accountNumber;
//	}

	/*
	 * Methods - Deposit - Withdraw - Transfer (internal, externals) - Interest
	 */
	@Override
	public Double deposit(double amount) throws IllegalArgumentException {
		//validate amount is good
		checkAmountIsGreaterThanZeroElseThrow(amount);
		return super.deposit(amount);
//		if (amount > 0.0) {
//			super.deposit(amount);
//			//this.balance += amount;
//			//System.out.println("Deposited amount: " + amount);
//			return amount;
//		} else {
//			IllegalArgumentException  e = new IllegalArgumentException("Invalid Amount to deposit: "+amount);
//			throw e;
//			
//			System.out.println("Invalid Amount to deposit: "+amount);
//			return null;
		}

	

	// returns the amount after withdrawing, if successful, else null
	@Override
	public Double withdraw(double amount) throws InsufficientFundsException{
		// validate amount is good
		checkAmountIsGreaterThanZeroElseThrow(amount);
		
		// validate we have the funds
		checkForSufficientFundsElseThrow(amount);

		return super.withdraw(amount);			
	} 

	
	
@Override
	public Double transfer(AbstractAccount toAccount, double amount) throws InsufficientFundsException{
	//validate amount is good
		checkAmountIsGreaterThanZeroElseThrow(amount);
		
		// validate we have the funds
				checkForSufficientFundsElseThrow(amount);
				
				return super.transfer(toAccount, amount);
			}

}
	
//	// withdraw from this account
//		Double amountWithdrawn = this.withdraw(amount);
//
//		// deposit into other account, if amount withdrawn is not null
//		if (amountWithdrawn != null) {
//			toAccount.deposit(amountWithdrawn);
//		}
		//return amountWithdrawn;
	

//}
