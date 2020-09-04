package com.careerit.cj.day17;


public class Account extends Object {

		long accNumber;
		String name;
		double balance;
		
		public Account(long accNumber, String name, double balance) {
			this.accNumber = accNumber;
			this.name = name;
			this.balance = balance;
		}
		
		
		public void withDraw(double amount) {
			System.out.println("Requested for withdraw amount: "+amount +" for account :"+accNumber);
			if(balance >= amount) {
				this.balance -= amount;
				System.out.println("Current balance of "+accNumber +" after withdraw is :"+balance);
			}else {
				System.out.println("Sorry! insufficient funds");
			}
			
		}
		
		public void deposite(double amount) {
			
			System.out.println("Requested for deposite amount: "+amount +" for account :"+accNumber);
			balance += amount;
			System.out.println("Current balance of "+accNumber +" after deposite is :"+balance);
		}
		
		public void showDetails() {
			System.out.println("Acc number   :"+accNumber);
			System.out.println("Name         :"+name);
			System.out.println("Balance      :"+balance);
		}
		
		public long getAccNumber() {
			return accNumber;
		}
		public void setAccNumber(long accNumber) {
			this.accNumber = accNumber;
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
	
		
	
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (accNumber ^ (accNumber >>> 32));
			long temp;
			temp = Double.doubleToLongBits(balance);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Account other = (Account) obj;
			if (accNumber != other.accNumber)
				return false;
			if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}


		@Override
		public String toString() {
			return "Account [accNumber=" + accNumber + ", name=" + name + ", balance=" + balance + "]";
		}
		
			
}
