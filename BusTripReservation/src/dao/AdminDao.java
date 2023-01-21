package dao;

import java.util.List;

import exception.AdminException;
import exception.BusException;
import model.Bus;

public interface AdminDao {

public String AdminLogin(String username,String password) throws AdminException;

public String AddBus(Bus b) throws BusException;

public List<Bus> ShowAllBuses() throws BusException;

public String Logout() throws AdminException;
}
