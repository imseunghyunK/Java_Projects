package smilefriend.view;

import java.util.Hashtable;
import smilefriend.controller.MovieReviewController;
import smilefriend.model.dto.ConcessionStand;
import smilefriend.model.dto.ConcessionStand2;
import smilefriend.model.dto.Movie;
import smilefriend.model.dto.MovieReview;
import smilefriend.model.dto.ScreenSchedule;

public class StartView {
	
	public static void main(String[] args) {
		
		Movie movie1 = new Movie("[마동석, 손석구]", "[15세 관람가]", "[106분]", "[2022.05.18]");
		Movie movie2 = new Movie("[베네딕트 컴버배치, 엘리자베스 올슨]", "[12세 관람가]", "[126분]", "[2022.05.04]");
		Movie movie3 = new Movie("[샘 록웰, 마크 마론]", "[전체 관람가]", "[100분]", "[2022.05.04]");
		Movie movie4 = new Movie("[에디 레드메인, 주드 로, 매즈 미켈슨]", "[12세 관람가]", "[142분]", "[2022.04.13]");		
		
		ScreenSchedule screen1 = new ScreenSchedule("05월 21일", "3회", "14:10", "16:06", "SCREENX 2D" , "184석");
		ScreenSchedule screen2 = new ScreenSchedule("05월 22일", "5회", "19:05", "21:21", "IMAX 2D" , "326석");
		ScreenSchedule screen3 = new ScreenSchedule("05월 24일", "2회", "12:30", "14:20", "5관(2D)" , "174석");
		ScreenSchedule screen4 = new ScreenSchedule("05월 21일", "4회", "15:45", "18:17", "10관(Laser)" , "141석");
		ScreenSchedule screen5 = new ScreenSchedule("05월 23일", "6회", "20:50", "22:43", "1관(2D)" , "174석");
		ScreenSchedule screen6 = new ScreenSchedule("05월 25일", "1회", "10:00", "11:53", "6관(2D)" , "174석");
			
		MovieReview crimecity = new MovieReview("범죄도시2", movie1, screen1, ", CGV 인천");
		MovieReview marvel = new MovieReview("닥터 스트레인지: 대혼돈의 멀티버스", movie2, screen2, ", CGV 인천");
		MovieReview anime = new MovieReview("배드 가이즈", movie3, screen3, ", CGV 인천");
		MovieReview magic = new MovieReview("신비한 동물들과 덤블도어의 비밀", movie4, screen4, ", CGV 인천");
		
		System.out.println("*** 미소지기의 영화 소개 ***");
		MovieReviewController.movieReviewInsert(crimecity);
		MovieReviewController.movieReviewInsert(marvel);
		MovieReviewController.movieReviewInsert(anime);
		MovieReviewController.movieReviewInsert(magic);
		
		System.out.println("\n--- 현재 상영중인 영화 ---");
		MovieReviewController.getMovieList();
		
		System.out.println("\n--- 영화 검색 ---");
		MovieReviewController.getMovieReview("범죄도시2");
		
		System.out.println("\n--- 상영 정보 변경(수정) 후 검색하기 ---");
		MovieReviewController.screenInformUpdate("범죄도시2", screen5);
		MovieReviewController.getMovieReview("범죄도시2");
		
		System.out.println("\n--- 영화 삭제 후 삭제한 영화 검색 ---");
		MovieReviewController.movieDelete("범죄도시2");
		MovieReviewController.getMovieReview("범죄도시2");
		
		System.out.println("\n*** 매점 메뉴 ***");
		
		Hashtable<String, ConcessionStand2> map2 = new Hashtable<String, ConcessionStand2>();
		map2.put("CGV 콤보", new ConcessionStand2("CGV 콤보", " 9000원", " 팝콘L + 음료(M)2"));
		map2.put("더블 콤보", new ConcessionStand2("더블 콤보", " 12000원", " 팝콘(M)2 + 음료(M)2"));
		map2.put("라지 콤보", new ConcessionStand2("라지 콤보", " 14000원", " 팝콘(L)2 + 음료(L)2"));
		map2.put("스몰 세트", new ConcessionStand2("스몰 세트", " 6500원", " 팝콘M + 음료M"));
		map2.put("핫도그 콤보", new ConcessionStand2("핫도그 콤보", " 13500원", " 팝콘L + 음료(M)2 + 칠리치즈 핫도그"));
		map2.put("버터구이 오징어 콤보", new ConcessionStand2("버터구이 오징어 콤보", " 13000원", " 팝콘L + 음료(M)2 + 버터구이 오징어(몸통)"));
		
		System.out.println(map2.get("CGV 콤보"));
		System.out.println(map2.get("더블 콤보"));
		System.out.println(map2.get("라지 콤보"));
		System.out.println(map2.get("스몰 세트"));
		System.out.println(map2.get("핫도그 콤보"));
		System.out.println(map2.get("버터구이 오징어 콤보"));

		
		Hashtable<String, ConcessionStand> map = new Hashtable<String, ConcessionStand>();
		map.put("CGV 콤보", new ConcessionStand("CGV 콤보", " 10000원", "팝콘 맛 : 달콤, 음료 사이즈 M", "팝콘L + 음료(M)2"));
		map.put("더블 콤보", new ConcessionStand("더블 콤보", " 12000원", "팝콘 맛 : 고소, 음료 사이즈 M", "팝콘(M)2 + 음료(M)2"));
		map.put("라지 콤보", new ConcessionStand("라지 콤보", " 15000원", "팝콘 맛 : 반반(바질 어니언/더블 치즈)", "팝콘(L)2 + 음료(L)2"));
		map.put("스몰 세트", new ConcessionStand("스몰 세트", " 7500원", "팝콘 맛 : 더블치즈, 음료 사이즈 M", "팝콘M + 음료M"));
		map.put("핫도그 콤보", new ConcessionStand("핫도그 콤보", " 13500원", "팝콘 맛 : 달콤, 음료 사이즈 M", "팝콘L + 음료(M)2 + 칠리치즈 핫도그"));
		map.put("버터구이 오징어 콤보", new ConcessionStand("버터구이 오징어 콤보", " 13000원", "팝콘 맛 : 고소, 음료 사이즈 M1,L1", "팝콘L + 음료M + 음료L + 버터구이 오징어(몸통)"));
		
		
		System.out.println("\n*** 매점 주문 ***");
		
		System.out.println(map.get("CGV 콤보"));
	}

}
