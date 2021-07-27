package day2;

public class q3 {
	
	public static void main(String[] args) {
		
		String pat=new String();
		pat="A001";
		
		int no=pat.charAt(3)-'0';
		
		for (int i=0;i<5;i++) {
			System.out.println("A00"+(no+i));
		}
		
	}

}
