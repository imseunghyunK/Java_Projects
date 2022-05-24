package coffeereview.view.model.dto;

public class CoffeeMenu {	
	/** 커피 이름 */
	private String ename;
	
	/** 커피 가격 */
	private int empno;
	
	/** 휘핑크림 유무 */
	private String ecream;
	
	public CoffeeMenu () {}
	
	public CoffeeMenu(String ename, int empno, String ecream) {
		super();
		this.ename = ename;
		this.empno = empno;
		this.ecream = ecream;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int getEmpno() {
		return empno;
	}
	
	public void setEname(int empno) {
		this.empno = empno;
	}
	
	public String getEcream() {
	
		return ecream;
	}
	
	public void setEcream(String ecream) {
		this.ecream = ecream;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("커피 이름 : ");
		builder.append(ename);
		builder.append(", 가격 : ");
		builder.append(empno);
		builder.append(", 휘핑 유무 : ");
		builder.append(ecream);
		return builder.toString();
	}
}
