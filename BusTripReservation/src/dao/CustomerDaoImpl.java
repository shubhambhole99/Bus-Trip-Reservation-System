package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import exception.CustomerException;
import model.Customers;
import utility.DButil;

public class CustomerDaoImpl implements CustomerDao{

	public String Register(Customers cus) throws CustomerException{
		String mess="Not Registered";
try (Connection conn = DButil.provideConnection()) {
			
PreparedStatement ps = conn.prepareStatement("select MAX(Customerid) from customers");
ResultSet rs=ps.executeQuery();
int cusid=0;
if(rs.next()) {
	cusid=rs.getInt("MAX(Customerid)");
	
}
else {
	cusid=0;
}
cusid++;
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		return null;
		
		
	}
	
	
}
