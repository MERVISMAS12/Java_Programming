package ATMProject;

import java.util.Scanner;

public class Account {
	private int customerNumber;
	private int pinNumber;
	private double savingBalance=0;
	private double checkingBalance=0;
	
	Scanner input = new Scanner(System.in);
	
	public int setCustomerNumber(int num) {
		this.customerNumber = num;
		return this.customerNumber;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public int setPinNumber(int pin) {
		this.pinNumber = pin;
		return this.pinNumber;
	}
	
	private double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance-amount);
		return savingBalance;
	}
	private double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance-amount);
		return checkingBalance;
	}
	private double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance+amount);
		return savingBalance;
	}
	private double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance+amount);
		return checkingBalance;
	}
	
	public void getSavingWithdraw() {
		System.out.println("Saving Balanace: "+ getSavingBalance());
		System.out.println("Enter the Account to Withdraw: ");
		double amount = input.nextDouble();
		if(getSavingBalance() - amount >= 0) {
			calcSavingWithdraw(amount);
		}else {
			System.out.println("\nSaving Balanace cannot be negative \n");

		}
	}
	public void getCheckingWithdraw() {
		System.out.println("Checking Balanace: "+ getCheckingBalance());
		System.out.println("Enter the Account to Withdraw: ");
		double amount = input.nextDouble();
		if(getCheckingBalance() - amount >= 0) {
			calcCheckingWithdraw(amount);
		}else {
			System.out.println("\nChecking Balanace cannot be negative \n");

		}
	}
	public void getSavingDeposit() {
		System.out.println("Saving Balanace: "+ getSavingBalance());
		System.out.println("Enter the Account to Deposit: ");
		double amount = input.nextDouble();
		if(getSavingBalance() + amount >= 0) {
			calcSavingDeposit(amount);
		}else {
			System.out.println("\nSaving Balanace cannot be negative \n");

		}
	}
	public void getCheckingDeposit() {
		System.out.println("Checking Balanace: "+ getCheckingBalance());
		System.out.println("Enter the Account to Deposit: ");
		double amount = input.nextDouble();
		if(getCheckingBalance() - amount >= 0) {
			calcCheckingDeposit(amount);
		}else {
			System.out.println("\nChecking Balanace cannot be negative \n");

		}
	}
	
}
