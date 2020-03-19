package lesson25;

public class LegalSecretary extends Employee {
	
	public LegalSecretary(int years) {
		super(years);
	}
	
	public void fileLegalBriefs() {
		System.out.println("filing briefs");
	}

	public double getSalary() {
		return super.getSalary() + 5000;
	}
}
