
import com.archana.assignment.employe.*;
import com.archana.assignment.utilities.EmployeeUtilities;
public class AssignmentMain {
	public static void main(String[] args) {
      
        Manager manager = new Manager();
        manager.setEmployeeId(101);
        manager.setName("Alice");
        manager.setSalary(85000);
        manager.setDepartment("IT");

        
        Developer developer = new Developer();
        developer.setEmployeeId(102);
        developer.setName("Bob");
        developer.setSalary(75000);
        developer.setProgrammingLanguage("Java");

        
        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }


}
