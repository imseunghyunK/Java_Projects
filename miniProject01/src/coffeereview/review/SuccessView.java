package coffeereview.review;

import java.util.ArrayList;

import coffeereview.view.model.dto.CoffeeMenu;

public class SuccessView {
	
	public static void menuView(CoffeeMenu menu) {
		if(menu != null) {
			System.out.println(menu);
		}else {
			System.out.println("해당 커피는 존재하지 않습니다.");
		}
	}

	public static void menuListView(ArrayList<CoffeeMenu> allcafereviewmenu) {
		int index = 0;
		for(CoffeeMenu menu : allcafereviewmenu) {
			System.out.println("[커피 메뉴" + (index+1) + "]" + menu.toString());
			index++;
		}
	}
	
	public static void successMessage(String successMessage) {
		System.out.println("진행상황 : " + successMessage);
	}
}
