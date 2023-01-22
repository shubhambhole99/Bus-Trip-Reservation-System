package usecases;

import java.util.Scanner;

import dao.AdminDao;
import dao.AdminDaoImpl;
import exception.BusException;
import main.AdminPanel;
import model.Bus;

public class AddBus {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Bus Name:");
		String name = sc.nextLine();
		System.out.println("Enter Bus Type:");
		System.out.println("AC/NON-AC/DELUXE/VIP/ECONOMY");
		String type = sc.nextLine();		
		System.out.println("Enter Destination of departure");
		String from = sc.nextLine();
		System.out.println("Enter Destination of arrival:");
		String to = sc.nextLine();
		System.out.println("Enter Departure Time in yyyy-mm-dd hh:mm:ss:");
		String departureTime = sc.nextLine();
		System.out.println("Enter Arrival Time in yyyy-mm-dd hh:mm:ss");
		String arrivalTime = sc.nextLine();
		System.out.println("Enter No of seats:");
		int seats = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Fare:");
		int price = sc.nextInt();
//		2023-02-12 23:22:20
		Bus bus = new Bus();
//		Bus bus=new Bus("BomAmr","deluxe","Bombay","Amritsar","13:20:00","23:10:20",30,30,4000);
		bus.setBusname(name);
		bus.setBusType(type);
		bus.setRouteFrom(from);
		bus.setRouteTo(to);
		bus.setDeparturetime(departureTime);
		bus.setArrivaltime(arrivalTime);
		bus.setTotalseats(seats);
		bus.setAvailableseats(seats);
		bus.setFare(price);
		
		
		AdminDao ad = new AdminDaoImpl();
		
		try {
			String message = ad.AddBus(bus);
			System.out.println(message);
			AdminPanel.main(args);
		} catch (BusException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
			AddBus.main(args);
		}


			// TODO Auto-generated catch block
		
		
	
		sc.close();
	}

}
