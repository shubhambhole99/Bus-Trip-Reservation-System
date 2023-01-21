package usecases;

import java.util.List;
import java.util.Scanner;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import exception.CustomerException;
import main.CustomerPanel;
import model.Bus;

public class ShowBus {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter From:");
		String from = sc.next();
		
		System.out.println("Enter To:");
		String to = sc.next();
				
		System.out.println("Enter No. of Seats:");
		int seats = sc.nextInt();
		
		CustomerDao ad = new CustomerDaoImpl();
		
		try {
			List<Bus> bus = ad.ShowBus(from, to, seats);
			
			if(bus.size()>0) {
				System.out.printf("+----------------------+------------+--------+-------------------------+----------------+----------------+-------------+-----------------+--------------+%n");
				System.out.printf("| %-15s | %-15s | %-15s | %-6s | %-10s | %-10s | %-10s | %-11s | %-15s | %-12s |", "BusNo", "BusName", "BusType", "RouteFrom","RouteTo", "Arrival Time", "Departure Time", "Total Seats", "Available Seats", "Ticket Price");
				System.out.println();
				System.out.printf("+----------------------+------------+--------+-------------------------+----------------+----------------+-------------+-----------------+--------------+%n");
				
				
				
							}
							bus.forEach(e -> {
//								System.out.println(s);
								System.out.println(System.out.printf("| %-15s | %-15s | %-15s | %-6s | %-10s | %-10s | %-10s | %-11s | %-15s | %-12s |",e.getBusno(),e.getBusname(),e.getBusType(),e.getRouteFrom(),e.getRouteTo(),e.getArrivaltime(),e.getDeparturetime(),e.getTotalseats(),e.getAvailableseats(),e.getFare()));
							});
			if(bus.size()>0) {
				System.out.printf("+----------------------+------------+--------+-------------------------+----------------+----------------+-------------+-----------------+--------------+%n");
				
			}
			
			if(bus.size()>0) {
				System.out.println("");
				System.out.println("1.Book Ticket");
				System.out.println("2.Back To Menu");
				int i = sc.nextInt();
//				
				if(i==1) {
					BookTicket.main(args);
				}
				if(i==2) {
					CustomerPanel.main(args);
				}
			
				}
			
			System.out.println("-----------------------------------------");
			System.out.println("");
			CustomerPanel.main(args);
			
		} catch (CustomerException e) {
			System.out.println(e.getMessage());
			System.out.println("-----------------------------------------");
			System.out.println("");
			CustomerPanel.main(args);
		}
	
		sc.close();
	}
}
