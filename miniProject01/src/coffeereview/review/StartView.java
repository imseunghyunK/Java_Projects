package coffeereview.review;

import coffeereview.controller.CafeReviewController;
import coffeereview.view.model.dto.CoffeeMenu;

public class StartView {

	public static void main(String[] args) {
		
	CoffeeMenu coffeeMenu1 = new CoffeeMenu("아메리카노", 3000, "휘핑 X");
	CoffeeMenu coffeeMenu2 = new CoffeeMenu("카페라떼", 4500, "휘핑 0");
	CoffeeMenu coffeeMenu3 = new CoffeeMenu("에스프레소", 2500, "휘핑 X");
	
	System.out.println("----!!!!커피 사세요!!!----");
	CafeReviewController.coffeeMenuInsert(coffeeMenu1);
	CafeReviewController.coffeeMenuInsert(coffeeMenu2);
	CafeReviewController.coffeeMenuInsert(coffeeMenu3);
	
	System.out.println("----커피 메뉴----");
	CafeReviewController.getCoffeeMenuList();
	
	System.out.println("----커피 검색----");
	CafeReviewController.getCoffeeMenu("아메리카노");
	
	System.out.println("----메뉴 삭제----");
	CafeReviewController.coffeeMenuDelete("에스프레소");
	}
}
