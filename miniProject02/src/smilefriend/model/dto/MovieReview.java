package smilefriend.model.dto;

public class MovieReview {
	
	private String reviewName;
	
	private Movie movieInform;
	
	private ScreenSchedule screenInform;
	
	private String place;
	
	public MovieReview() {
		super();
	}
	
	public MovieReview(String reviewName, Movie movieInform, ScreenSchedule screenInform, String place) {
		super();
		this.reviewName = reviewName;
		this.movieInform = movieInform;
		this.screenInform = screenInform;
		this.place = place;
	}
	
	public String getReviewName() {
		return reviewName;
	}
	
	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}
	
	public Movie getMovieInform() {
		return movieInform;
	}
	
	public void setMovieInform(Movie movieInform) {
		this.movieInform = movieInform;
	}
	
	public ScreenSchedule getScreenInform() {
		return screenInform;
	}
	
	public void setScreenInform(ScreenSchedule screenInform) {
		this.screenInform = screenInform;
	}
	
	public String getPlace() {
		return place;
	}
	
	public void setPlace(String place ) {
		this.place = place;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" 영화 제목 : ");
		builder.append(reviewName);
		builder.append(", 영화 정보 -");
		builder.append(movieInform);
		builder.append(" 상영 정보 -");
		builder.append(screenInform);
		builder.append(" 영화관 : ");
		builder.append(place);
		return builder.toString();
		
	}
}
