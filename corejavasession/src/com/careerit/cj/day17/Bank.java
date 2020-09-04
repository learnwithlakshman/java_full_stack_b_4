package com.careerit.cj.day17;

import java.util.List;

public class Bank {
		
		private String name;
		private List<Account> accounts;
		
		public Bank(String name, List<Account> accounts) {
			super();
			this.name = name;
			this.accounts = accounts;
		}

		@Override
		public String toString() {
			return "Bank [name=" + name + ", account=" + accounts + "]";
		}
		
		
		
		
		
}
