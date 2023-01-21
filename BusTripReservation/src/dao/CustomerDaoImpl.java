package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.CustomerException;
import model.Bus;
import model.Customers;
import utility.DButil;

public class CustomerDaoImpl implements CustomerDao{
public static int cusid=1;
	
	
public String Register(Customers cus) throws CustomerException{
		String message="Not Registered";
		int cusid=0;
		try (Connection conn = DButil.provideConnection()) {
			
		PreparedStatement ps = conn.prepareStatement("select MAX(Customerid) from customers");
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
		cusid=rs.getInt("MAX(Customerid)");
		
			}
		else {
		cusid=0;
			}
		cusid++;
		//mess=String.valueOf(cusid);
		
		} catch (SQLException e) {
		// TODO Auto-generated catch block
				e.printStackTrace();
		}
		try (Connection conn = DButil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into customers values(?,?,?,?,?,?,?)");
		
		ps.setInt(1, cusid);
		ps.setString(2, cus.getPassword());
		ps.setString(3, cus.getUsername());
		ps.setString(4, cus.getName().toUpperCase());
		ps.setInt(5, cus.getAge());
		ps.setString(6, cus.getAddress().toUpperCase());
		ps.setString(7, cus.getMobile());
		
		int x = ps.executeUpdate();
		
		if(x>0) {
			message = "Customer Registered Successfully.";
		} else {
			throw new CustomerException(message);
		}
			
		} catch (SQLException e) {
			throw new CustomerException("Customer already exists!");
		}
		
		return message;
		
					
		
	}

@Override
public Customers Login(String username, String password) throws CustomerException {
	Customers cust = new Customers();
	
	try (Connection conn = DButil.provideConnection()) {
		
		PreparedStatement ps = conn.prepareStatement("select * from customers where username=? AND password=?");
		
		ps.setString(1, username);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			CustomerDaoImpl.cusid=rs.getInt("customerid");
			cust.setName(rs.getString("name"));
			cust.setAge(rs.getInt("age"));
			cust.setAddress(rs.getString("address"));
			cust.setMobile(rs.getString("mobile"));
			cust.setUsername(rs.getString("username"));
			cust.setPassword(rs.getString("password"));
		
		} else {
			throw new CustomerException("Invalid Credentials!");
		}
	} catch (SQLException e) {
		throw new CustomerException(e.getMessage());
	}

	return cust;
		
	
}

public List<Bus> ShowBus(String from, String to, int seats) throws CustomerException {
	List<Bus> al = new ArrayList<>();
	
	try (Connection conn = DButil.provideConnection()) {
		
		PreparedStatement ps = conn.prepareStatement("select * from bus where routefrom = ? AND routeto=? AND availableseats >= ?");

		
		
		ps.setString(1, from);
		ps.setString(2, to);
		ps.setInt(3, seats);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			Bus bus = new Bus();
			bus.setBusname(rs.getString("busname"));
			bus.setBusno(rs.getInt("busno"));
			bus.setBusType(rs.getString("bustype"));
			bus.setRouteFrom(rs.getString("routefrom"));
			bus.setRouteTo(rs.getString("routeto"));
			bus.setArrivaltime(rs.getString("routeto"));
			bus.setDeparturetime(rs.getString("departuretime"));
			bus.setTotalseats(rs.getInt("totalseats"));
			bus.setAvailableseats(rs.getInt("availableseats"));
			bus.setFare(rs.getInt("fare"));
			
			al.add(bus);
			
		} 
		if(al.size() == 0) {
			throw new CustomerException("No bus Available");
		}
	} catch (SQLException e) {
		throw new CustomerException(e.getMessage());
	}

	return al;
}
public String BookTicket(int busNo, int seats) throws CustomerException {
	String message = "Seats couldn't not be booked!";
	int boid=0;
	try (Connection conn = DButil.provideConnection()) {
		
	PreparedStatement ps = conn.prepareStatement("select MAX(bookingid) from bookings");
	ResultSet rs=ps.executeQuery();
	
	if(rs.next()) {
	boid=rs.getInt("MAX(bookingid)");
	
		}
	else {
	boid=0;
		}
	boid++;
	//mess=String.valueOf(cusid);
	
	} catch (SQLException e) {
	// TODO Auto-generated catch block
			e.printStackTrace();
	}
	
	try (Connection conn = DButil.provideConnection()) {
		
		PreparedStatement ps = conn.prepareStatement("insert into bookings values (?,?,?,?,?)");
		ps.setInt(1, boid);
		ps.setInt(2,cusid);
		ps.setInt(3, busNo);
		ps.setInt(4, 0);
		ps.setInt(5, seats);
		
		
		int x = ps.executeUpdate();
		 
		if(x > 0) {
			message = "Wait for confirmation";
		}
		
	} catch (SQLException e) {
		throw new CustomerException(e.getMessage());
	}

	return message;
}

@Override
public String CancelTicket() throws CustomerException {
	// TODO Auto-generated method stub
	String message="Not Cancelled";
	
		try (Connection conn = DButil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select * from bookings where customerid = ?");
			ps.setInt(1, cusid);
			
			ResultSet rs = ps.executeQuery();
			boolean flag = false;
			int count = 1;
			while(rs.next()) {
				flag = true;
				if(count == 1) {
					System.out.printf("+------------+----------------------+------------+-------------------------+%n");
					System.out.printf("| %-10s | %-20s | %-10s | %-23s |%n", "Booking ID", "Bus Name", "Bus No", "Bus Route");
					System.out.printf("+------------+----------------------+------------+-------------------------+%n");
					count++;
				}
				System.out.printf("| %-10s | %-20s | %-10s | %-23s |%n", rs.getInt("bookingid"), rs.getInt("customerid"), rs.getInt("busno"), rs.getBoolean("confirm"),rs.getInt("seats"));
			}
			
			
				if(flag) {
					Scanner sc = new Scanner(System.in);
					System.out.println();
					System.out.println("To cancel ticket");
					System.out.println("Enter Booking ID:");
					int bookingId = sc.nextInt();
					
					PreparedStatement ps1 = conn.prepareStatement("delete from bookings where bookingid = ?");
					ps1.setInt(1, bookingId);
					
					int x = ps1.executeUpdate();
					
						if(x>0) {
							message = "Ticket cancelled successful";
						} else {
							throw new CustomerException("Please enter correct booking id.");
						}
					
	


	
	
}} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
					return message;
				}}
