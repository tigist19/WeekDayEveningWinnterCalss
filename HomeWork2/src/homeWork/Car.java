package homeWork;

import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		Car c = new Car();
		c.carCompany();
		c.cartype();
		c.copmanyLocation();

	}
	public static void carCompany() {
		System.out.println("Car company is toyota!");
	}
	public static void cartype() {
		System.out.println("Car type is four door!");
	}
	public static void copmanyLocation() {
		System.out.println("Company location is in downtown denver!");
		
	}
	{Scanner scan = new Scanner(System.in);
	System.out.println("Enter price:");
	
	int n = scan.nextInt();
	
	if(n >= 12000 && n <= 15000) {
		System.out.println("You can buy a toyota corola!");
		
		
	} else if(n >= 18000 && n <20000) {
		System.out.println("You can buy a yaris");
	}
		
	}
}

