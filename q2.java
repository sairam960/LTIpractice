package day2;

import java.util.Scanner;

public class q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the two integers followed by the arithmetic operator");
		int a= sc.nextInt();
		int b=sc.nextInt();
		String c=sc.next();
		
		switch (c) {
		case "+":
			System.out.println("The Sum of two Integers is "+(a+b));
			break;
		case "-":
			System.out.println("The Difference of two Integers is"+(a-b));
			break;
		case "/":
			System.out.println("The Division of two Integers is "+(a/b));
			break;
		case "*":
			System.out.println("The Multiplication of two Integers is "+(a*b));
			break;
		default:
			System.out.println("Invalid operator");
		sc.close();
		
		}
		}

}
