package day2;

public class Execute {

	 public static void main(String[] args)

	 {

	         ICICIBank ic1=new ICICIBank();

	         ic1.setDetails();

	         ic1.deposit();

	         ic1.withdraw();

	         ic1.display();

	 }
}
	 
	 class Bank

	 {

	      String bankCode;

	      String bankName;

	      void deposit()

	      {

	          System.out.println("Deposit Money");

	      }

	      void withdraw()

	      {

	          System.out.println("Withdraw Money");

	      }

	 }
	 
	 class ICICIBank  extends Bank

	 {

	     //    double intersertrate=10.7;


	         void setDetails()

	         {

	             bankCode="B001";

	             bankName="ICICI";

	         }

	          void deposit() // Overriding

	          {

	              System.out.println("Deposit Money in ICICI");

	          }

	         void display()

	         {

	             System.out.println("ID "+bankCode+" Name "+bankName);

	         }

	 }


