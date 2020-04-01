package lesson25;

public class Testing {

	public Testing() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Employee chad = new Marketer(1);
		printInfo("chad",chad);
		
		Secretary joe = new LegalSecretary(13);
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
		
		Employee[] staff = {chad,joe,joey, yasuko,caitlin};
		printStaff(staff);
		
	}
	
	public static void printStaff(Employee[] staff) {
		System.out.println("The staff is:");
		System.out.printf("%20s %10s%n","title","salary");
		for(Employee person: staff) {
			System.out.printf("%20s %10.2f%n", 
					person.getTitle(),person.getSalary());
		}
	}
	
	public static void printInfo(String name,Employee e) {
		System.out.println("\n Info on employee "+e);
		System.out.println(name+" has " + e.getHours() + " hours of work per week.");
		System.out.println(name+" has a salary of " + e.getSalary() + ".");
		System.out.println(name+" has " + e.getVacationDays() + " vacations days.");
		System.out.println(name+" vacation day form is " + e.getVacationForm() + ".");
		System.out.println(e.getTitle());
	}

}
