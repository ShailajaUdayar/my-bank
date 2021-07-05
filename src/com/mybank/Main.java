package com.mybank;

import java.util.Arrays;
import java.util.List;

import com.mybank.account.AbstractAccount;
import com.mybank.account.CheckingAccount;
import com.mybank.account.InsufficientFundsException;
import com.mybank.account.MusicalChairs;
import com.mybank.account.SavingsAccount;

public class Main {

	public static void main(String[] args) {
//		
//		CheckingAccount one = new CheckingAccount("Cust1", "Cust one acccount", 100.0, "c1");
//		
//		SavingsAccount two = new SavingsAccount("Sav2", "Saver two acccount", 100.0, "s2");
//		
//		try {
////		one.withdraw(1.0);
////		two.deposit(3.0);
//			
//			one.transfer(two, 5.0);
//			two.withdraw( 3.0);
//		} catch (IllegalArgumentException | InsufficientFundsException | UnsupportedOperationException e) {
//			System.out.println(e);
//			System.out.println(e.getMessage());
//		}  
//		
		//MusicalChairs.playWithCollections();
		//MusicalChairs.playWithSet();
		
		//MusicalChairs.playWithMap();
		
		MusicalChairs.playWithSorting();
		MusicalChairs.playWithMap();
		
	}	
		
		
	}


//		// two bank account, please
//		CheckingAccount one = new CheckingAccount("Cust1", "Cust1_Acc", 100.0, "111") ;
//		
//	//	CheckingAccount two = new CheckingAccount("Cust2", "Cust2_Acc", 1000000.55, "222" );
//		
//		SavingsAccount two = new SavingsAccount("Saving2", "Sav_Acc2", 100.0, "s2");
//		
//		CheckingAccount three = new CheckingAccount("Check3", "Check_Acc3", 100.0, "c3");
//		
//		SavingsAccount four = new SavingsAccount("Saving4", "Sav_Acc4", 100.0, "s4");
//		
//		CheckingAccount five = new CheckingAccount("Check5", "Check_Acc5", 100.0, "c5");
//		
//		List<AbstractAccount> allAccounts = Arrays.asList(one, two, three, four, five);
//		
//		for(int amount = 1; amount < 1000; amount++) {
//			int i = amount % 5; // modulo to keep a number between 0 to 4 in this case
//			int j = (i +1) % 5;
//			AbstractAccount fromAccount = allAccounts.get(i);
//			AbstractAccount toAccount = allAccounts.get(j);
//			
//			 // transfer moniez!!!
//			System.out.println("Transferring from account: " +fromAccount.getAccountName()+ "with index number: " +i);
//			Double amountTransfered = fromAccount.transfer(toAccount, amount);
//						
//	         //check if transfer worked, if not, break out of loop
//			if(amountTransfered == null){				
//				break;
//			}
//			
////			//Method 2:
////			if(fromAccount.getBalance() == 0){
////			System.out.println("First account to get empty is: " +fromAccount.getAccountName());
////			break;
////			}
//		}			
//					
//			 // print all balances at the end of the game
//		    // hint: System.out.println("Account one balance: " + one.getBalance());
////			for (AbstractAccount account : allAccounts){
////				System.out.println(account.getAccountName() + " - balance ");
////			}
//		
//			System.out.println( "Account one balance: " + one.getBalance());
//			System.out.println( "Account two balance: " + two.getBalance());
//			System.out.println( "Account three balance: " + three.getBalance());
//			System.out.println( "Account four balance: " + four.getBalance());
//			System.out.println( "Account five balance: " + five.getBalance());
//				
//	}		    
//    
//		
//		
////		one.transfer(three, 150.0);
////		two.transfer(three, 25.0);
//		
//		//System.out.println("Account three balance: " +three.getBalance());
//		
////		two.withdraw(1.0);
////		two.transfer(one,  5.13);
//		
//		//deposit another cool million into account two
//		//two.deposit(1000000.0);
//		
////		// withdraw from one
////		one.withdraw(99.0);
////		
////		//transfer some
////		one.transfer(two, 1000.0);
//		
//		//two.deposit(-5.0);
////		
////		one.withdraw(33.0);
////		one.withdraw(-7.0);
////		
////		one.withdraw(150.0);
////		
////		System.out.println("Account one balance: " +one.getBalance());
////		System.out.println("Account two balance: " +two.getBalance());
//	}
//
//
