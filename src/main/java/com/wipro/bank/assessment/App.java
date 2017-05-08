package com.wipro.bank.assessment;

import com.wipro.bank.entity.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
	
    public static final List<Account> accounts = new ArrayList<Account>();
	
	public static List<Account> getAccounts() {
		return accounts;
	}	

	public Account getAccountDetailsByID(int id){
		Account acc=null;
		Iterator<Account> iterator = accounts.iterator();
		while (iterator.hasNext()) {
		Account a = iterator.next();
		if(id==a.getAccountID()){
			acc=a;
		}
		}
		return acc;
	}
	
	public List<Account> getAccountDetailsByBalance(double amount){	
		List<Account> dummylist=new ArrayList<Account>();
		Iterator<Account> iterator = accounts.iterator();
		while (iterator.hasNext()) {
			Account acc = iterator.next();
	           if(acc.getBalance()>=amount){
	                 dummylist.add(acc);
	           }               
	    }
	    if(dummylist.isEmpty())
	    	dummylist=null;
	    
	   return dummylist;
		}	
	
	public static void main( String[] args )
    {       
       accounts.add(new Account(1,"acc1",101.11));
       accounts.add(new Account(2,"acc2",201.13));
       accounts.add(new Account(3,"acc3",301.22));
       accounts.add(new Account(4,"acc4",401.55));
       accounts.add(new Account(5,"acc5",501.77));
       accounts.add(new Account(6,"acc6",601.22));
       accounts.add(new Account(7,"acc7",701.11));
       accounts.add(new Account(7,"acc8",801.99));
       
       App temp = new App();
      System.out.println(temp.getAccountDetailsByID(1));
      System.out.println(temp.getAccountDetailsByBalance(1100));
       
       
    }


}
