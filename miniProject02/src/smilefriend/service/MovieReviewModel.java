package smilefriend.service;

import java.util.ArrayList;

import smilefriend.exception.NotFoundMovieException;
import smilefriend.model.dto.MovieReview;
import smilefriend.model.dto.ScreenSchedule;

public class MovieReviewModel {
	
	private static MovieReviewModel instance = new MovieReviewModel();		
	
	public ArrayList<MovieReview> movieList = new ArrayList<MovieReview>();
	
	private MovieReviewModel() {}
	
	public static MovieReviewModel getInstance() {
		return instance;
	}

	public ArrayList<MovieReview> getMovieList(){
		return movieList;
	}
	
	public MovieReview getMovieReview(String movieName) throws NotFoundMovieException{
		
		for(MovieReview mr : movieList) {
			if(mr.getReviewName().equals(movieName)) {
				return mr;
			}
		}
		throw new NotFoundMovieException("고객님이 검색하신 영화는 없습니다. 확인 후 다시 검색해 주세요.");
	}
	
	public void movieReviewInsert(MovieReview movie) {
		movieList.add(movie);
	}
	
	public void screenInformUpdate(String movieName, ScreenSchedule schedule) {
		
		for(MovieReview movie : movieList) {
			if(movie.getReviewName().equals(movieName)) {
				movie.setScreenInform(schedule);
				break;
			}
		}
	}
	
	public void movieDelete(String movieName) throws NotFoundMovieException{
		
		for(MovieReview movie : movieList) {
			if(movie.getReviewName().equals(movieName)) {
				movieList.remove(movie);
				return;
			}
		}
		throw new NotFoundMovieException(movieName + "삭제하려는 영화는 존재하지 않습니다.");
	}
	
	public int movieListSize() {
		return movieList.size();
	}
	
}