package model;

public class BookingHistory {
	
	private int bid;
	private String busName;
	private String from;
	private String to;
	private int seats;
	private int fare;
	private int confirm;
	
	public BookingHistory(int bid, String busName, String from, String to, int seats, int fare, int confirm) {
		super();
		this.bid = bid;
		this.busName = busName;
		this.from = from;
		this.to = to;
		this.seats = seats;
		this.fare = fare;
		this.confirm = confirm;
	}
	public BookingHistory() {
		// TODO Auto-generated constructor stub
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public int getConfirm() {
		return confirm;
	}
	public void setConfirm(int i) {
		this.confirm = i;
	}
	@Override
	public String toString() {
		return "BookingHistory [bid=" + bid + ", busName=" + busName + ", from=" + from + ", to=" + to + ", seats="
				+ seats + ", fare=" + fare + ", confirm=" + confirm + "]";
	}
	
	
	
	
}
