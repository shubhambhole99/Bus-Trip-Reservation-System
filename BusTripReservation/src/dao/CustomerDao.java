package dao;


import exception.CustomerException;
import model.Customers;


public interface CustomerDao {

public String Register(Customers cus) throws CustomerException;


}