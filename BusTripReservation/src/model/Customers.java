package model;

public class Customers {
private int customerid;
private String username;
private String password;
private String name;
private int age;
private String address;
private int mobile;
public Customers(int customerid, String username, String password, String name, int age, String address, int mobile) {
	super();
	this.customerid = customerid;
	this.username = username;
	this.password = password;
	this.name = name;
	this.age = age;
	this.address = address;
	this.mobile = mobile;
}
public Customers() {
	// TODO Auto-generated constructor stub
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Customers [customerid=" + customerid + ", username=" + username + ", password=" + password + ", name="
			+ name + ", age=" + age + ", address=" + address + ", mobile=" + mobile + "]";
}



	
	
}
