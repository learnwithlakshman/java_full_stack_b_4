package com.careerit.cj.day18;

public interface AccountService {

	
			public Account addAccount(Account account);
			public Account[] getAccountsByType(AccountType type);
			public double totalBalance(AccountType type);
			public AccountStatRecord getStatOfAccounts();
			public boolean deleteAcount(int accNumber);
			public Account getAccountById(int accNumber);
			public Account updateAccount(Account account);
			public Account[] getAllAcounts();
}
