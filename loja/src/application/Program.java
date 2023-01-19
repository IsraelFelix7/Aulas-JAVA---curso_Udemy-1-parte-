package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Date date = new Date();

		System.out.println("Enter product data:  " + date);
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);

		product.setName("Computer");
		
		System.out.println("Update product: " + product.getName());
		product.setPrice(1200.00);
		
		System.out.println("Update product: " + product.getPrice());
		
		System.out.println("Quantity : " + product.getQuantity());

		System.out.println();
		System.out.println("  Product data: " + product);
		System.out.println();

		System.out.println(" Enter the number of products  to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("  Updated data: " + product);
		System.out.println();

		System.out.println(" Enter the number of products  to be remove from  stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("  Remove data: " + product);
		System.out.println();

		sc.close();

	}

}
