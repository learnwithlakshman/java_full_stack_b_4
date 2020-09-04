package com.careerit.cj.day17;

public class Manager {

	
			public static void main(String[] args) {
				
				Account[] accounts = getAccounts();
				
				
				for(Account acc :accounts) {
				
					acc.showDetails();
					System.out.println("----------------------------");
					
					
				}
				
				double svc_amount = 0;
				
				
				
				// > 100000   500 < 200
				
				int min_amount = 200;
				int max_amout = 500;
				for(Account acc:accounts) {
					
					if(acc.getBalance() > 100000) {
						acc.withDraw(max_amout);
						svc_amount += max_amout;
					}else {
						acc.withDraw(min_amount);
						svc_amount += min_amount;
					}
				}
				
				System.out.println("Total amount collected is :"+svc_amount);
				
				
			
			
			// What is total amount in the bank
			
			
			// Max balance customer 
			
			double max_amount = accounts[0].getBalance();
			
			for(int i=1;i<accounts.length;i++) {
				if(accounts[i].getBalance() > max_amount) {
					max_amount = accounts[i].getBalance();
				}
			}
			
			System.out.println("\nMax balanced customer(s) and Max amount :"+max_amount+"\n");
			
			for(Account acc :accounts) {
				if(acc.getBalance() == max_amount) {
					acc.showDetails();
					System.out.println("-----------------------------");
				}
			}
			
			// Who is min balance customer
			
			
			// Get customer who has balance 800000 - 150000
			
			
			// Get customer by name ( ven ) 
			
			
			// Get customer by account number
			
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			public static Account[] getAccounts() {
				Account account1 = new Account(30363942399L, "Krish", 50000);
				Account account2 = new Account(30363942398L, "Manoj", 150000);
				Account account3 = new Account(30363942397L, "Ramesh", 850000);
				Account account4 = new Account(30363942396L, "Suresh", 8850000);
				Account account5 = new Account(30363942395L, "Venakt", 9950000);
				Account account6 = new Account(30363942394L, "Babu", 9950000);
				
				Account[] accounts = {account1,account2,account3,account4,account5,account6};
				return accounts;
			}
}
