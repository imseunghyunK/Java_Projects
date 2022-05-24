package smilefriend.model.dto;

public class Movie {
	
	private String actor;
	
	private String rated;
	
	private String runningtime;
	
	private String comeoutdate;
	
	public Movie() {}
	
	public Movie(String actor, String rated, String runningtime, String comeoutdate) {
		super();
		this.actor = actor;
		this.rated = rated;
		this.runningtime = runningtime;
		this.comeoutdate = comeoutdate;
	}
	
	public String getActor() {
		return actor;
	}
	
	public void setActor(String actor) {
		this.actor = actor;
	}
	
	public String getErated() {
		return rated;
	}
	
	public void setRated(String rated) {
		this.rated = rated;
	}
	public String getErunningtime() {
		return runningtime;
	}
	
	public void setRunningtime(String runningtime) {
		this.runningtime = runningtime;
	}
	
	public String getComeoutdate() {
		return comeoutdate;
	}
	
	public void setComeoutdate(String comeoutdate) {
		this.comeoutdate = comeoutdate;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" 출연 배우 : ");
		builder.append(actor);
		builder.append(" 관람 등급 : ");
		builder.append(rated);
		builder.append(" 상영 시간 : ");
		builder.append(runningtime);
		builder.append(" 개봉 날짜 : ");
		builder.append(comeoutdate);
			return builder.toString();
	}

}
