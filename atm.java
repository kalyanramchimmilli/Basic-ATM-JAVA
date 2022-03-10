package projects;
import java.io.IOException;
import java.util.Scanner;
public class atm {
static float balance=1500;
static int anotherTransaction;
	public static void main(String[] args) throws IOException {
		transaction();
		
		
	}
	private static void transaction() {
		int choice,amountToDeposit,amountToWithdraw,pin;
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter your pin: ");
		pin=sc.nextInt();
		
		if(pin==1979) {
			System.out.println("hello! rama mohan rao welcome to SBI bank");
		}else if(pin==1985) {
			System.out.println("hello! lakshmi welcome to SBI bank");
		}else if(pin==2003) {
			System.out.println("hello! kalyan welcome to SBI bank");
		}else if(pin==2007) {
			System.out.println("hello! meghana welcome to SBI bank");
		}else {
			System.out.println("your pin is incorrect,please do try again");
			transaction();
		}
		
		System.out.println("enter your choice");
		System.out.println(">>>>1:withdraw\n");
		System.out.println(">>>>2:deposit\n");
		System.out.println(">>>>3:to check balance\n");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
		{
			System.out.println("enter amount to withdraw\n");
			amountToWithdraw=sc.nextInt();
			if(amountToWithdraw>balance) {
				System.out.println("insufficent balance in your account");
				System.out.println("\n\ndo you want another transaction?\npress 1 to continue and 2 to exit");
				anotherTransaction=sc.nextInt();
				if(anotherTransaction==1) {
					transaction();
				}
			}else {
				balance=balance-amountToWithdraw;
				System.out.println("-------------------------------------------------------------------");
				System.out.println("amount with drawn is: "+amountToWithdraw);
				System.out.println("\nyour new balance is: "+balance);
				System.out.println("\n\ndo you want another transaction?\npress 1 to continue and 2 to exit");
				anotherTransaction=sc.nextInt();
				if(anotherTransaction==1) {
					transaction();
				}
				
			}
		}
		break;
		case 2:
		{
			System.out.println("-------------------------------------------------------------");
			System.out.println("enter amount to deposit: ");
			amountToDeposit=sc.nextInt();
			balance=balance+amountToDeposit;
			System.out.println("your amount is succesfull desposited to your account ");
			System.out.println("\nyour new balance is: "+balance);
			System.out.println("\n\ndo you want another transaction?\npress 1 to continue and 2 to exit");
			anotherTransaction=sc.nextInt();
			if(anotherTransaction==1) {
				transaction();
			}
		}
			break;
		case 3:
		{
			System.out.println("-------------------------------------------------------------");
			System.out.println("your current balance in your account is : "+balance);
			System.out.println("\n\ndo you want another transaction?\npress 1 to continue and 2 to exit");
			anotherTransaction=sc.nextInt();
			if(anotherTransaction==1) {
				transaction();
			}
			
		}
		break;
		}
	}

}
