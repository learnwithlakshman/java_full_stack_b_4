package com.careerit.cj.day18;

public abstract class Account {

	int accno;
	String name;
	double balance;

	public Account( String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void withDraw(double amount) {
		if(amount <= this.balance) {
			this.balance -= amount;
			System.out.println("Balance is :"+this.balance);
		}else {
			System.out.println("Sorry! you don't have sufficient funds...");
		}
	}
	public void deposite(double amount) {
		this.balance += amount;
		System.out.println("Balance is :"+this.balance);
	}
	
	public void showDetails() {
		System.out.println("*".repeat(50));
		System.out.println("Acc Number : "+this.accno);
		System.out.println("Name       : "+this.name);
		System.out.println("Balance    : "+this.balance);
		System.out.println("*".repeat(50));
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
