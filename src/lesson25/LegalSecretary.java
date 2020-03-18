package lesson25;

public class LegalSecretary extends Secretary {
	
	public void fileLegalBriefs() {
		System.out.println("filing briefs");
	}

	public double getSalary() {
		return super.getSalary() + 5000;
	}
}
