package homeWork;

import java.util.Scanner;

public class Pizza {
	
	public static void main(String[] args) {
		Pizza p = new Pizza();
		p.puttoppingOn();
		p.chooseyourtoppictoputOn();
		p.pizzasizeMedium();
		
		}
	
	public static void pizzasizeMedium() {
		System.out.println("Pizza size is medium");
	}
	
	public static void puttoppingOn() {
		System.out.println("Topping is on!");
	}
	
	public static void chooseyourtoppictoputOn() {
		System.out.println("Cheese and peperoni is on");
	}
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many inches:");
		
		int n = scan.nextInt();
		
		if(n >= 6 && n <= 12) {
			System.out.println("You can buy a 14inch pizza");
			
		} else if(n >= 14 && n <16) {
			System.out.println("You can buy a 18inch pizza");
		}
		}	
}

