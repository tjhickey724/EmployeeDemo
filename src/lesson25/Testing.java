package lesson25;

public class Testing {

	public Testing() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Employee chad = new Employee(1);
		printInfo("chad",chad);
		
		Secretary joe = new Secretary(13);
		printInfo("joe",joe);
		joe.takeDictation("Write me a letter...");
		
		LegalSecretary joey = new LegalSecretary(7);
		printInfo("joey",joey);
		//joey.takeDictation("Write me a letter...");
		joey.fileLegalBriefs();
		
		Lawyer yasuko = new Lawyer(4);
		printInfo("yasuko",yasuko);
		yasuko.sue("Tim Hickey");
		
		Marketer caitlin = new Marketer(5);
		printInfo("caitlin",caitlin);
		caitlin.advertise();
			}
	
	public static void printInfo(String name,Employee e) {
		System.out.println(name+" has " + e.getHours() + " hours of work per week.");
		System.out.println(name+" has a salary of " + e.getSalary() + ".");
		System.out.println(name+" has " + e.getVacationDays() + " vacations days.");
		System.out.println(name+" vacation day form is " + e.getVacationForm() + ".");

	}

}
