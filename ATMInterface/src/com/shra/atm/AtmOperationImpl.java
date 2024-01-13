package com.shra.atm;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterface{
	ATM atm = new ATM();
	Map<Double,String> ministmt = new HashMap<>();

	@Override
	public void viewBalance() {
		System.out.println("Available Balance is : "+atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalance()) {
				ministmt.put(withdrawAmount," Amount Withdrawn");
				System.out.println("Collect your cash "+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			else {
				System.out.println("Insufficient Balance !!");
			}
		}
		else {
			System.out.println("Please enter the amount in multipal of 5");
		}	
	}

	@Override
	public void depositAmount(double depositAmount) {
		ministmt.put(depositAmount," Amount deposited");
         System.out.println(depositAmount+" Deposited Succesfully !!");
		 atm.setBalance(atm.getBalance()+depositAmount);
		 viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double,String> m :ministmt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
	}

}
