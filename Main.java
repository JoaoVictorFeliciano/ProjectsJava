package meu.projeto;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		String product = "Computer";
		String product1 = "Table";
		int age = 31;
		int code = 3109;
		char gender = 'F';
		
		double price = 2100.0;
		double price1 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products");
		System.out.printf("%s which price is %.2f%n",product, price);
		System.out.printf("%s which price is %.2f%n", product1, price1);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %f%n",measure);
		System.out.printf("Rouded (three decimal places): %.3f%n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n",measure);
	
		
	}

}
