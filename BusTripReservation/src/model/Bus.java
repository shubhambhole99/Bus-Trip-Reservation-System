package model;

public class Bus {
private int Busno;
private String Busname;
private String BusType;
private String RouteFrom;
private String RouteTo;
private String Departuretime;
private String Arrivaltime;
private int Totalseats;
private int Availableseats;
private int fare;
public Bus(int busno,String busname, String busType, String routeFrom, String routeTo, String departuretime,
		String arrivaltime, int totalseats, int availableseats, int fare) {
	super();
	Busno=busno;
	Busname = busname;
	BusType = busType;
	RouteFrom = routeFrom;
	RouteTo = routeTo;
	Departuretime = departuretime;
	Arrivaltime = arrivaltime;
	Totalseats = totalseats;
	Availableseats = availableseats;
	this.fare = fare;
}
public Bus() {
	// TODO Auto-generated constructor stub
}

public int getBusno() {
	return Busno;
}
public void setBusno(int busno) {
	Busno = busno;
}
public String getBusname() {
	return Busname;
}
public void setBusname(String busname) {
	Busname = busname;
}
public String getBusType() {
	return BusType;
}
public void setBusType(String busType) {
	BusType = busType;
}
public String getRouteFrom() {
	return RouteFrom;
}
public void setRouteFrom(String routeFrom) {
	RouteFrom = routeFrom;
}
public String getRouteTo() {
	return RouteTo;
}
public void setRouteTo(String routeTo) {
	RouteTo = routeTo;
}
public String getDeparturetime() {
	return Departuretime;
}
public void setDeparturetime(String departuretime) {
	Departuretime = departuretime;
}
public String getArrivaltime() {
	return Arrivaltime;
}
public void setArrivaltime(String arrivaltime) {
	Arrivaltime = arrivaltime;
}
public int getTotalseats() {
	return Totalseats;
}
public void setTotalseats(int totalseats) {
	Totalseats = totalseats;
}
public int getAvailableseats() {
	return Availableseats;
}
public void setAvailableseats(int availableseats) {
	Availableseats = availableseats;
}
public int getFare() {
	return fare;
}
public void setFare(int fare) {
	this.fare = fare;
}
@Override
public String toString() {
	return "Bus [Busno=" + Busno + ", Busname=" + Busname + ", BusType=" + BusType + ", RouteFrom=" + RouteFrom
			+ ", RouteTo=" + RouteTo + ", Departuretime=" + Departuretime + ", Arrivaltime=" + Arrivaltime
			+ ", Totalseats=" + Totalseats + ", Availableseats=" + Availableseats + ", fare=" + fare + "]";
}





	
}
