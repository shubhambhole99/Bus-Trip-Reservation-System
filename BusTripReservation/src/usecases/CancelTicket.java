package usecases;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import exception.CustomerException;
import main.CustomerPanel;

public class CancelTicket {

	public static void main(String[] args) throws CustomerException {
		// TODO Auto-generated method stub

		CustomerDao ad = new CustomerDaoImpl();
		
		String message = ad.CancelTicket();
		System.out.println(message);
		
		CustomerPanel.main(args);
	}

}
