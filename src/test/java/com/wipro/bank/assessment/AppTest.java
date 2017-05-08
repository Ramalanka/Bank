package com.wipro.bank.assessment;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.bank.entity.Account;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	
	@Test
	public void testGetAccountDetailsByID() {
		
		App.accounts.add(new Account (1,"acc1",101.11));		
		App.accounts.add(new Account (3,"acc3",303.33));
		App.accounts.add(new Account (4,"acc4",404.43));
		App.accounts.add(new Account (5,"acc5",505.55));			
		assertNull(new App().getAccountDetailsByID(567));		
		Account acc=new App().getAccountDetailsByID(3);
		assertNotNull(acc);
		assertEquals(3,acc.getAccountID());
		assertNotEquals(App.accounts.get(2).getAccountID(),acc.getAccountID());
		assertEquals("acc3",acc.getUserName());
		assertNotEquals(App.accounts.get(2).getUserName(),acc.getUserName());			
	}	

	public void testGetAccountDetailsByBalance() {
		//fail("Not yet implemented");
	}

}
