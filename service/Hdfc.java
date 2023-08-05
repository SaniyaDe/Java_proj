package service;
import model.Account;
import java.util.Scanner;

public class Hdfc implements Rbi{
	Scanner s=new Scanner(System.in);
	Account a=new Account();
	public void createAccount()
	{
		
		System.out.println("Create account");
		System.out.println("Please enter the account number:");
		int acc_No=s.nextInt();
		a.setAccNo(acc_No);
		
		//////////////////////////////////////////
		
		System.out.println("Please enter your name");
		String name_1=s.next();
		s.nextLine();
		a.setName(name_1);
		
		//////////////////////////////////////////
		
		System.out.println("Please enter your mobile number");
		String mob_no=s.next();
		System.out.println(s.nextLine());
		a.setMobNo(mob_no);
		
		//////////////////////////////////////////
		
		System.out.println("Please enter your adhar number");
		String adhar_no=s.next();
		System.out.println(s.nextLine());
		a.setAdharNo(adhar_no);
		
		//////////////////////////////////////////
		
		System.out.println("Please enter your gender");
		String gender_1=s.next();
		System.out.println(s.nextLine());
		a.setGender(gender_1);
		
		//////////////////////////////////////////
		
		System.out.println("Please enter your age");
		int age_1=s.nextInt();
		a.setAge(age_1);
	}
	
	public void displayAllDetails()
	{
		System.out.println("The account number is: "+a.getAccNo());
		System.out.println("The name is: "+a.getName());
		System.out.println("The mobile number is: "+a.getMobNo());
		System.out.println("The adhar number is: "+a.getAdharNo());
		System.out.println("The gender is: "+a.getGender());
		System.out.println("The age is: "+a.getAge());
		System.out.println("The balance is: "+a.getBalance());
	}
	public void depositeMoney()
	{
		System.out.println("Enter the amount of money you wish to deposit: ");
		double depositMoney=s.nextInt();
		double afterDeposit=a.getBalance()+depositMoney;
		a.setBalance(afterDeposit);
		
	}
	public void withdrawal()
	{
		System.out.println("Enter the amount of money you wish to withdraw: ");
		double withdrawMoney=s.nextInt();
//		System.out.println("Balance before withdrawing is: "+a.getBalance());
		double remaining=a.getBalance()-withdrawMoney;
		a.setBalance(remaining);
//		System.out.println("balance after withdrawing is: "+remaining);
	}
	public void balanceCheck()
	{
		System.out.println("Current balance is: "+a.getBalance());
	}
}
