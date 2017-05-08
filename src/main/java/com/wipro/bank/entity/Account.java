package com.wipro.bank.entity;

public class Account {
	
	private int accountID;
	private String userName;
	private double balance;
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account() {
		super();
	}
	public Account(int accountID, String userName, double balance) {
		super();
		this.accountID = accountID;
		this.userName = userName;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", userName=" + userName
				+ ", balance=" + balance + "]";
	}	

}
