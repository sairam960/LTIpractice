package day2;

import java.util.Scanner;

public class incNum {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char ch;
		int max=0;
		String str="No";
		int n;
		System.out.println("Enter the number");
		String number=scan.next();
		
		for(int i=0; i<number.length(); i++) {
	         
	         ch = number.charAt(i);
	         
             n = Character.getNumericValue(ch) ;
             if(n>=max) {
            	 max=n;
            	 str="Yes";
             }
             else {
            	 str="No";
             	break;
             }
		}
		
		System.out.println(str);
		scan.close();
		
	}


}