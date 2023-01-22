package main;

import java.util.Scanner;

import usecases.LoginAdmin;

public class Admin {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Select an option");
	System.out.println("------------------");
	System.out.println("1.Login");
	System.out.println("2.Main Menu");
	System.out.println("------------------");
	int i = sc.nextInt();
	System.out.println();
	
	if(i==1) {
		LoginAdmin.main(args);
	}
	if(i==2) {
		Main.main(args);
	}
	
	sc.close();
}

}

