package com.careerit.cj.day18;

public class SavingsAccount extends Account {

		private double minBalance;
		
		public SavingsAccount(String name,double balance,double minBalance) {
				super(name,balance);
				this.minBalance = minBalance;
		}
		
		@Override
		public void withDraw(double amount) {
			if(amount <= (this.balance - minBalance) ){
				this.balance -= amount;
				System.out.println("Balance is :"+this.balance);
			}else {
				System.out.println("Sorry! you don't have sufficient funds...");
			}
		}

		public double getMinBalance() {
			return minBalance;
		}

		public void setMinBalance(double minBalance) {
			this.minBalance = minBalance;
		}

	
		
	
}
