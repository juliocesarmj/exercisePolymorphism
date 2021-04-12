package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
			
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #"+ (i+1) +" data:");
			System.out.print("Outsourced (y/n)? ");
			sc.nextLine();
			char ch = sc.next().charAt(0); // lendo 1 único caracter de entrada na variavel.
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per Hour: ");
			double valuePerHour = sc.nextDouble();
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double aditionalCharge = sc.nextDouble();
				list.add(new OutSourcedEmployee(name, hours, valuePerHour, aditionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee e : list) {
			System.out.println(e);
		}
		sc.close();

	}

}
