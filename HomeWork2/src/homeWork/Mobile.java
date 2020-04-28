package homeWork;

import java.util.Scanner; 

public class Mobile {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.carrierlocationChicago();
		m.carriertMobile();
		m.coustmerservice();
	}
	public static void carriertMobile() {
		System.out.println("Mobile carrier is tmobile!");
	}
	public static void coustmerservice() {
		System.out.println("Coustmer service is great!");
	}
	public static void carrierlocationChicago() {
		System.out.println("Carrier location is in chicago!");
	}
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter price:");
	
	int n = scan.nextInt();
	
	if(n >= 500 && n <= 600) {
		System.out.println("You can buy a galaxy s9");
		
		
	} else if(n >= 700 && n <1000) {
		System.out.println("You can buy an iphone x");
	}
	}	
	} 

		
	
	

