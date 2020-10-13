package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

/*
 * Nessa classe iremos ter um comportamento de POLIMORFISMO onde 
 * na instancia de TaxPayer terei dois comportamentos, onde se chamada do TaxPayer for Individual o 
 * imposto é caçculado de uma forma e se for company o um posto será calculado de outra forma.
 */

public class Program {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of taxpayers: ");
		int n = sc.nextInt();
		
		//lista do tipo generico aceita todos os outros tipos 
		List <TaxPayer> list = new ArrayList<>();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Tax Payer: "+i+" Data");
			System.out.print("Individuol or Company (i/c)");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualincome = sc.nextDouble();
			
			if (type =='i') {
				System.out.print("Health expenditures: ");
				double healthExpenditure = sc.nextDouble();
				list.add(new Individual(name, anualincome, healthExpenditure));
				
			}
			else {
				System.out.print("Number of employess");
				Integer numberOfEmployess = sc.nextInt();
				list.add(new Company(name, anualincome, numberOfEmployess ));
			}
		}
		System.out.println();
		System.out.println("TAX PAID: ");
		for(TaxPayer tp : list) {
			
			System.out.println(tp.getName()+": $"+String.format("%.2f",tp.tax()));
		}
		double sum = 0.0;
		for(TaxPayer tp : list) {
			sum += tp.tax();
		}
		System.out.println();
		System.out.println("Total TAX: "+ String.format("%.2f", sum));
		
		
		
	}

}
