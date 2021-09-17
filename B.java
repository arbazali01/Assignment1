package assignment1;

import java.util.Scanner;

public class B {


	
	public void add(int a , int b) {

		
		int sum = a + b;
		System.out.println("Addition of two given values is: " + sum);
	}
	
	
	public static void add() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("Addition of two given values is: " + sum);
	}
	
}
