package usecases;

import java.util.Scanner;

import dao.AdminDao;
import dao.AdminDaoImpl;
import exception.AdminException;
import main.Admin;
import main.AdminPanel;

public class LoginAdmin {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Admin Username:");
	String username = sc.next();
	
	System.out.println("Enter Admin Password:");
	String password = sc.next();
	
	
	AdminDao adminDao = new AdminDaoImpl();
	
	try {
		String Message = adminDao.AdminLogin(username, password);
		System.out.println(Message);
		AdminPanel.main(args);
		
	} catch (AdminException e) {
		System.out.println(e.getMessage());
		LoginAdmin.main(args);
	}

	sc.close();
}

}
