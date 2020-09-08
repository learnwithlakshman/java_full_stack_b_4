package com.careerit.cj.day18;

public final class GenerateId {

	private static int id = 1001;

	public static int getNewId() {
		return id++;
	}

}
