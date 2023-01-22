package usecases;

import dao.AdminDao;
import dao.AdminDaoImpl;
import exception.BusException;
import main.AdminPanel;
import main.Customer;
import model.Customers;

public class ConfirmTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDao adminDao = new AdminDaoImpl();
		
		try {
			Customers cus = adminDao.ConfirmTicket();
			System.out.println("");
			System.out.println("Customer Contact Details");
			System.out.println("Name: "+cus.getName());
			System.out.println("Phone: "+cus.getMobile());
			System.out.println("Address: "+cus.getAddress());
			System.out.println("-----------------------------------------");
			System.out.println("");
			AdminPanel.main(args);
		} catch (BusException e) {
			System.out.println(e.getMessage());
			System.out.println("-----------------------------------------");
			System.out.println("");
			AdminPanel.main(args);
		}

	}

}
