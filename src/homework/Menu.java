package homework;


public class Menu {
	  private String foodname;
	  private String foodfood;
	  private int salary;
	  
	  public Menu() {}



	public Menu(String foodname, String foodfood, int salary) {
		super();
		this.foodname = foodname;
		this.foodfood = foodfood;
		this.salary = salary;
	}



	public String getFoodname() {
		return foodname;
	}



	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}



	public String getFoodfood() {
		return foodfood;
	}



	public void setFoodfood(String foodfood) {
		this.foodfood = foodfood;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "메뉴 [음식이름=" + foodname + ", 음식종류=" + foodfood + ", 가격=" + salary + "]";
	}
	 
		
	

}
