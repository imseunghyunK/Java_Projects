package coffeereview.controller;

import java.util.ArrayList;

import com.sun.net.httpserver.Authenticator.Success;

import coffeereview.exception.NotFoundCoffeeException;
import coffeereview.model.CafeReviewModel;
import coffeereview.review.FailView;
import coffeereview.review.SuccessView;
import coffeereview.view.model.dto.CoffeeMenu;

public class CafeReviewController {

	private static CafeReviewModel service = CafeReviewModel.getInstance();
	
	public static void getCoffeeMenuList() {
		ArrayList<CoffeeMenu> menus = service.getMenusList();
		
		if(menus.size() != 0) {
			SuccessView.menuListView(menus);
		}else {
			FailView.printFail("검색하신 Coffee는 없습니다");			
		}
	}
	
	public static void getCoffeeMenu(String coffeeName) {
		try {
			SuccessView.menuView(service.getMenu(coffeeName));
		} catch (NotFoundCoffeeException e) {
			e.printStackTrace();
			FailView.printFail(e.getMessage());
		}
	}

	public static void coffeeMenuInsert(CoffeeMenu menu) {
		if(menu != null) {
			service.coffeeMenuInsert(menu);
		}else {
			FailView.printFail("입력 정보가 유효하지 않으니 재 확인해 주세요");
		}
	}

	public static void coffeeMenuDelete(String coffeeName) {
		
		if(coffeeName != null) {
			
			try {
				service.coffeeMenuDelete(coffeeName);
				SuccessView.successMessage(coffeeName + " " + "삭제 성공");
			}catch(NotFoundCoffeeException e) {
				e.printStackTrace();
				FailView.printFail(e.getMessage());
			}
			}
		}
	}

