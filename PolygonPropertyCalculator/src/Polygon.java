import java.util.Scanner;

public class Polygon {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to the Polygonal Property Calculator!");
		System.out.println();
		System.out.print("Enter your first name:\t\t\t");
		String firstName = in.next();
		System.out.print("Enter your last name:\t\t\t");
		String lastName = in.next();
		System.out.print("Enter the sides the property has:\t");
		int propertySides = in.nextInt();
		System.out.print("Enter side length in meters:\t\t");
		double sideLength = in.nextDouble();
		System.out.print("Enter property cost per square meter:\t$");
		double propertyCost = in.nextDouble();
		System.out.print("Enter fence cost per meter:\t\t$");
		double fenceCost = in.nextDouble();
		
		//Getting initial from firstName
		char firstInitial = firstName.charAt(0);
		
		System.out.println();
		System.out.println("Property Information for " + firstInitial + ". " + lastName);
		System.out.println("****************************************************************");
		
		//Calculating Apothem
		double degreesToRadians = Math.toRadians(180);
		double tan = Math.tan(degreesToRadians/propertySides);
		double apothem = (0.5 * sideLength) * (1/tan);
		
		double area = (0.5 * propertySides) * sideLength*apothem;
		double perimeter = propertySides * sideLength;
		double angle = 180.0 * (propertySides - 2)/propertySides;
		
		double landCost = area * propertyCost;
		double totalFenceCost = perimeter * fenceCost;
		double totalCost = landCost + totalFenceCost;
		
		System.out.format("Total area:\t\t\t\t%.3f", area);
		System.out.println(" square meters");
		System.out.format("Total perimeter:\t\t\t%.3f", perimeter);
		System.out.println(" meters");
		System.out.format("Length of apothem:\t\t\t%.3f", apothem);
		System.out.println(" meters");
		System.out.format("Interior angle:\t\t\t\t%.3f", angle);
		System.out.println(" degrees");
		System.out.format("Cost of land:\t\t\t\t$%.2f", landCost);
		System.out.println();
		System.out.format("Cost of fencing:\t\t\t$%.2f", totalFenceCost);
		System.out.println();
		System.out.format("Total Cost:\t\t\t\t$%.2f", totalCost);
		
		System.out.println();
		System.out.println();
		System.out.println("Loan Information");
		System.out.println("****************************************************************");
		System.out.print("Enter annual interest rate:\t\t");
		double interestRate = in.nextDouble();
		System.out.print("Enter the length of loan in years:\t");
		int loanYears = in.nextInt();
		
		double costWithInterest = totalCost * Math.pow(1 + interestRate, loanYears);
		
		System.out.format("Total cost with interest:\t\t$%.2f", costWithInterest);
		
		in.close();
	}
}
