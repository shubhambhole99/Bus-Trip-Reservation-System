package main;

import java.util.Scanner;

import usecases.ExitApp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("+-------------------------------------------+");
		System.out.println("| *****************BUSDHUNDO*************** |");
		System.out.println("+-------------------------------------------+");
        System.out.println();
        System.out.println("Select an option");
		System.out.println("----------------------------");
		System.out.println("1. Admin");
		System.out.println("2. Customer"); 
		System.out.println("3. Exit Application.");
		System.out.println("----------------------------");
		System.out.println();
		int i=sc.nextInt();
		if(i==1) {
			Admin.main(args);
		}
		else if(i==2) {
			Customer.main(args);
		}
		else if(i==3) {
			ExitApp.main(args);
		}
		else {
			System.out.println("Select a valid option");
			Main.main(args);
		}
		sc.close();

	}

}
