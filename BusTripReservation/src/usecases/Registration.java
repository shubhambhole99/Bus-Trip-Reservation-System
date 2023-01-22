package usecases;

import java.util.Scanner;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import exception.CustomerException;
import model.Customers;

public class Registration {
//	String name;
//	String age;
//	String Address;
//	String
//how to start another code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Address:");
		String Address=sc.nextLine();
		System.out.println("Enter Mobile:");
		String mobile=sc.nextLine();
		System.out.println("Your UserName is:");
		String username=sc.nextLine();
		System.out.println("Enter a Password");
		String password=sc.nextLine();
		CustomerDao cd=new CustomerDaoImpl();
//		Customers c=new Customers("sbhole61299","bhole123","Shubham",18,"Mumbai","9820282994");
        String message=null;
    	Customers c=new Customers();
		c.setName(name);
		c.setAge(age);
		c.setAddress(Address);
		c.setMobile(mobile);
		c.setUsername(username);
		c.setPassword(password);
        try {
			message=cd.Register(c);
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(message);
	
    	sc.close();

	}
}
