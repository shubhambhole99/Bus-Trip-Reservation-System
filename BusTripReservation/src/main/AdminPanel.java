package main;

import java.util.Scanner;

import usecases.AddBus;
import usecases.ConfirmTicket;
import usecases.ExitApp;
import usecases.LogoutAdmin;
import usecases.ShowAllBuses;

public class AdminPanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select from following option");
		System.out.println("----------------------------");
		System.out.println("1.Add Bus to Database");
		System.out.println("2.Confirm tickets");
		System.out.println("3.All Buses");
		System.out.println("4.Logout");
		System.out.println("5.Exit Application.");
		System.out.println("----------------------------");
		
		int i = sc.nextInt();
		if(i==1) {
			AddBus.main(args);
		}
		if(i==2) {
			ConfirmTicket.main(args);
		}
		if(i==3) {
			ShowAllBuses.main(args);
		}
		if(i==4) {
			LogoutAdmin.main(args);
		}
		if(i==5) {
			ExitApp.main(args);
		}
	
	}

}
