import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		/*
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble(); 
		System.out.println(rectangle);
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to increase salary? ");
		
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
			
		System.out.println("Updated data: " + employee);
		
	
		sc.close();
	}
	
}
		
		
		
