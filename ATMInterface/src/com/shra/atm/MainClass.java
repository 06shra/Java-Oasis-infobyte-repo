package com.shra.atm;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int atmnumber=318051;
		int atmpin=2580;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Shraddha's ATM Interface!!!");
		System.out.print("Enter the atm number:");
		int atmNumber = scan.nextInt();
		System.out.print("Enter the pin:");
		int atmPin = scan.nextInt();
		if((atmnumber==atmNumber)&&(atmpin==atmPin)) {
			AtmOperationInterface op = new AtmOperationImpl();
			while(true) {
				System.out.println("1.View Available Balance\n 2.Withdraw\n 3.Deposit\n 4.view MiniStatement\n 5.Exit");
				System.out.println("Enter your choice:");
				int ch = scan.nextInt();
				if(ch==1) {
					op.viewBalance();
				}
				else if(ch==2) {
					System.out.println("Enter amount to be withdraw");
					double withdrawAmount = scan.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}
				else if(ch==3) {
					System.out.println("Enter Amount to Deposit:");
					double depositAmount = scan.nextDouble();
					op.depositAmount(depositAmount);
				}
				else if(ch==4) {
					op.viewMiniStatement();
				}
				else if(ch==5) {
					System.out.println("Collect your ATM Card\n Thank you for visiting Shraddha's ATM");
					System.exit(0);
				}
				else {
					System.out.println("Please enter correct choice");
				}
			}
		}
		else {
			System.out.println("Invalid ATM number or pin");
			System.exit(0);
		}
	} 
}
