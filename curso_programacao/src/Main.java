import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter your name : ");
		
		String s = sc.nextLine();
		
		String[] vect = s.split(" ");
		System.out.println(" Primeiro nome "+vect	[0]);
		System.out.println(" Segundo nome "+vect	[1]);
		System.out.println(" Terceiro nome nome "+vect	[2]);
		
		

		sc.close();
	}
	
	
}