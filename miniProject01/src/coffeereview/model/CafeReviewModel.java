package coffeereview.model;

import java.util.ArrayList;

import coffeereview.exception.NotFoundCoffeeException;
import coffeereview.view.model.dto.CoffeeMenu;

public class CafeReviewModel {
	
	private static CafeReviewModel instance = new CafeReviewModel();
	
	private ArrayList<CoffeeMenu> menuList = new ArrayList<CoffeeMenu>();
	
	private CafeReviewModel() {}
	
	public static CafeReviewModel getInstance() {
		return instance;
	}
	
	public ArrayList<CoffeeMenu> getMenusList() {
		return menuList;
	}
	
	public CoffeeMenu getMenu(String coffeeName) throws NotFoundCoffeeException{
		
		for(CoffeeMenu cm : menuList) {
			if(cm.getEname().equals(coffeeName)) {
				return cm;
			}
		}
		throw new NotFoundCoffeeException("고객님 검색하는 coffee는 미존재합니다.");
	}
	
	public void coffeeMenuInsert(CoffeeMenu menu) {
		menuList.add(menu);
	}
	
	public void coffeeMenuDelete(String coffeeName) throws NotFoundCoffeeException{
		
		for(CoffeeMenu name : menuList) {
			if(name.getEname().equals(coffeeName)) {
				menuList.remove(name);
				return;
			}
		}
	
		throw new NotFoundCoffeeException(coffeeName + "삭제하려는 Coffee는 미 존재합니다.");
	}
	
	public int menuListSize() {
		return menuList.size();
	}
	
}
