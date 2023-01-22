package usecases;

import java.util.List;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import exception.CustomerException;
import main.CustomerPanel;
import model.BookingHistory;

public class ShowHistory {
	public static void main(String[] args) {
		
		CustomerDao custDao = new CustomerDaoImpl();
		
		try {
			List<BookingHistory> ht = custDao.BookingHistory();
			
			if(ht.size()>0) {
				System.out.printf("+----------------------+------------+--------+-------------------------+----------------+----------------+-------------+-----------------+--------------+%n");
				System.out.printf("| %-15s | %-15s | %-15s | %-6s | %-10s | %-10s ", "BookingId", "BusName", "From", "To","Fare", "Seats");
				System.out.println();
				System.out.printf("+----------------------+------------+--------+-------------------------+----------------+----------------+-------------+-----------------+--------------+%n");
				
				
				
							}
							ht.forEach(e -> {
//								System.out.println(s);
								System.out.println(System.out.printf("| %-15s | %-15s | %-15s | %-6s | %-10s | %-10s ",e.getBid(),e.getBusName(),e.getFrom(),e.getTo(),e.getFare(),e.getSeats()));
							});
			System.out.println("");
			CustomerPanel.main(args);
			
		} catch (CustomerException e) {
			System.out.println(e.getMessage());
			System.out.println("-----------------------------------------");
			System.out.println("");
			CustomerPanel.main(args);
		}

//		sc.close();
	}
}
