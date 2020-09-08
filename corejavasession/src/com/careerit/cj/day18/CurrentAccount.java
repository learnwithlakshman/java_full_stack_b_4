package com.careerit.cj.day18;

public class CurrentAccount extends Account {
	private double overDraft;
	
	public CurrentAccount(String name,double balance,double overDraft) {
			super(name,balance);
			this.setOverDraft(overDraft);
	}
	
	@Override
	public void withDraw(double amount) {
		if(amount <= (this.balance + getOverDraft())) {
			this.balance -= amount;
			System.out.println("Balance is :"+this.balance);
		}else {
			System.out.println("Sorry! you don't have sufficient funds...");
		}
	}
	
	

	public double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}
}
