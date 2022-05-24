package smilefriend.model.dto;

public class ConcessionStand {
	
	private String name;
	
	private String price;
	
	private String choose;
	
	private String composition;
	
	public ConcessionStand () {}
	
	public ConcessionStand (String name, String price, String choose, String composition) {
		super();
		
		this.name = name;
		this.price = price;
		this.choose = choose;
		this.composition = composition;	
	}	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getChoose() {
		return choose;
	}
	
	public void setChoose(String choose) {
		this.choose = choose;
	}
	
	public String getComposition() {
		return composition;
	}
	
	public void setComposition(String composition) {
		this.composition = composition;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("주문 메뉴 : ");
		builder.append(name);
		builder.append(", 가격 :");
		builder.append(price);
		builder.append(", 맛(사이즈) 선택 : ");
		builder.append(choose);
		builder.append(", 메뉴 구성");
		builder.append(composition);
		return builder.toString();
				
	}
}
