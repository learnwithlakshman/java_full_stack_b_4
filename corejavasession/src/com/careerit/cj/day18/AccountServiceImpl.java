package com.careerit.cj.day18;

public class AccountServiceImpl implements AccountService {

	private Account[] acc;
	private int count = 0;

	public AccountServiceImpl() {
		acc = new Account[100];
	}

	@Override
	public Account addAccount(Account account) {
		int accno = GenerateId.getNewId();
		account.setAccno(accno);
		acc[count++] = account;
		return account;
	}

	@Override
	public Account[] getAccountsByType(AccountType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double totalBalance(AccountType type) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AccountStatRecord getStatOfAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAcount(int accNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account getAccountById(int accNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account updateAccount(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account[] getAllAcounts() {
		Account[] temp = new Account[count];
		for(int i=0;i<count;i++) {
			temp[i] = acc[i];
		}
		return temp;
	}

}
