package com.oasisbyte;

import java.util.Scanner;

public class OnlineReservation {
	private static boolean[] seats = new boolean[10];

	public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
		
		while(true) {
			
			//display menu
			System.out.println("\n Please select an option:");
			System.out.println("1. View Seat Map");
			System.out.println("2. Reserve seat");
			System.out.println("3. Cancel Reservation");
			System.out.println("4. Exit");
			
			//get user input
			int option = scan.nextInt();
			switch(option) {
			case 1:
				viewSeatMap();
				break;
			case 2:
				reserveSeat();
				break;
			case 3:
				cancelReservation();
				break;	
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid option!");
			}
		}
		
	}

	private static void viewSeatMap() {
		System.out.println("\n Current Seat Map:");
		for(int i=0;i<seats.length;i++) {
			if(seats[i]) {
				System.out.println("X"); //print an "X" if the seat is reserver
			}else {
				System.out.println((i+1)+ " "); //print the seat number if it's empty
			}
		}
		System.out.println();
	}
	
	private static void reserveSeat() {
		Scanner scan=new Scanner(System.in);
		System.out.println("\nEnter seat number(1-10):");
		int seatNumber =scan.nextInt();
		if(seatNumber < 1 || seatNumber > 10) {
			System.out.println("Inavlid seat number!");
		}else if(seats[seatNumber - 1]) {
			System.out.println("Seat already reserverd!");
		}else {
			seats[seatNumber - 1] = true; //reserve the seat
			System.out.println("Seat reserved");
		}
	}
	
	private static void cancelReservation() {
		Scanner scan= new Scanner(System.in);
		System.out.println("\n Enter seat number(1-10):");
		int seatNumber = scan.nextInt();
		if(seatNumber < 1 || seatNumber > 10) {
			System.out.println("Inavlid seat number!");
		}else if(!seats[seatNumber-1]) {
			System.out.println("Seat not reserved");
		}else {
			seats[seatNumber - 1] = false; //unreserve the seat
			System.out.println("Reservation canceled");
		}
	}
		

	}


