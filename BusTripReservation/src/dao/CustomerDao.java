package dao;


import java.util.List;

import exception.CustomerException;
import model.BookingHistory;
import model.Bus;
import model.Customers;


public interface CustomerDao {

public String Register(Customers cus) throws CustomerException;

public Customers Login(String Username,String Password) throws CustomerException;

public List<Bus> ShowBus(String from, String to, int seats) throws CustomerException;


public String CancelTicket() throws CustomerException;

public String BookTicket(int busNo, int seats) throws CustomerException;

public List<BookingHistory> BookingHistory() throws CustomerException;

}