package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measure of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measure of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
	
		double areaX = x.area();
		double areaY = y.area();			
		
		System.out.printf("Triangulo X área %.2f%n ", areaX);
		System.out.printf("Triangulo Y área %.2f%n ", areaY);
		
		if(areaX > areaY) {
			System.out.println("área X é maior que Y");
		}
		else {
			System.out.println("area do y é maior que x");
		}
		
		sc.close();
	}

}
