package usecases;

import java.util.Scanner;

import main.Customer;
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
		System.out.println("Enter Address:");
		String Address=sc.nextLine();
		System.out.println("Enter Mobile:");
		int mobile=sc.nextInt();
		System.out.println("Your UserName is:");
		String username=sc.nextLine();
		System.out.println("Enter a Password");
		String password=sc.nextLine();
		CustomerDao cd=new CustomerDaoImpl();
		Customers c=new Customers();
		c.setName(name);
		c.setAge(age);
		c.setAddress(Address);
		c.setMobile(mobile);
		c.setUsername(username);
		c.setPassword(password);
		
	}
}
