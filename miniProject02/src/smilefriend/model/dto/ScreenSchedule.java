package smilefriend.model.dto;

public class ScreenSchedule {
	
	private String date;
	
	private String showtime;
	
	private String starttime;
	
	private String endtime;
	
	private String theater;
	
	private String seats;
	
	public ScreenSchedule () {}
	
	public ScreenSchedule (String date, String showtime, String starttime, String endtime, String theater, String seats) {
		super();		
		
		this.date = date;
		this.showtime = showtime;
		this.starttime = starttime;
		this.endtime = endtime;
		this.theater = theater;
		this.seats = seats;		
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getShowtime() {
		return showtime;
	}
	
	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}
	
	public String getStarttime() {
		return starttime;
	}
	
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	
	public String getEndtime() {
		return endtime;
	}
	
	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}
	
	public String getTheater() {
		return theater;
	}
	
	public void setTheater(String theater) {
		this.theater = theater;
	}
	public String getSeats() {
		return seats;
	}
	
	public void setSeats(String seats) {
		this.seats = seats;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" 상영 날짜 : ");
		builder.append(date);
		builder.append(", 회차 : ");
		builder.append(showtime);
		builder.append(", 시작시간 ");
		builder.append(starttime);
		builder.append(", 종료시간 ");
		builder.append(endtime);
		builder.append(", 상영관 : ");
		builder.append(theater);
		builder.append(", 총 좌석 수 : ");
		builder.append(seats);
			return builder.toString();
	}
}
