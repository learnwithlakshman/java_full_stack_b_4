package com.careerit.cj.day18;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			AccountService service = new AccountServiceImpl();
			while(true) {
				
				System.out.println("*".repeat(100));
				System.out.println("1. Account Ope 2. View Account Stat 3. Get Accounts by type 4.Exit");
				System.out.println("*".repeat(100));
				System.out.println("Enter the the choice: ");
				int ch = sc.nextInt();
				if(ch == 1) {
					System.out.println("1. Add 2. Get By Id 3. Withdraw 4. Deposite 5. Delete 6. Update 7.Main Menu");
					System.out.println("Enter the choice:");
					int ach = sc.nextInt();
					
					if(ach == 1) {
						System.out.println("Enter the Account type (S|C):");
						String type = sc.nextLine();
						sc.nextLine();
						System.out.println("Enter the name:");
						String name = sc.nextLine();
						System.out.println("Enter the balance:");
						double balance = sc.nextDouble();
						Account account =null;
						if(type.equalsIgnoreCase("S")) {
							account = new SavingsAccount(name, balance, 1000) ;
						}else {
							 account = new CurrentAccount(name, balance, 10000) ;
						}
						account = service.addAccount(account);
						System.out.println(account.getAccno()+" is created successfully...");
					}
					
				}
			
			}
		
	}
}
