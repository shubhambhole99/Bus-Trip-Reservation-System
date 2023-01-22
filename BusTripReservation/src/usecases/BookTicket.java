package usecases;

import java.util.Scanner;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import exception.CustomerException;
import main.CustomerPanel;

public class BookTicket {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter BusNo:");
		int busNo  = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Seats");
		int seats  = sc.nextInt();
		sc.nextLine();

		
		CustomerDao ad = new CustomerDaoImpl();
		
		try {
			String message = ad.BookTicket(busNo, seats);
			
			System.out.println(message);
			System.out.println("-----------------------------------------");
			System.out.println("");
			CustomerPanel.main(args);
		} catch (CustomerException e) {
			System.out.println(e.getMessage());
			System.out.println("-----------------------------------------");
			System.out.println("");
			BookTicket.main(args);
		}
		

	}

}
