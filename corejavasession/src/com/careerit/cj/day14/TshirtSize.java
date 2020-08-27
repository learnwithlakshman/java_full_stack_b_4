package com.careerit.cj.day14;

public enum TshirtSize {

		S(36),M(38),L(40);
		
		private int size;
		private TshirtSize(int size) {
			this.size = size;
		}
		
		public int getSizeValue() {
			return size;
		}
	
}
