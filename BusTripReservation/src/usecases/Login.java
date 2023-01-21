package usecases;

import java.util.Scanner;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import exception.CustomerException;
import main.Customer;
import main.CustomerPanel;
import model.Customers;

public class Login {

		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username:");
		String username = sc.next();
		
		System.out.println("Enter Password:");
		String password = sc.next();
		
		
		CustomerDao custDao = new CustomerDaoImpl();
		
		try {
			Customers cust = custDao.Login(username, password);
			System.out.println("Login Successful");
			System.out.println("-----------------------------------------");
			System.out.println("Welcome To Busdhundo"+cust.getName().toUpperCase());
			System.out.println("-----------------------------------------");
			
			CustomerPanel.main(args);
		} catch (CustomerException e) {
			System.out.println(e.getMessage());
//			System.out.println("-----------------------------------------");
			Customer.main(args);
		}
	
		sc.close();
	}

}
