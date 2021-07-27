package day2;

import java.util.Scanner;

public class Branching {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		Integer no=sc.nextInt();
		if(no%100==0 && no%4==0) {
			System.out.println("The Year is a Century and leap Year");
		}
		else if (no%4==0) {
			System.out.println("The Year is a leap year");
		}
		else 
			System.out.println("Not a leap year");
		sc.close();
		
		
	}

}
