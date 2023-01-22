package usecases;

import java.util.List;

import dao.AdminDao;
import dao.AdminDaoImpl;
import exception.BusException;
import model.Bus;

public class ShowAllBuses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDao ad=new AdminDaoImpl();

			List<Bus> bus;
//			System.out.println("+----------------------+------------+--------+-------------------------+----------------+----------------+-------------+-----------------+--------------+");
//			System.out.println("| BusNo | BusName | BusType | RouteFrom | RouteTo | DepartureTime | ArrivalTime | TotalSeats | AvailableSeats | Fare");
//			System.out.println("+----------------------+------------+--------+-------------------------+----------------+----------------+-------------+-----------------+--------------+");


			try {
				bus = ad.ShowAllBuses();
				
				if(bus.size()>0) {
					System.out.printf("+----------------------+------------+--------+-------------------------+----------------+----------------+-------------+-----------------+--------------+%n");
					System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-23s | %-23s | %-11s | %-15s | %-12s |", "BusNo", "BusName", "BusType", "RouteFrom","RouteTo", "Arrival Time", "Departure Time", "Total Seats", "Available Seats", "Ticket Price");
					System.out.println();
					System.out.printf("+----------------------+------------+--------+-------------------------+----------------+----------------+-------------+-----------------+--------------+%n");
					
					
					
								}
								bus.forEach(e -> {
//									System.out.println(s);
									System.out.println(System.out.printf("| %-15s | %-15s | %-15s | %-15s | %-15s | %-23s | %-23s | %-11s | %-15s | %-12s |",e.getBusno(),e.getBusname(),e.getBusType(),e.getRouteFrom(),e.getRouteTo(),e.getArrivaltime(),e.getDeparturetime(),e.getTotalseats(),e.getAvailableseats(),e.getFare()));
								});
			} catch (BusException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		
	
}
	}
