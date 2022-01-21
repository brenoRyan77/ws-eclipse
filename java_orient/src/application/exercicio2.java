package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employes;

public class exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employes emply = new Employes();
		
		System.out.print("Name: ");
		emply.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emply.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emply.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println();
		System.out.println("Employee: " + emply);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emply.increaseSalary(percentage);
		
		System.out.println();
		System.out.print("Update data: " + emply);
				
		
		
		sc.close();

	}

}
