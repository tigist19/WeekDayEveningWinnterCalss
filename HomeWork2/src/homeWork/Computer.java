package homeWork;

import java.util.Scanner;

public class Computer {

	public static void main(String[] args) {
		Computer c = new Computer();
		c.computerType();
		c.computerColor();
		c.copmanyLocation();
		
	}
	public static void computerType() {
		System.out.println("Computer brand is Dell or Hp!");
	}
	public static void computerColor() {
		System.out.println("Computer color is rainbow!");
	}
	public static void copmanyLocation() {
		System.out.println("Company location is in ohio!");
		
	}
	{Scanner scan = new Scanner(System.in);
	System.out.println("Enter price:");
	
	int n = scan.nextInt();
	
	if(n >= 300 && n <= 450) {
		System.out.println("You can buy a new dell laptop!");
		
		
	} else if(n >= 500 && n <700) {
		System.out.println("You can buy a new Hp laptop");
	}
	}
}

