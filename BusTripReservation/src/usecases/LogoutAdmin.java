package usecases;

import dao.AdminDao;
import dao.AdminDaoImpl;
import exception.AdminException;
import main.AdminPanel;
import main.Main;

public class LogoutAdmin {

public static void main(String[] args) {
		
		AdminDao admin = new AdminDaoImpl();
		
		try {
			String result = admin.Logout();
			System.out.println(result);
			System.out.println("-----------------------------------------");
			System.out.println("");
			Main.main(args);
		} catch (AdminException e) {
			System.out.println(e.getMessage());
			System.out.println("-----------------------------------------");
			System.out.println("");
			AdminPanel.main(args);
		}

}
}
