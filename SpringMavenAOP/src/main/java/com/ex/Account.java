package com.ex;

public class Account implements HdfcBank {

	public void withdraw() {
		System.out.println("Withdraw Logic");
	}

	public void deposit() {
		System.out.println("Deposit Logic");
	}

}
