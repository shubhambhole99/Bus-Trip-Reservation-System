package main;

import java.util.Scanner;

import usecases.Login;
import usecases.Registration;


public class Customer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select from following option");
		System.out.println("------------------------------");
		System.out.println("1.Login");
		System.out.println("2.Register New Customer");
		System.out.println("3.Back to the Main Menu");
		System.out.println("------------------------------");
		System.out.println();
		int i = sc.nextInt();
	
		
	if(i==1) {
		Login.main(args);
	}
	if(i==2) {
		Registration.main(args);
	}
	if(i==3) {
		Main.main(args);
	}
		
		sc.close();
	}

}
