package ui;
import java.util.Scanner;

import service.*;

public class UiTest {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Rbi bank=new Hdfc();
		String ans="";
		
		do
		{
			
			System.out.println("Please enter your choice");
			System.out.println("1.Create\n2.Display\n3.Deposit\n4.Withdraw\n5.Balance");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
					bank.createAccount();
					break;
				case 2:
					bank.displayAllDetails();
					break;
				case 3:
					bank.depositeMoney();
					break;
				case 4:
					bank.withdrawal();
					break;
				case 5:
					bank.balanceCheck();
					break;
				default:
					System.out.println("Enter a valid choice");
					break;
			}
			System.out.println("Do you want to continue?(y/n)");
			ans=s.next();
		}while(ans.equalsIgnoreCase("Y"));
		
	}
}
