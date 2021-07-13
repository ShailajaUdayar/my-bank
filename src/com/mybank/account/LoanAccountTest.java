package com.mybank.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoanAccountTest {
	LoanAccount account;
	
	@BeforeEach
	void setUp() throws Exception {
		 this.account = new LoanAccount("test customer", "test account name", 0.0, "test account number", 10000.0);
	}

	
	
	/*
	  * - has another field (class variable): limit (how much is the maximum loan amount)
	  * - balance cannot be greater than zero
	  * - can withdraw, deposit, transfer; but with above restrictions in mind
	  */
	
	@Test
	public void constructor_has_limit_parameter_sets_limit() {
		//LoanAccount account = new LoanAccount("test customer", "test account name", 0.0, "test account number", 10000.0);
		double limit = account.getLimit();
		assertEquals(10000.0, limit);
	}
	
	@Test 
	public void setBalance_greater_than_zero_throws() {
		assertThrows(IllegalArgumentException.class, () ->{
			account.setBalance(42.0);
		});
		
	}
	
	// on to the next test
	
	
}
