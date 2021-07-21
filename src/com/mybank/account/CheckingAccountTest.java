package com.mybank.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckingAccountTest {
	// class under test
	CheckingAccount account;
	CheckingAccount transferTo;
	
	@BeforeEach
	void setup() {
		this.account = new CheckingAccount(
				"customer 1",
				"test account",
				0,
				"test account number"
				);
		
		this.transferTo = new CheckingAccount(
				"customer 2",
				"test 2 account",
				0.0,
				"552252"
				);
	}
	
	@Test
	void deposit__amount_greater_than_zero__works() {
		
				
	// try with good amount (greater than zero)
		double amount = 42.0;
		
		// do the actual test
		account.deposit(amount);
		
		// get the actual balance
		double balance = account.getBalance();
		
		// check it did work
		assertEquals(amount , balance);			
		
	}
	@Test 
	void deposit__amount_less_than_zero__throws() {
		// bad amount
		double amount = -1.0;
		
		// do it 
		//account.deposit(amount);
		
		assertThrows(IllegalArgumentException.class, () -> {
			account.deposit(amount);
		});
		
		
	}
	@Test
	void deposit__amount_equal_to_zero__throws() {
		// another bad amount
				double amount = 0.0;
		
		assertThrows(IllegalArgumentException.class, () -> {
		account.deposit(amount);
		});
				
	}
	
	@Test
	void withdraw__amount_greater_than_zero__throws() throws InsufficientFundsException {
		
		double amount = 10.0;
		account.deposit(amount +1);	
		account.withdraw(amount);
		assertEquals(1.0, account.getBalance());
		}

					
	@Test
	void withdraw__amount_less_than_zero__throws() {
		
		double amount = -1.0;
			
		assertThrows(IllegalArgumentException.class, () -> {
			account.withdraw(amount);
		});
	}
	
	@Test
	void checking_account_withdrawal() throws InsufficientFundsException{
		
		double withdrawAmount = 500;
		account.setBalance(withdrawAmount);
		//double expectedValue = account.withdraw(withdrawAmount);
		
		assertEquals(withdrawAmount, account.withdraw(withdrawAmount));
		
		double newAmount = -5.6;
		
		assertThrows(IllegalArgumentException.class, () -> {
			account.withdraw(newAmount);
		});
		
		assertThrows(InsufficientFundsException.class, () -> {
			account.withdraw(10);
		});
				
	}
	
	@Test
	void checking_account_Transfer() throws InsufficientFundsException {
		double amountToTransfer = 50;
		
		account.deposit(100);
		account.transfer(transferTo, amountToTransfer);
		
		assertEquals(amountToTransfer, transferTo.getBalance());
	}
	
}
