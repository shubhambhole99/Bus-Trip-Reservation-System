package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import exception.AdminException;
import exception.BusException;
import model.Bus;
import utility.DButil;

public class AdminDaoImpl implements AdminDao{

	@Override
	public String AdminLogin(String username, String password) throws AdminException {
		// TODO Auto-generated method stub
		String message="Admin Login Failed! "
				+ "Try Again";
		if(username.equals("abcd") && password.equals("1234") ) {
			message="Login Successful";
		}
		else {
			throw new AdminException(message);
		}
		return message;
	}

	@Override
	public String AddBus(Bus bus) throws BusException {
			String message="Insertion Unsuccessful";
			int busno=0;
			try (Connection conn = DButil.provideConnection()) {
				
			PreparedStatement ps = conn.prepareStatement("select MAX(busno) from bus");
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			busno=rs.getInt("MAX(busno)");
			
				}
			else {
			busno=0;
				}
			busno++;
			//mess=String.valueOf(cusid);
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
					e.printStackTrace();
			}
			
			
			try (Connection conn = DButil.provideConnection()) {
				
				PreparedStatement ps = conn.prepareStatement("insert into bus values(?,?,?,?,?,?,?,?,?,?)");
				ps.setInt(1, busno);
				ps.setString(2, bus.getBusname());
				ps.setString(3, bus.getBusType());
				ps.setString(4, bus.getRouteFrom());
				ps.setString(5, bus.getRouteTo());
				ps.setString(6, bus.getDeparturetime());
				ps.setString(7, bus.getArrivaltime());
				ps.setInt(8, bus.getTotalseats());
				ps.setInt(9, bus.getAvailableseats());
				ps.setInt(10, bus.getFare());

				
				int x = ps.executeUpdate();
				
				if(x>0) {
					message = "Insertion successful.";
				} else {
					throw new BusException("Error!");
				}
				
			} catch (SQLException e) {
				throw new BusException(e.getMessage());
			}
			
			return message;
		
		
	}

	@Override
	public List<Bus> ShowAllBuses() throws BusException {
		// TODO Auto-generated method stub
List<Bus> al = new ArrayList<>();
		
		try (Connection conn = DButil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from bus");
						
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Bus bus = new Bus();
				bus.setBusno(rs.getInt("busno"));
				bus.setBusname(rs.getString("busname"));
				bus.setBusType(rs.getString("bustype"));
				bus.setRouteFrom(rs.getString("routefrom"));
				bus.setRouteTo(rs.getString("routeto"));
				bus.setArrivaltime(rs.getString("arrivaltime"));
				bus.setDeparturetime(rs.getString("departuretime"));
				bus.setTotalseats(rs.getInt("totalseats"));
				bus.setAvailableseats(rs.getInt("availableseats"));
				bus.setFare(rs.getInt("fare"));
				
				al.add(bus);
			}
			
			if(al.size() == 0) {
				throw new BusException("No buses found!");
			}
			
		} catch (SQLException e) {
			throw new BusException(e.getMessage());
		}		
		
		return al;
	}
	

	@Override
	public String Logout() throws AdminException {
		// TODO Auto-generated method stub
		String message="Logout Successful";
		return message;
	}

}
