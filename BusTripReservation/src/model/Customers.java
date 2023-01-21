package model;

public class Customers {

private String username;
private String password;
private String name;
private int age;
private String address;
private String mobile;
public Customers( String username, String password, String name, int age, String address, String mobile) {
	super();

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
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Customers [ username=" + username + ", password=" + password + ", name="
			+ name + ", age=" + age + ", address=" + address + ", mobile=" + mobile + "]";
}



	
	
}
