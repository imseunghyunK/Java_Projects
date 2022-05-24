package smilefriend.view;

import java.util.ArrayList;

import smilefriend.model.dto.MovieReview;

public class SuccessView {
	
	public static void movieView(MovieReview movie) {
		if(movie != null) {
			System.out.println(movie);
		}else {
			System.out.println("해당 영화는 존재하지 않습니다.");
		}
	}
	
	public static void movieListView(ArrayList<MovieReview> allMovieReviews) {
		int index = 0;
		for(MovieReview movie : allMovieReviews) {
			System.out.println("현재 상영중인 영화" + (index+1) + " : " + movie.toString());
			index++;
		}
	}
	
	public static void successMessage(String successMessage) {
		System.out.println("진행상황 : " + successMessage);
	}
}
