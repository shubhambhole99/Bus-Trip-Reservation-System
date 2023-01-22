package main;

import java.util.Scanner;

import exception.CustomerException;
import usecases.CancelTicket;
import usecases.Logout;
import usecases.ShowBus;
import usecases.ShowHistory;

public class CustomerPanel {

	public static void main(String[] args) throws CustomerException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Selct from following option");
		System.out.println("---------------------------");
		System.out.println("1.Search Bus");
		System.out.println("2.Booking History");
		System.out.println("3.Cancel Ticket");
		System.out.println("4.Logout");
		System.out.println("5.Main Menu");
		System.out.println("---------------------------");

		int i = sc.nextInt();
		System.out.println();
		if(i==1) {
		ShowBus.main(args);
		}
		if(i==2) {
		ShowHistory.main(args);
		}
		if(i==3) {
		CancelTicket.main(args);
		}
		if(i==4) {
			Logout.main(args);
		}
		if(i==5) {
			Main.main(args);
		}
	}

}
