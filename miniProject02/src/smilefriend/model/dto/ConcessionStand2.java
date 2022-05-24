package smilefriend.model.dto;

public class ConcessionStand2 {
	
	private String ename;
	
	private String price;
	
	private String composition;
	
	public ConcessionStand2 () {}
	
	public ConcessionStand2 (String ename, String price, String composition) {
		super();
		
		this.ename = ename;
		this.price = price;
		this.composition = composition;	
	}	

	public String getEname() {
		return ename;
	}
	
	public void setNeEname(String ename) {
		this.ename = ename;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
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
		builder.append("메뉴 : ");
		builder.append(ename);
		builder.append(", 가격 :");
		builder.append(price);
		builder.append(", 메뉴 구성");
		builder.append(composition);
		return builder.toString();
				
	}
}
