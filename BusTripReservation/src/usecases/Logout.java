package usecases;

import dao.AdminDao;
import dao.AdminDaoImpl;
import exception.AdminException;
import main.AdminPanel;
import main.Main;

public class Logout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AdminDao ad = new AdminDaoImpl();
		
		try {
			String message = ad.Logout();
			System.out.println(message);
			Main.main(args);
		} catch (AdminException e) {
			System.out.println(e.getMessage());
			AdminPanel.main(args);
		}

	}


}
