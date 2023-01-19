package model;

public class Bookings {
private int BookingId;
private int CustomerId;
private int Busno;
private boolean Confirm;
public Bookings(int bookingId, int customerId, int busno, boolean confirm) {
	super();
	BookingId = bookingId;
	CustomerId = customerId;
	Busno = busno;
	Confirm = confirm;
}
public int getBookingId() {
	return BookingId;
}
public void setBookingId(int bookingId) {
	BookingId = bookingId;
}
public int getCustomerId() {
	return CustomerId;
}
public void setCustomerId(int customerId) {
	CustomerId = customerId;
}
public int getBusno() {
	return Busno;
}
public void setBusno(int busno) {
	Busno = busno;
}
public boolean getConfirm() {
	return Confirm;
}
public void setConfirm(boolean confirm) {
	Confirm = confirm;
}
@Override
public String toString() {
	return "Bookings [BookingId=" + BookingId + ", CustomerId=" + CustomerId + ", Busno=" + Busno + ", Confirm="
			+ Confirm + "]";
}

	
	
}
