 package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Account account;
		
		
		System.out.print("Enter account number: ");
		int number = input.nextInt();
		System.out.print("Enter account holder: ");
		input.nextLine();
		String holder = input.nextLine();
		System.out.print("Is there an initial  deposit ? (y/n) ");
		char response = input.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("what is your deposit ?");
			double initialDeposit =  input.nextDouble();
			 account =  new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = input.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.println("Enter a withdraw is value: ");
		double withDrawValue = input.nextDouble();
		account.withdraw(withDrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		System.out.println();
		
		
		
		
		input.close();
	}

}
