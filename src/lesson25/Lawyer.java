package lesson25;

public class Lawyer extends Employee {
	
	public void sue(String name) {
		System.out.println("Suing "+name);
	}
	
	public int getVacationDays(){
		return (super.getVacationDays() + 5);
	}
	
	public String getVacationForm(){
		return "pink";
	}

}
