package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("How many tax payers will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Is this a company or a individual? c/i");
			char ch = sc.next().charAt(0);
			if (ch == 'c') {
				System.out.print("Please type company name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Type the company's annual income:");
				Double annualIncome = sc.nextDouble();
				System.out.print("How many employees are registered in the company? ");
				int employeesNumber = sc.nextInt();

				list.add(new Company(name, annualIncome, employeesNumber));
				System.out.println("Registered: " + name + " - " + annualIncome + " - " + employeesNumber);

			} else {
				sc.nextLine();
				System.out.print("Please type person's name: ");
				String name = sc.nextLine();
				System.out.println("Type the person's annual income:");
				Double annualIncome = sc.nextDouble();
				System.out.print("Type person's health expenditures - If none, type 0:");
				Double healthExpenditures = sc.nextDouble();

				list.add(new Individual(name, annualIncome, healthExpenditures));
				System.out.println("Registered: " + name + " - " + annualIncome + " - " + healthExpenditures);

			}
			
		}
		for (TaxPayer t : list) {
			System.out.println(t.calculateTax());
		}

		sc.close();
	}
}