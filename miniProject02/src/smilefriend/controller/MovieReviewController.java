package smilefriend.controller;

import java.util.ArrayList;

import smilefriend.exception.NotFoundMovieException;
import smilefriend.model.dto.MovieReview;
import smilefriend.model.dto.ScreenSchedule;
import smilefriend.service.MovieReviewModel;
import smilefriend.view.FailView;
import smilefriend.view.SuccessView;

public class MovieReviewController {

	private static MovieReviewModel service = MovieReviewModel.getInstance();
	
	public static void getMovieList() {
		ArrayList<MovieReview> movies = service.getMovieList();
		
		if(movies.size() != 0) {
			SuccessView.movieListView(movies);
		}else {
			FailView.printFail(" 현재 상영중인 영화는 없습니다.");
		}
	}
	
	public static void getMovieReview(String movieName) {
		try {
			SuccessView.movieView(service.getMovieReview(movieName));
		} catch (NotFoundMovieException e) {
			e.printStackTrace();
			FailView.printFail(e.getMessage());
		}
	}

	public static void movieReviewInsert(MovieReview movie) {
		if(movie !=null) {
			service.movieReviewInsert(movie);
		}else {
			FailView.printFail("입력 정보가 유효하지 않으니 재확인 해주세요.");
		}
		
	}
	
	public static void screenInformUpdate(String movieName, ScreenSchedule schedule) {
		
		if(movieName != null && schedule != null) {
			
			service.screenInformUpdate(movieName, schedule);
			
			SuccessView.successMessage("해당 영화의 정보 수정 완료했습니다.");
		}else {
			
			FailView.printFail("갱신 시도하려는 영화의 입력 정보를 재확인 해주세요.");
		}
	}

	public static void movieDelete(String movieName) {
	
		if(movieName != null) {
			
			try{
				service.movieDelete(movieName);
				SuccessView.successMessage(movieName + " 가 삭제 되었습니다.");				
			}catch(NotFoundMovieException e) {
				e.printStackTrace();
				FailView.printFail(e.getMessage());
				}
			}else {
				
				FailView.printFail("삭제 요청하신 영화 입력 여부 재 확인 해주세요.");
			}
		}
	
}
